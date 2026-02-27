package com.project.engine;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.model.Symbol;
import com.project.model.Reel;

class CalculatorTest {

    @Test
    void testCalculateWin_NoWin() {
        // Подготовка - нет совпадений на линиях
        List<Symbol> symbols1 = List.of(Symbol.L1, Symbol.L2, Symbol.L3);
        List<Symbol> symbols2 = List.of(Symbol.L2, Symbol.L3, Symbol.L4);
        List<Symbol> symbols3 = List.of(Symbol.L3, Symbol.L4, Symbol.L1);
        
        Reel reel1 = new Reel(symbols1, 1);
        Reel reel2 = new Reel(symbols2, 1);
        Reel reel3 = new Reel(symbols3, 1);
        
        List<Reel> reels = List.of(reel1, reel2, reel3);

        // Действие
        int result = Calculator.calculateWin(reels);

        // Проверка
        assertEquals(0, result);
    }

    @Test
    void testCalculateWin_HorizontalLine() {
        // Подготовка - верхняя линия из L1 (выплата 5)
        List<Symbol> symbols1 = List.of(Symbol.L1, Symbol.L1, Symbol.L2);
        List<Symbol> symbols2 = List.of(Symbol.L1, Symbol.L3, Symbol.L4);
        List<Symbol> symbols3 = List.of(Symbol.L1, Symbol.L4, Symbol.L2);
        
        Reel reel1 = new Reel(symbols1, 0);
        Reel reel2 = new Reel(symbols2, 0);
        Reel reel3 = new Reel(symbols3, 0);
        
        List<Reel> reels = List.of(reel1, reel2, reel3);

        // Действие
        int result = Calculator.calculateWin(reels);

        // Проверка
        assertEquals(Symbol.L1.getPayout(), result);
    }

    @Test
    void testCalculateWin_DiagonalLine() {
        // Подготовка - главная диагональ из M1 (выплата 15)
        List<Symbol> symbols1 = List.of(Symbol.M1, Symbol.L2, Symbol.L3);
        List<Symbol> symbols2 = List.of(Symbol.L4, Symbol.M1, Symbol.L1);
        List<Symbol> symbols3 = List.of(Symbol.L2, Symbol.L3, Symbol.M1);
        
        Reel reel1 = new Reel(symbols1, 0);
        Reel reel2 = new Reel(symbols2, 0);
        Reel reel3 = new Reel(symbols3, 0);
        
        List<Reel> reels = List.of(reel1, reel2, reel3);

        // Действие
        int result = Calculator.calculateWin(reels);

        // Проверка
        assertEquals(Symbol.M1.getPayout(), result);
    }

    @Test
    void testCalculateWin_MultipleLines() {
        // Подготовка - верхняя линия L2 (3) + нижняя линия M2 (10) = 13
        List<Symbol> symbols1 = List.of(Symbol.L2, Symbol.L2, Symbol.M2);
        List<Symbol> symbols2 = List.of(Symbol.L2, Symbol.L3, Symbol.M2);
        List<Symbol> symbols3 = List.of(Symbol.L2, Symbol.M2, Symbol.M2);
        
        Reel reel1 = new Reel(symbols1, 0);
        Reel reel2 = new Reel(symbols2, 0);
        Reel reel3 = new Reel(symbols3, 0);

        List<Reel> reels = List.of(reel1, reel2, reel3);

        int expectedWin = Symbol.L2.getPayout() + Symbol.M2.getPayout(); // 3 + 10 = 13

        // Действие
        int result = Calculator.calculateWin(reels);

        // Проверка
        assertEquals(expectedWin, result);
    }

    @Test
    void testCalculateWin_AllLines() {
        // Подготовка - все поле из H1 (выплата 25 × 5 линий = 125)
        List<Symbol> symbols1 = List.of(Symbol.H1, Symbol.H1, Symbol.H1);
        List<Symbol> symbols2 = List.of(Symbol.H1, Symbol.H1, Symbol.H1);
        List<Symbol> symbols3 = List.of(Symbol.H1, Symbol.H1, Symbol.H1);
        
        Reel reel1 = new Reel(symbols1, 0);
        Reel reel2 = new Reel(symbols2, 0);
        Reel reel3 = new Reel(symbols3, 0);
        
        List<Reel> reels = List.of(reel1, reel2, reel3);

        int expectedWin = 5 * Symbol.H1.getPayout(); // 5 × 25 = 125

        // Действие
        int result = Calculator.calculateWin(reels);

        // Проверка
        assertEquals(expectedWin, result);
    }
}