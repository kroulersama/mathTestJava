# mathTestJava - Тестовое приложение демонстрирующая работы слот-машины

```
src/main/java/com/project/
├── model/ # Модели данных
│ ├── Symbol.java # Enum символов с выплатами
│ ├── Reel.java # Барабан с символами
│ └── Line.java # Линии выплат и конвертация
├── engine/ # Игровая логика
│ ├── Engine.java # Основной движок
│ └── Calculator.java # Подсчет выигрышей
├── repository/ # Хранилище данных
│ └── ReelData.java # Фиксированные барабаны из референса
└── Main.java # Вход в программу

src/test/java/com/project/
├── engine/
│ └── CalculatorTest.java # Unit тесты для калькулятора
└── MathTest.java # Математический тест RTP
```
