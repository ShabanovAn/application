package com.example.application.еу;

import java.util.*;

/**
 * Should be improved to reduce calculation time.
 *
 * 1. Change this file or create new one using parallel calculation mode.
 * 2. Do not use `executors`, only plain threads  (max threads count which should be created for calculations is com.fitechsource.test.TestConsts#MAX_THREADS)
 * 3. Try to provide simple solution, do not implement frameworks.
 * 4. Don't forget that calculation method can throw exception, process it right way. 
 *   (Stop calculation process and print error message. Ignore already calculated intermediate results, user doesn't need it.)
 *   
 *   Please attach code files to email - skhisamov@fitechsource.com
 */
//* Следует улучшить, чтобы сократить время расчета.
// *
// * 1. Измените этот файл или создайте новый, используя режим параллельных вычислений.
// * 2. Не используйте `исполнители`, только простые потоки (максимальное количество потоков, которое должно быть создано для вычислений, равно com.fitechsource.test.TestConsts # MAX_THREADS)
// * 3. Постарайтесь предложить простое решение, не внедряйте фреймворки.
// * 4. Не забывайте, что метод расчета может вызвать исключение, обработайте его правильно.
// * (Остановить процесс расчета и распечатать сообщение об ошибке. Игнорировать уже рассчитанные промежуточные результаты, пользователю это не нужно.)
// * /
public class Test {
    public static void main(String[] args) throws TestException {
        Set<Double> res = new HashSet<>();

        for (int i = 0; i < TestConsts.N; i++) {
            res.addAll(TestCalc.calculate(i));
        }

        System.out.println(res);
    }
}
