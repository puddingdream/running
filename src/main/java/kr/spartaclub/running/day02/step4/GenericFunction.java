package kr.spartaclub.running.day02.step4;

@FunctionalInterface
interface GenericFunction<T, R> {
    R apply(T t);
}
