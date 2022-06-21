package Lab9.prob10.A;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

	}

	
	public boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.map(a -> a.flag)
				.reduce(false,  Boolean::logicalOr);

	}

}
