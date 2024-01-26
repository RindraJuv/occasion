package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.V_annonceStatus;
import com.example.demo.service.V_annonceService;

@RestController
public class V_annonceControl {
   @Autowired
    private final V_annonceService annonceService;
    @Autowired
    public V_annonceControl(V_annonceService annonceService) {
        this.annonceService = annonceService;
    }

    @GetMapping("/annonceValider")
    public ResponseEntity<List<V_annonceStatus>> getAllAnnonce() {
        System.out.println("********fa aona");
        return annonceService.getAllAnnonceValider(5);
    }
}
