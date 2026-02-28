package com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.project.engine.Calculator;
import com.project.engine.Engine;

class MathTest {
    Random random = new Random(12345);
    Engine engine = new Engine(random);
    @Test
    void MainTest(){
        //Подготовка
        int totalBet = 0;
        int ticket = 2000;
        int winAmount = 0;
        int totalWin = 0;
        int winningGame = 0;


        //Исполнение
        for (int i = 0; i < ticket; i++){
            engine.spin();
            totalBet += 5;
            winAmount = Calculator.calculateWin(engine.getReels());
            if (winAmount != 0){
                totalWin += winAmount;
                winningGame ++;
            }
        }

        double hitRate = (double) winningGame / ticket * 100;
        double rtp = (double) totalWin / totalBet * 100;

        //  Проверка
        assertEquals(50.0, rtp, 5.0);  // допуск ±5% на 2000 раундов
        assertEquals(50.00, hitRate, 5.0);
        
        // Дополнительно можно проверить диапазон
        assertTrue(rtp > 45 && rtp < 60, "RTP вне ожидаемого диапазона");
    }
}
