package com.project.repository;

import java.util.ArrayList;
import java.util.List;

import com.project.model.Symbol;

public class ReelData {

    // Конструктор
    private ReelData(){

    }
    
    // Барабан 1
    private static final List<Symbol> REEL1_SYMBOLS = List.of(
        Symbol.H1, Symbol.L4, Symbol.L2, Symbol.EM, Symbol.L1,
        Symbol.L2, Symbol.H1, Symbol.L4, Symbol.L2, Symbol.L3,
        Symbol.L3, Symbol.L2, Symbol.M1, Symbol.L4, Symbol.L2,
        Symbol.L3, Symbol.L1, Symbol.M2, Symbol.L4, Symbol.L2,
        Symbol.L3, Symbol.L2, Symbol.WI, Symbol.L4, Symbol.M2,
        Symbol.L1, Symbol.L4, Symbol.L2, Symbol.L3, Symbol.WI,
        Symbol.EM, Symbol.L4, Symbol.L1, Symbol.M1, Symbol.WI,
        Symbol.L3, Symbol.L2, Symbol.WI, Symbol.L3, Symbol.L4,
        Symbol.L1, Symbol.L4, Symbol.EM, Symbol.L3, Symbol.L2,
        Symbol.M2, Symbol.L1, Symbol.M3, Symbol.WI, Symbol.L3,
        Symbol.L2, Symbol.WI, Symbol.EM, Symbol.M3, Symbol.M1,
        Symbol.L2, Symbol.EM, Symbol.L4, Symbol.L3, Symbol.L1,
        Symbol.WI, Symbol.M3, Symbol.M1, Symbol.L1, Symbol.L3,
        Symbol.L2, Symbol.L4, Symbol.EM, Symbol.L3, Symbol.M2,
        Symbol.L1, Symbol.L2, Symbol.M3, Symbol.L1, Symbol.L2,
        Symbol.M2, Symbol.L3
    );

    // Барабан 2
    private static final List<Symbol> REEL2_SYMBOLS = List.of(
        Symbol.L2, Symbol.M3, Symbol.L1, Symbol.L1, Symbol.L2,
        Symbol.M2, Symbol.L2, Symbol.L4, Symbol.L1, Symbol.EM,
        Symbol.L2, Symbol.L3, Symbol.L4, Symbol.H1, Symbol.L1,
        Symbol.L1, Symbol.L3, Symbol.M1, Symbol.EM, Symbol.L1,
        Symbol.L3, Symbol.L2, Symbol.M3, Symbol.L4, Symbol.L1,
        Symbol.L3, Symbol.L4, Symbol.WI, Symbol.M2, Symbol.L3,
        Symbol.L4, Symbol.L2, Symbol.L1, Symbol.EM, Symbol.M3,
        Symbol.L2, Symbol.L1, Symbol.L4, Symbol.L2, Symbol.M1,
        Symbol.L3, Symbol.WI, Symbol.L2, Symbol.L4, Symbol.L1,
        Symbol.L2, Symbol.M2, Symbol.L3, Symbol.EM, Symbol.L1,
        Symbol.L4, Symbol.WI, Symbol.L3, Symbol.L2, Symbol.M1,
        Symbol.L4, Symbol.L3, Symbol.L1, Symbol.M3, Symbol.L2,
        Symbol.EM, Symbol.L1, Symbol.L4, Symbol.WI, Symbol.L3,
        Symbol.L2, Symbol.M2, Symbol.L1, Symbol.L4, Symbol.L3,
        Symbol.L1, Symbol.EM, Symbol.M3, Symbol.L2, Symbol.L4,
        Symbol.WI, Symbol.L1
    );
    
    // Барабан 3
    private static final List<Symbol> REEL3_SYMBOLS = List.of(
        Symbol.L4, Symbol.M3, Symbol.L1, Symbol.EM, Symbol.L2,
        Symbol.L4, Symbol.M2, Symbol.M3, Symbol.L3, Symbol.L1,
        Symbol.L4, Symbol.H1, Symbol.EM, Symbol.L2, Symbol.L3,
        Symbol.EM, Symbol.L3, Symbol.M1, Symbol.L4, Symbol.M3,
        Symbol.L1, Symbol.L2, Symbol.WI, Symbol.L4, Symbol.M2,
        Symbol.L3, Symbol.L1, Symbol.L4, Symbol.M3, Symbol.L2,
        Symbol.EM, Symbol.L1, Symbol.L4, Symbol.WI, Symbol.L3,
        Symbol.L2, Symbol.M1, Symbol.L4, Symbol.L3, Symbol.EM,
        Symbol.L1, Symbol.WI, Symbol.M2, Symbol.L3, Symbol.L4,
        Symbol.L1, Symbol.L2, Symbol.M3, Symbol.L4, Symbol.EM,
        Symbol.L1, Symbol.WI, Symbol.L3, Symbol.M2, Symbol.L4,
        Symbol.L2, Symbol.L1, Symbol.M3, Symbol.L4, Symbol.EM,
        Symbol.L3, Symbol.L2, Symbol.WI, Symbol.L1, Symbol.M2,
        Symbol.L4, Symbol.L3, Symbol.L1, Symbol.EM, Symbol.M3,
        Symbol.L2, Symbol.L4, Symbol.WI, Symbol.L1, Symbol.L3,
        Symbol.M2, Symbol.L4
    );
    
    public static List<Symbol> getReel1Symbols() {
        return new ArrayList<>(REEL1_SYMBOLS);
    }
    
    public static List<Symbol> getReel2Symbols() {
        return new ArrayList<>(REEL2_SYMBOLS);
    }
    
    public static List<Symbol> getReel3Symbols() {
        return new ArrayList<>(REEL3_SYMBOLS);
    }
}