package com.example.db14.service;

import com.example.db14.model.Specialty;
import com.example.db14.model.Visit;
import com.example.db14.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {
    private final VisitRepository visitRepository;

    public List<Visit> getAllVisits(){
        return visitRepository.findAll();
    }

    public List<Visit> getVisitsByCnp(String cnp){
        return visitRepository.getAllByPatientCnp(cnp);
    }

    public List<Visit> getVisitBySpeciality(Specialty specialty){
        return visitRepository.getAllByDoctorSpecialty(specialty);
    }

    public void addVisit(Visit visit){
        visitRepository.save(visit);
    }

}
