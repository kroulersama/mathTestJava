package com.project.engine;


import java.util.List;
import java.util.Random;

import com.project.model.Reel;


public class Engine {
    private Reel reel1;
    private Reel reel2;
    private Reel reel3;
    private Random random = new Random();
    private List<Reel> reelList;

    // Конструктор
    public Engine(){
        reel1 = new Reel(random);
        reel2 = new Reel(random);
        reel3 = new Reel(random);

        reelList = List.of(
        reel1,
        reel2,
        reel3
    );
    }

    //getVisible
    public void getVisible(){
        for (Reel real : reelList){
            System.out.println(real.getVisibleSymbol());
        }
    }

        // Spin - рандомизирует позицию
    public void spin(){
        for (Reel reel : reelList){
            reel.spin(random);
            System.out.println();
        }
    }

}
