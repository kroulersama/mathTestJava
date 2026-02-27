package com;

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
        int ticket = 1000;
        int winAmount = 0;
        int totalWin = 0;
        int winningGame = 0;
        Double winGamePer = null;
        Double returnToPlayer = null;

        //Исполнение
        for (int i = 0; i < ticket; i++){
            engine.spin();
            totalBet = 5;
            winAmount = Calculator.calculateWin(engine.getReels());
            if (winAmount != 0){
                totalWin += winAmount;
                winningGame ++;
            }
        }

        if (ticket == 0) {
            System.out.println("Ошибка: ticket = 0, невозможно рассчитать процент выигрышей");
        } else {
            winGamePer = (double) winningGame / ticket * 100;
        }

        if (totalBet == 0) {
            System.out.println("Ошибка: totalBet = 0, невозможно рассчитать RTP");
        } else {
            returnToPlayer = (double) totalWin / totalBet * 100;
        }

        //Проверка

    }
}
