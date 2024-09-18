package com.linkexperts.microserviciospalindromo.services;

import com.linkexperts.microserviciospalindromo.dto.PalindromoRequest;
import com.linkexperts.microserviciospalindromo.dto.PalindromoResponse;

public interface IPalindromoServices {
    PalindromoResponse processPalindromo(PalindromoRequest request);
}

