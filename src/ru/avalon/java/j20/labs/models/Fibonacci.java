package ru.avalon.java.j20.labs.models;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
 * 6765, 10946, 17711, … (последовательность A000045 в OEIS),
 * в которой первые два числа равны либо 1 и 1, либо 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих
 * чисел. Названы в честь средневекового математика Леонардо
 * Пизанского (известного как Фибоначчи).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {
    public final int START_SIZE;
    private Integer fibNumber = 1;
    private int pointer;

    private Integer[] data;

    public int getSize() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public Integer get(int index) {
        return data[index];
    }

    public String showFibLine() {
        return Arrays.toString(data);
    }

    public Fibonacci(Integer START_SIZE) {
        this.START_SIZE = START_SIZE;
        data = new Integer[START_SIZE];
        data[pointer] = 0;
        for (pointer = 1; pointer < START_SIZE; ) {
            data[pointer] = fibNumber;
            fibNumber += data[pointer - 1];
            pointer++;
        }
    }

    public void add(int growSize) {
        int previousLength = data.length;
        fibNumber = data[data.length - 1];
        data = Arrays.copyOf(data, data.length + growSize);
        for (pointer = previousLength; pointer < data.length; ) {
            data[pointer] = fibNumber;
            fibNumber += data[pointer - 1];
            pointer++;
        }
    }

    public int sum() {
        int sum = 0;
        for (Integer i : data) sum += i.intValue();
        return sum;
    }


    /**
     * Итератор, выполняющий обход последовательности
     * чисел Фибоначчи.
     */
    private class FibonacciIterator implements Iterator<Integer> {

        private int index;
        /**
         * Определяет, есть ли следующее значение
         * последовательности чисел Фибоначчи.
         *
         * @return {@code true}, если следующее число
         * последовательности существует. В обратном случае
         * {@code false}.
         */
        @Override
        public boolean hasNext() {
            return index < pointer;
        }

        /**
         * Возвращает следующее число последовательности
         * чисел Фибоначчи.
         *
         * @return следующее число последовательности.
         */
        @Override
        public Integer next() {
            return data[index++];
        }
    }

    /**
     * Возвращает итератор, позволяющий выполнить обход
     * последовательности чисел Фибоначчи.
     *
     * @return итератор последовательности чисел Фибоначчи
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}
