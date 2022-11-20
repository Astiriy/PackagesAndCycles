package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int x, int y) {
        int CountSquares = 0;
        for (int i = 1; i <= x; i++) {
            if (i * i >= x & i * i <= y) {
                CountSquares++;
            }
        }
        return CountSquares;
    }
}

