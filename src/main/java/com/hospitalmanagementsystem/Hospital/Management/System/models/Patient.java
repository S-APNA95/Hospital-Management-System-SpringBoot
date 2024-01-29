package com.hospitalmanagementsystem.Hospital.Management.System.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Patient {
    UUID patientId;
    String name;
    String address;
    String disease;
    Long contactNo;
    UUID docId;
    UUID hospitalId;
    List<Doctor> doctors;
    String emailId;
    Boolean isAdmit;
    UUID bedId;

    public Patient(UUID patientId, String name, String address, String disease, Long contactNo, UUID docId,UUID hospitalId, List<Doctor> doctors, String emailId, UUID bedId) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
        this.disease = disease;
        this.contactNo = contactNo;
        this.docId = docId;
        this.hospitalId = hospitalId;
        this.doctors = new ArrayList<>();
        this.emailId = emailId;
        this.isAdmit = true;
        this.bedId = bedId;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public UUID getDocId() {
        return docId;
    }

    public UUID getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(UUID hospitalId) {
        this.hospitalId = hospitalId;
    }

    public void setDocId(UUID doctorId) {
        this.docId = docId;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Boolean getAdmit() {
        return isAdmit;
    }
    public UUID getBedId() {
        return bedId;
    }

    public void setBedId(UUID bedId) {
        this.bedId = bedId;
    }

    public void setAdmit(Boolean admit) {
        isAdmit = admit;

    }




    }

