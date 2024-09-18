package com.linkexperts.microserviciospalindromo.controller;

import com.linkexperts.microserviciospalindromo.dto.PalindromoRequest;
import com.linkexperts.microserviciospalindromo.dto.PalindromoResponse;
import com.linkexperts.microserviciospalindromo.services.IPalindromoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/palindromo")
public class PalindromoController {

    private final IPalindromoServices palindromoServices;

    @Autowired
    public PalindromoController(IPalindromoServices palindromoServices) {
        this.palindromoServices = palindromoServices;
    }

    @PostMapping
    public ResponseEntity<PalindromoResponse> getPalindromoDetails(@RequestBody PalindromoRequest request) {
        PalindromoResponse response = palindromoServices.processPalindromo(request);
        return ResponseEntity.ok(response);
    }
}