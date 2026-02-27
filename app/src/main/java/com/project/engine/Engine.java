package com.project.engine;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.project.model.Reel;

// Engine основная логика игры
public class Engine {
    private List<Reel> reels = new ArrayList<>();
    private Random random;

    // Конструктор
    public Engine(){
        random = new Random();
        for (int i = 0; i < 3; i++)
        {
            reels.add(new Reel(random));
        }
    }

    // Конструктор для тестов
    public Engine(Random random){
        this.random = random;
        for (int i = 0; i < 3; i++)
        {
            reels.add(new Reel(random));
        }
    }
    
    // getNumberOfStart функция для запуска
    public int getNumberOfStart(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.print("Это не число... ");
            scanner.next();
        }

        return scanner.nextInt();
    }

    //getReels возвращает reels
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
