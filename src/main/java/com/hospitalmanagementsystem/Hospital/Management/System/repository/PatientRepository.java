package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class PatientRepository {
    HashMap<UUID, Patient > PatientDb = new HashMap<>();

    public void registerPatient (Patient obj){
        UUID id = obj.getPatientId();
        PatientDb.put(id, obj);
    }
    public Patient getPatientById(UUID id){
        return PatientDb.get(id);
    }
    public void updatePatientStatusToFalse(UUID id){
        PatientDb.get(id).setAdmit(false);
    }


}
