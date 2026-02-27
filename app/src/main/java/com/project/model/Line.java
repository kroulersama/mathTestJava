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
}


//  00   01   02
//  10   11   12
//  20   21   22