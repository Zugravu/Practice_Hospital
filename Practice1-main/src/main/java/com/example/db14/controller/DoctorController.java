package com.example.db14.controller;

import com.example.db14.dto.PatientDto;
import com.example.db14.exceptions.NoDoctorException;
import com.example.db14.model.Doctor;
import com.example.db14.model.Specialty;
import com.example.db14.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("/doctors/all")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PostMapping(path="/doctors/add_patient/{doctorId}/{patientId}")
    public void assignPatient(@PathVariable("doctorId")Integer doctorId, @PathVariable("patientId") Integer patientId) throws NoDoctorException {
        doctorService.assignPatient(doctorId, patientId);
    }

    @GetMapping("/doctors/all?specialty={specialty}")
    public List<Doctor> getAllBySpecialty(@RequestParam Specialty specialty){
        return doctorService.getAllBySpecialty(specialty);
    }

    @PostMapping(path="/doctors/add")
    public void addDoctor(@RequestBody Doctor doctor) {
        doctorService.addDoctor(doctor);
    }
}
