package com.gabriel.precotomate.service;

import org.springframework.stereotype.Service;

@Service
public class PrecoService {

    private static final double PRECO_CAIXA = 50.0;

    public double calcularPreco(int quantidade) {
        double total = PRECO_CAIXA * quantidade;
        double desconto = 0.0;

        if (quantidade >= 30) {
            desconto = 0.22;
        } else if (quantidade >= 20) {
            desconto = 0.11;
        } else if (quantidade >= 10) {
            desconto = 0.05;
        }

        return total * (1 - desconto);
    }
}
