package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.core.RandomDoubleArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();
    private final RandomDoubleArrayFactory arrayDoubleFactory = new RandomDoubleArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        // Создание массива целых чисел
        int[] array = arrayFactory.getInstance(20);
        Integer[] arr = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        System.out.println("Задание 1 \n");
        System.out.println("Целочисленный массив: \t" + Arrays.toString(array));
        System.out.println("Минимальное значение в массиве: \t" + Numbers.min(arr));
        System.out.println("Максимальное значение в массиве: \t" + Numbers.max(arr));
        System.out.println("Среднее арифмитическое массива: \t" + Numbers.<Integer>avg(arr) + "\n");

        // Создание массива вещественных чисел
        double[] array2 = arrayDoubleFactory.getInstance(20);
        Double[] arr2 = new Double[array.length];
        for (int i = 0; i < array.length; i++) {
            arr2[i] = array2[i];
        }
        System.out.println("Вещественный массив: \t" + Arrays.toString(array2));
        System.out.println("Минимальное значение в массиве: \t" + Numbers.min(arr2));
        System.out.println("Максимальное значение в массиве: \t" + Numbers.max(arr2));
        System.out.println("Среднее арифмитическое массива: \t" + Numbers.avg(arr2) + "\n");

        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
