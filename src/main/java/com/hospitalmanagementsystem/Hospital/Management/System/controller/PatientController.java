package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Patient;
import com.hospitalmanagementsystem.Hospital.Management.System.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @PostMapping("/register")
    public String registerPatient (@RequestBody Patient obj){
        patientService.register(obj);
        return "Patient Got registered Successfully";
    }
    // http://localHost:8088/patient/5/details
    @GetMapping("/{pid}/details")
    public Patient getPatientById(@PathVariable UUID pid) {
        Patient p = patientService.getPatientById(pid);
        return p;
    }
}
