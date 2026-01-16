package kr.spartaclub.running.day02.step4;

@FunctionalInterface
public interface GenericPredicate<T> {
    boolean test(T t);
}