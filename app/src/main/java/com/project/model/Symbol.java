package com.project.model;

import java.util.Random;

//Symbol нумератор символов
public enum Symbol {
    RAB(2),
    HRS(10),
    WRM(1),
    GOS(5);

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
