package com.example;

/**
 * i를 k로 나눈 값을 반환한다.
 *
 * @param i
 * @param k
 * @author A
 * @return
 * @throws ArithmeticException
 */
class ExceptionObj1 {
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        value = i / k;
        return value;
    }
}
