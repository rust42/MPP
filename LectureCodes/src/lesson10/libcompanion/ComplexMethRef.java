package lesson10.libcompanion;
import java.util.function.*;
import java.util.*;
import java.util.stream.Collectors;

public class ComplexMethRef {
	static Function<List<Employee>, List<Employee>> employeeSorter =
			list -> list.stream()
	        .sorted(LibraryCompanion::compareEmps)
	        .collect(Collectors.toList()); 
}
