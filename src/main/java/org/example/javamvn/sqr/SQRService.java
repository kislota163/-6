package org.example.javamvn.sqr;

public class SQRService {

    public int CalcSqrt(int start, int end) {
        int first = 10;    // lower limit
        int second = 99;   // upper limit
        int i = 0;         // counter
        for (int x = first; x <= second; x++) {
            if (x * x >= start && x * x <= end) {
                i++;
            }
        }
        return i;
    }
}