package com.example.db14.controller;

import com.example.db14.model.Doctor;
import com.example.db14.model.Patient;
import com.example.db14.repository.DoctorRepository;
import com.example.db14.repository.PatientRepository;
import com.example.db14.service.DoctorService;
import com.example.db14.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping("/patients/all") // display all patients
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    @GetMapping("/patients/all/by_doctor/{doctorId}")
    public List<Patient> getAllPatientsByDoctor(@PathVariable("doctorId")Integer doctorId){
        return patientService.getAllByDoctor(patientService.getDoctorById(doctorId));
    }

    @PostMapping("/patients/add")
    public void savePatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
    }

    @GetMapping("/patients/{cnp}") // display patient by CNP
    public Patient getPatientByCnp(@PathVariable String cnp){
        return patientService.getByCnp(cnp);
    }



}

