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
    UUID doctorId;
    List<Doctor> doctors;
    String emailId;

    public Patient(UUID patientId, String name, String address, String disease, Long contactNo, UUID doctorId, List<Doctor> doctors, String emailId) {
        this.patientId = patientId;
        this.name = name;
        this.address = address;
        this.disease = disease;
        this.contactNo = contactNo;
        this.doctorId = doctorId;
        this.doctors = new ArrayList<>();
        this.emailId = emailId;
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

    public UUID getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(UUID doctorId) {
        this.doctorId = doctorId;
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
}
