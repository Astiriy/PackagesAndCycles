package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int min, int max) {
        int CountSquares = 0;
        for (int i = 1; i <= 99; i++) {
            if (i * i >= min & i * i <= max) {
                CountSquares++;
            }
        }
        return CountSquares;
    }
}

