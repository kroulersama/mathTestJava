package com.project.model;

import java.util.List;


//Line логика внутри линий
public class Line {

    // Конструктор
    private Line(){
        
    }
    // convertSymbols регресивно возвращает 2-мерный массив с символами из листа барабанов
    public static Symbol[][] convertSymbols(List<Reel> reels){
        Symbol[][] grid = new Symbol[3][3];
        for (int col = 0; col < 3; col++) {
            List<Symbol> visible = reels.get(col).getVisibleSymbol();
            grid[0][col] = visible.get(0);
            grid[1][col] = visible.get(1);
            grid[2][col] = visible.get(2);
        }
        return grid;
    }

    // Список линий выплат (5 линий)
    public static List<int[]> getPayLines() {
        return List.of(
            new int[]{0, 0, 0},  // Line 1: верхний ряд
            new int[]{1, 1, 1},  // Line 2: средний ряд
            new int[]{2, 2, 2},  // Line 3: нижний ряд
            new int[]{0, 1, 2},  // Line 4: диагональ \
            new int[]{2, 1, 0}   // Line 5: диагональ /
        );
    }
}


//  00   01   02
//  10   11   12
//  20   21   22