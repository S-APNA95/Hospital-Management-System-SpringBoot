package com.hospitalmanagementsystem.Hospital.Management.System.service;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Doctor;
import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
    public class HospitalService {
    //service layer is used to invoke repository layer
    @Autowired
    HospitalRepository hospitalRepository ;

    // Constructor to initialize the service with a repository


    // Retrieve a list of all hospitals
    public List<Hospital> getAllHospital(){
        return hospitalRepository.getAllHospital();
    }
    // Register a new hospital

    public void registerHospital(Hospital h){
        h.setHospitalId(UUID.randomUUID());
        hospitalRepository.registerHospital(h);
    }
    public Hospital getHospitalById(UUID id){
        return hospitalRepository.getHospitalById(id);
    }


    //getting doctor with minimumNumber of patients
    public Doctor getMinimumPatientDoctorInHospital (UUID hospitalId){
        Hospital obj = hospitalRepository.getHospitalById(hospitalId);
        List<Doctor> doctors = obj.getDoctor();
        Doctor minDoctor = null;
        int min = Integer.MAX_VALUE;
        for(Doctor doc: doctors){
            if (min > doc.getPatients().size()) {
                min =doc.getPatients().size();
                minDoctor = doc;
            }
        }
        return minDoctor;



    }
}
