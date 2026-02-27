package com.project.model;

import java.util.Random;

//Symbol нумератор символов
public enum Symbol {
    WI(50),   // Wild
    H1(25),   // High 1
    M1(15),   // Medium 1
    M2(10),   // Medium 2
    M3(8),    // Medium 3
    L1(5),    // Low 1
    L2(3),    // Low 2
    L3(2),    // Low 3
    L4(1),    // Low 4
    EM(0);    // Empty

    private final int payout;

    Symbol(int payout) {
        this.payout = payout;
    }
    
    public int getPayout() {
        return payout;
    }
    
    // getRandom возвращает рандомный символ
    public static Symbol getRandom(Random random){
        Symbol[] valueSymbols = Symbol.values();
        return valueSymbols[random.nextInt(valueSymbols.length)];

    }
}
