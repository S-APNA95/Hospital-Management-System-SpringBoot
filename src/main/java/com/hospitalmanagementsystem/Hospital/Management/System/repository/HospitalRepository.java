package com.hospitalmanagementsystem.Hospital.Management.System.repository;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class HospitalRepository {
    //ID VS HOSPITAL OBJECTS
    // all the hospital related database will be performed here

    HashMap<UUID, Hospital> hospitalDB;

    public HospitalRepository() {
        this.hospitalDB = new HashMap<>();
    }
    public List<Hospital> getAllHospital(){
        List<Hospital> hospitals = new ArrayList<>();
        for(UUID id : hospitalDB.keySet()){
        Hospital h = hospitalDB.get(id);
        hospitals.add(h);
        }
        return hospitals;
    }

    public void registerHospital(Hospital h){
        UUID id = h.getHospitalId();
        hospitalDB.put(id, h);
    }


}
