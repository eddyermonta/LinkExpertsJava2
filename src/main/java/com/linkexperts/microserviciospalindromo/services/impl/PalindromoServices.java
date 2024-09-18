package com.linkexperts.microserviciospalindromo.services.impl;

import com.linkexperts.microserviciospalindromo.dto.PalindromoRequest;
import com.linkexperts.microserviciospalindromo.dto.PalindromoResponse;
import com.linkexperts.microserviciospalindromo.services.IPalindromoServices;
import org.springframework.stereotype.Service;

@Service
public class PalindromoServices implements IPalindromoServices {


    @Override
    public PalindromoResponse processPalindromo(PalindromoRequest request) {
        String texto = request.getPalindromo();
        int lengthCadena = texto.length();
        int lengthCaracteresEspeciales = (int) texto.chars().filter(c -> !Character.isLetterOrDigit(c)).count();
        String cleanedTexto = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindromo = cleanedTexto.equals(new StringBuilder(cleanedTexto).reverse().toString());

        return new PalindromoResponse(lengthCadena, isPalindromo ? 1 : 0, lengthCaracteresEspeciales);
    }
}
