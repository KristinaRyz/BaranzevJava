package ru.stqa.ptf.sandbox;

import org.testng.Assert; // импорт класса Асерт для проверки ожидаемого результата
import org.testng.annotations.Test; // импорт для тестового фреймворка что запускает тест

/**
 * Created by ryzhi on 2/7/2018.
 */
public class SquareTests {

    @Test // аннотация

    public void testArea(){   // метод, который вызывает функцию для вычисления площади
        Square s = new Square(5); // вычисление площади со стороной 5
     // assert s.area() == 25; // простая проверка через знак сравнивания ==
       Assert.assertEquals(s.area(),25.0); // проверка ожидаемого результата с полученным через вызов функции из класса
    }
}
