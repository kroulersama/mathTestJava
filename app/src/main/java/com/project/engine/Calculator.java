package com.project.engine;

import java.util.List;

import com.project.model.Line;
import com.project.model.Reel;
import com.project.model.Symbol;
// Calculator Все вычисления
public class Calculator {

    // calculateSumm логика вычисления
    public static int calculateSumm(List<Reel> reels){
        Symbol[][] grid = Line.convertSymbols(reels);
        return isWining(grid);
    }

    // isWining проверяет комбинации, сумирует выиграш и возвращает сумму с 1 прокрута
    private static int isWining(Symbol[][] grid){
        int winSum = 0;
        for (int i =0 ; i < 2; i++){
            if (grid[i][0].equals(grid[i][1]) && grid[i][0].equals(grid[i][2])) winSum += grid[i][0].getPayout();
        }
        if (grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])) winSum += grid[0][0].getPayout();
        if (grid[2][0].equals(grid[1][1]) && grid[2][0].equals(grid[0][2])) winSum += grid[2][0].getPayout();

        return winSum;
    }
}
