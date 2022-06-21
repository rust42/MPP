package exampractise.FinalSolution;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	// name and type of lambda goes here
	static BiPredicate<Double, Double> predicate1 = (x, y) -> x * y < x + y;





	// representing lambda as a method reference

	static BiPredicate<Double, Double> predicate2 = Problem1::isMultipliedSmallerThanAddition;

	static boolean isMultipliedSmallerThanAddition(Double x, Double y) {
		return x * y < x + y;
	}
	

	//representing lambda as a static nested class
	static class MultiplierSmallerThanAddition implements BiPredicate<Double, Double>  {

		@Override
		public boolean test(Double aDouble, Double aDouble2) {
			return aDouble * aDouble2 < aDouble + aDouble2;
		}
	}
	
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		predicate1.test(2.1, 0.35);
		predicate2.test(2.1, 0.35);
		(new MultiplierSmallerThanAddition()).test(2.1, 0.35);
	}
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
