package com.hospitalmanagementsystem.Hospital.Management.System.controller;

import com.hospitalmanagementsystem.Hospital.Management.System.models.Hospital;
import com.hospitalmanagementsystem.Hospital.Management.System.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/hospital")    //base URL
public class HospitalController {
    @Autowired
    HospitalService hospitalService;
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



    // if @RequestParam annotaion is used then always pass hospitalid
    //if @RequestParam annotaion is not used it will be optional , either you can pass it or not not compulsive
    @GetMapping("")
    public Hospital getHospitalById(@RequestParam UUID hospitalId){
        return hospitalService.getHospitalById(hospitalId);

    }

}


