package com.project.model;

import java.util.Random;

//Symbol нумератор символов
public enum Symbol {
    WI(new int[]{0,0,50}),   // Wild
    H1(new int[]{1,10,25}),   // High 1
    M1(new int[]{0,5,15}),   // Medium 1
    M2(new int[]{0,2,10}),   // Medium 2
    M3(new int[]{0,0,8}),    // Medium 3
    L1(new int[]{0,0,5}),    // Low 1
    L2(new int[]{0,0,3}),    // Low 2
    L3(new int[]{0,0,2}),    // Low 3
    L4(new int[]{0,0,1}),    // Low 4
    EM(new int[]{0,0,0});    // Empty

    private final int[] payout;

    Symbol(int[] payout) {
        this.payout = payout;
    }

    public int[] getPayout() {
        return payout;
    }

    // getRandom возвращает рандомный символ
    public static Symbol getRandom(Random random){
        Symbol[] valueSymbols = Symbol.values();
        return valueSymbols[random.nextInt(valueSymbols.length)];

    }
}
