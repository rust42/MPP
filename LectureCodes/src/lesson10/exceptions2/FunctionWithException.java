package lesson10.exceptions2;

@FunctionalInterface
public interface FunctionWithException<T, R> {
	R apply(T t) throws Exception;
}
