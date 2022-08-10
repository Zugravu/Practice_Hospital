package com.example.db14.controller;

import com.example.db14.model.Specialty;
import com.example.db14.model.Visit;
import com.example.db14.service.VisitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VisitController {
    private final VisitService visitService;

    @GetMapping("/visits/all") // displays all visits
    public List<Visit> getAllVisits(){
        return visitService.getAllVisits();
    }

    @GetMapping("/visits/cnp/{cnp}") // displays all visits of patient by cnp
    public List<Visit> getAllVisitsByCnp(@PathVariable String cnp){
        return visitService.getVisitsByCnp(cnp);
    }

    @GetMapping("/visits/specialty/{specialty}") // displays all doctors by speciality
    public List<Visit> getAlVisitsBySpecialty(@PathVariable Specialty specialty){
        return visitService.getVisitBySpeciality(specialty);
    }

    @PostMapping("/visits/add")
    public void addVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
    }
}
