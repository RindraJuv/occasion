package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Favoris;
import com.example.demo.service.FavorisService;

@RestController
public class FavorisControl {
    private final FavorisService favservice;
    @Autowired
    public FavorisControl(FavorisService favservice) {
        this.favservice = favservice;
    }
    @GetMapping("/favoris")
    public ResponseEntity<Favoris> ajoutFavoris() {
        Favoris f = new Favoris(1,2,2);
        return favservice.saveAnnonce(f);
    }
}
