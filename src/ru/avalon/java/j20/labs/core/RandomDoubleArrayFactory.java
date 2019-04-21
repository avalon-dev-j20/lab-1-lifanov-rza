package ru.avalon.java.j20.labs.core;

import java.math.RoundingMode;
import java.util.Random;
import java.math.BigDecimal;

/**
 * Фабрика, создающая массивы вещественных чисел, наполненные
 * случайными значениями, округлёнными до трёх знаков после запятой.
 */
public class RandomDoubleArrayFactory implements Factory<double[], Integer> {

    /**
     * Генератор псевдо-случайных чисел.
     */
    private final Random random = new Random();

    /**
     * Возвращает новый массив заданной длины. Массив
     * содержит случайные значения в диапазоне от 0 до 100.
     *
     * @param length длина массива
     * @return новый массив случайных чисел, заданной длины.
     */
    @Override
    public double[] getInstance(Integer length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = new BigDecimal(random.nextDouble() * 100).setScale(3, RoundingMode.HALF_UP).doubleValue() ;
        }
        return array;
    }
}
