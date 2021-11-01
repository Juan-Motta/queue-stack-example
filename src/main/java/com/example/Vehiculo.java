package com.example;

import java.util.Random;

public class Vehiculo {

    private String placa;

    Vehiculo() {
        this.placa = generatePlaca();
    }

    public String getPlaca() {
        return this.placa;
    }

    private String generatePlaca() {
        String placa = "";
        for (int i = 0; i < 3; i++) {
            placa += (char) randomNumber(65, 90);
        }
        for (int i = 0; i < 3; i++) {
            placa += randomNumber(0, 9);
        }
        return placa;
    }

    private int randomNumber(int min, int max) {
        Random random = new Random();
        return (random.nextInt(max - min) + min);
    }

    @Override
    public String toString() {
        return this.getPlaca();
    }

}
