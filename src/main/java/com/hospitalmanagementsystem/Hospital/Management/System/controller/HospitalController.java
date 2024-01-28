package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/hospital")    //base URL
public class HospitalController {
    HospitalService hospitalService = new HospitalService();
    // https://localhost:8088/hospital/getAllHospital  --> getMethod

    @GetMapping("/getAllHospital")
        public  List<Hospital> getAllHospital(){
            return hospitalService.getAllHospital();
        }

    @PostMapping("/register")
    public String registerHospital(@RequestBody Hospital obj){
        hospitalService.registerHospital(obj);
        return "Hospital Added Successfully";
    }


}


