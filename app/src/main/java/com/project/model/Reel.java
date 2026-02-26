package com.project.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lombok.Data;

@Data
// Reel Один барабан и его логика
public class Reel {
    private List<Symbol> symbols = new ArrayList<>();
    private int position;

    // Конструктор
    public Reel(Random random){
        int size = 4;
        for (int i = 0; i < size; i++) {
            Symbol randomSymbol = Symbol.values()[random.nextInt(Symbol.values().length)];
            symbols.add(randomSymbol);
        }
        this.position = random.nextInt(symbols.size());
    }

    // Конструктор с определением количества символов в барабане
    public Reel(Random random, int size){
        for (int i = 0; i < size; i++) {
            Symbol randomSymbol = Symbol.values()[random.nextInt(Symbol.values().length)];
            symbols.add(randomSymbol);
        }
        this.position = random.nextInt(symbols.size());
    }
    
    public Symbol get(int col){
        return symbols.get(col);
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
        position = random.nextInt(symbols.size());
    }

}
