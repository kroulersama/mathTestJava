package com.project.model;

import java.util.List;
import java.util.Random;
import lombok.Data;

@Data
public class Reel {
    private List<Symbol> symbols;
    private int position;
    private Random random;

    // Конструктор
    public Reel(Random random){
        List<Symbol> symbolsOfReel = List.of(
            Symbol.GOS,
            Symbol.HRS,
            Symbol.RAB,
            Symbol.WRM
        );
        this.symbols = symbolsOfReel;
        this.random = random;
        this.position = random.nextInt(symbols.size());
    }

    // GetVisibleSymbol Показывает символы радиусом 1 относительно позиции
    public List<Symbol> getVisibleSymbol(){
        int size = symbols.size();
        return List.of(
            symbols.get(position),
            symbols.get((position + 1) % size),
            symbols.get((position + 2) % size)
        );
    }


    // Spin - рандомизирует позицию
    public void spin(Random random){
        this.random = random;
        position = this.random.nextInt(symbols.size());
    }

}
