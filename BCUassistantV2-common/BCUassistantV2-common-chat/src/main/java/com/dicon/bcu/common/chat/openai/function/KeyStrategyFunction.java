package com.dicon.bcu.common.chat.openai.function;

/**
 * @Author: dyc
 * @Create: 2025/12/2 22:01
 */
@FunctionalInterface
public interface KeyStrategyFunction<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    R apply(T t);

}