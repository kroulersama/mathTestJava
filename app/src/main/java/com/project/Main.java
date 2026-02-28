package com.project;

import java.util.Scanner;

import com.project.engine.Calculator;
import com.project.engine.Engine;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Engine engine = new Engine();
        int totalBet = 0;
        int totalWin = 0;
        int winningGame = 0;
        int winAmount = 0;
        Double winGamePer = null;
        Double returnToPlayer = null;

        System.out.print("введите количество ставок: ");
        
        int ticket = engine.getNumberOfStart(scanner);

        for (int i = 0; i < ticket; i++){
            engine.spin();
            totalBet += 5;
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

        System.out.printf("Входное значение%n" +
                        "%d %n" +
                        "Выходное значение %n" +
                        "Total Bet: %d %n" +
                        "Total Win: %d %n" +
                        "Total Hit Rate %.2f%% %n" +
                        "Return to Player (RTP): %.2f%% %n",
                        ticket, totalBet, totalWin, winGamePer, returnToPlayer);
    
        scanner.close();
    }
}