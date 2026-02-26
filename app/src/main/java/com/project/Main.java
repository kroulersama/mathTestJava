package com.project;

import com.project.engine.Engine;
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.getVisible();
        System.out.println();

        engine.spin();

        engine.getVisible();
    }
}