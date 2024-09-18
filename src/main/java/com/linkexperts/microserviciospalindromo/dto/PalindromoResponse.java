package com.linkexperts.microserviciospalindromo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PalindromoResponse {
    private int lengthCadena;
    private int isPalindromo;
    private int lengthCaracteresEspeciales;
}
