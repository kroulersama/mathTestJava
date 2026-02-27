package com.project.engine;

import java.util.List;

import com.project.model.Line;
import com.project.model.Reel;
import com.project.model.Symbol;


// Calculator все вычисления
public class Calculator {

    // Конструктор
    public Calculator(){
        // нечего инициализировать
    }

    // calculateSumm логика вычисления
    public int calculateWin(List<Reel> reels){
        Symbol[][] grid = Line.convertSymbols(reels);
        return isWinning(grid);
    }

    // isWining проверяет комбинации, сумирует выиграш и возвращает сумму с 1 прокрута
    private static int isWinning(Symbol[][] grid){
        int winSum = 0;
        for (int i =0 ; i < 2; i++){
            if (grid[i][0].equals(grid[i][1]) && grid[i][0].equals(grid[i][2])) winSum += grid[i][0].getPayout();
        }
        if (grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])) winSum += grid[0][0].getPayout();
        if (grid[2][0].equals(grid[1][1]) && grid[2][0].equals(grid[0][2])) winSum += grid[2][0].getPayout();

        return winSum;
    }
}
