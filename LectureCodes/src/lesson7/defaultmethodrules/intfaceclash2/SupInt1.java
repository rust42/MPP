package lesson7.defaultmethodrules.intfaceclash2;

public interface SupInt1 extends Top {
	default void myMethod(int x) {
		System.out.println(x + x);
	}
}
