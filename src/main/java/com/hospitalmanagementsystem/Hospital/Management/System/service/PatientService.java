package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Bed;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PatientService {
    @Autowired
    BedService bedService;
    @Autowired
    HospitalService hospitalService;
    @Autowired
    PatientRepository patientRepository;
    public void register(Patient obj){
        // 1. generate UUID for the patient
        UUID id =UUID.randomUUID();
        obj.setPatientId(id);

        //2 .get doctor who is handling minimum no. of patients in that particular hospital

        Doctor doctor = hospitalService.getMinimumPatientDoctorInHospital(obj.getHospitalId());

        obj.setDocId(doctor.getDocId());
        doctor.getPatients().add(obj);


        // 3 .get unoccupied bed
         Bed bed =  bedService.getUnOccupiedBedInHospital(obj.getHospitalId());
        obj.setBedId(bed.getBedId());
        //4 . set status for the bed with the docId and patient id
        bed.setBooked(true);
        bed.setPatient(obj.getBedId());
        bed.setDoctor(doctor.getDocId());

        // 5 . save patient to database
        patientRepository.registerPatient(obj);

    }
    public Patient getPatientById(UUID pid){
        return patientRepository.getPatientById(pid);
    }

}
