package com.project.model;

import java.util.List;


//Line логика внутри линий
public class Line {

    // Конструктор
    private Line(){
        
    }
    // convertSymbols регресивно возвращает 2-мерный массив с символами из листа барабанов
    public static Symbol[] convertSymbols(List<Reel> reels){
        Symbol[] grid = new Symbol[9];
        int numCol = 0;
        for (int col = 0; col < 3; col++) {
            List<Symbol> visible = reels.get(col).getVisibleSymbol();
            grid[numCol] = visible.get(0);
            numCol ++;
            grid[numCol] = visible.get(1);
            numCol ++;
            grid[numCol] = visible.get(2);
            numCol ++;
        }
        return grid;
    }

    // Список линий выплат (5 линий)
    public static List<int[]> getPayLines() {
        return List.of(
            new int[]{0, 3, 6},  // Line 1: верхний ряд
            new int[]{1, 4, 7},  // Line 2: средний ряд
            new int[]{2, 5, 8},  // Line 3: нижний ряд
            new int[]{0, 4, 8},  // Line 4: диагональ \
            new int[]{2, 4, 6}   // Line 5: диагональ /
        );
    }
}


//  00   01   02
//  10   11   12
//  20   21   22