package com.project.model;

public enum Symbol {
    RABBIT(2),
    HORSE(10),
    WORM(1),
    GOOSE(5);

    private final int payout;

    Symbol(int payout) {
        this.payout = payout;
    }
    
    public int getPayout() {
        return payout;
    }
}
