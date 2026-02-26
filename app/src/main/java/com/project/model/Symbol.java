package com.project.model;

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
}
