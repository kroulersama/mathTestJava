package com.project.engine;

import java.util.List;

import com.project.model.Line;
import com.project.model.Reel;
import com.project.model.Symbol;


// Calculator все вычисления
public class Calculator {

    private Calculator(){

    }

    // calculateSumm логика вычисления
    public static int calculateWin(List<Reel> reels){
        Symbol[] grid = Line.convertSymbols(reels);
        return isWinning(grid);
    }

    // isWining проверяет комбинации, сумирует выиграш и возвращает сумму с 1 прокрута
    private static int isWinning(Symbol[] grid){
        int winSum = 0;
        List<int[]> payline = Line.getPayLines();

        for(int[] i : payline){
            Symbol[] lineSymbols = new Symbol[]{grid[i[0]], grid[i[1]], grid[i[2]]};
            int wildNum = 0;
            Symbol mainSymbol = null;


            for (Symbol k : lineSymbols){
                if (k == Symbol.WI) wildNum++;
                else if (mainSymbol == null || k.getPayout()[2] > mainSymbol.getPayout()[2])
                    mainSymbol = k;
                }

            if (wildNum == 3){
                winSum += Symbol.WI.getPayout()[2];
            } else if (mainSymbol != null){
                int normalCount = 0;
                for (Symbol sym : lineSymbols) {
                    if (sym == mainSymbol) normalCount++;
                }
                int totalCount = normalCount + wildNum;
                if(totalCount == 3){
                    winSum += mainSymbol.getPayout()[2];
                } else if (totalCount == 2) {
                    winSum += mainSymbol.getPayout()[1];
                } else if (totalCount == 1) {
                    winSum += mainSymbol.getPayout()[0];
                }
            }
        }
    
        return winSum;
    }
}
