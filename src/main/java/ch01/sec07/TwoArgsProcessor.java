package ch01.sec07;

@FunctionalInterface
public interface TwoArgsProcessor<X> {
    X process(X arg1, X arg2);
}
