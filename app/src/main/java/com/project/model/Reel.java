package com.project.model;

import java.util.List;

import lombok.Data;

@Data
public class Reel {
    private List<Symbol> symbols;
    private int position;
    
    public Reel (List<Symbol> symbols){
        this.symbols = symbols;
        this.position = 0;
    }

    //GetVisibleSymbol Показывает символы радиусом 1 относительно позиции
    public List<Symbol> GetVisibleSymbol(){
        int size = symbols.size();
        return List.of(
            symbols.get(position),
            symbols.get((position + 1) % size),
            symbols.get((position + 2) % size),
        );
    }
}
