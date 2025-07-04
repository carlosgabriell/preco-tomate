package com.gabriel.precotomate.dto;

public class PrecoResponse {
    private double precoFinal;

    public PrecoResponse(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
