package com.project.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


// Reel Один барабан и его логика
public class Reel {
    private List<Symbol> symbols = new ArrayList<>();
    private int position;

    // Конструктор
    public Reel(List<Symbol> symbols,Random random){
        this.symbols = symbols;
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

    // Конструктор с определением позиции и символов(для тестов)
    public Reel(List<Symbol> symbols, int position){
        this.symbols = symbols;
        this.position = position;
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

    // Get - возвращает текущую позицию
    public int getPosition(){
        return position;
    }

}
