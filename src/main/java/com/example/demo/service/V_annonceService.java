package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.V_annonceStatus;
import com.example.demo.repository.V_annonceRepository;
@Service
public class V_annonceService {
    private final V_annonceRepository annonceRep;
    @Autowired
    public V_annonceService(V_annonceRepository userRep) {
        this.annonceRep = userRep;
    }    
    public ResponseEntity<List<V_annonceStatus>> getAllAnnonceValider(int statu) {
        System.out.println("******************Ataony");
        return new ResponseEntity<>(annonceRep.findByStatu(statu),HttpStatus.OK);
    }
}
