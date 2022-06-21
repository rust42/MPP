package prob1;

import java.util.function.BiFunction;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class Problem1 {
	BiFunction<Double, Double, Boolean> lambda = new BiFunction<Double, Double, Boolean>() {
		@Override
		public Boolean apply(Double aDouble, Double aDouble2) {
			return aDouble * aDouble2 < aDouble + aDouble2;
		}
	};


	// name and type of lambda goes here
	
	
	// representing lambda as a method reference
	
	
	
	//representing lambda as a static nested class
	
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		
		
		
	}
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
	
}
