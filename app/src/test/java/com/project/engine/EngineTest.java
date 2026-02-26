package com.project.engine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EngineTest {

    
    @Test
    public void testSomething() {
        // given (подготовка)
        Engine engine = new Engine();
        
        // when (действие)
        int result = engine.calculateSomething();
        
        // then (проверка)
        assertEquals(42, result);
    }
}
