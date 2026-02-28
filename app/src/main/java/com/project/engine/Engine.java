package com.project.engine;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.project.model.Reel;
import com.project.repository.ReelData;

// Engine основная логика игры
public class Engine {
    private List<Reel> reels = new ArrayList<>();
    private Random random;

    // Конструктор
    public Engine(){
        random = new Random();
        reels.add(new Reel(ReelData.getReel1Symbols(), random));
        reels.add(new Reel(ReelData.getReel2Symbols(), random));
        reels.add(new Reel(ReelData.getReel3Symbols(), random));
    }

    // Конструктор для тестов
    public Engine(Random random){
        this.random = random;
        reels.add(new Reel(ReelData.getReel1Symbols(), random));
        reels.add(new Reel(ReelData.getReel2Symbols(), random));
        reels.add(new Reel(ReelData.getReel3Symbols(), random));
    }
    
    // getNumberOfStart функция для запуска
    public int getNumberOfStart(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.print("Это не число... ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    // getReels возвращает reels
    public List<Reel> getReels(){
        return reels;
    }

    // getVisible - выводит текущие позиции барабанов
    public void getVisible(){
        for (Reel reel : reels){
            System.out.println(reel.getVisibleSymbol());
        }
    }

    // Spin - рандомизирует позицию
    public void spin(){
        for (Reel reel : reels){
            reel.spin(random);
        }
    }

}
