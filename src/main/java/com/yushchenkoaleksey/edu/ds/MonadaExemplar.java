package com.yushchenkoaleksey.edu.ds;

import java.util.function.Function;

public class MonadaExemplar {

    public static class Monad<T>{

        final T value;

        private Monad(T value){
            this.value = value;
        }

        public static <T> Monad<T> from(T value){
            return new Monad<>(value);
        }

        public <U> Monad<U> map(Function<T, U> mapFunc){
            return flatMap(value -> new Monad<>(mapFunc.apply(value)));
        }

        public <U> Monad<U> flatMap(Function<T, Monad<U>> mapFunc){
            return mapFunc.apply(value);
        }
    }

}
