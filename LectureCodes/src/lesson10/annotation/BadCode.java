package lesson10.annotation;

@BugReport(assignedTo="Corazza", severity=1)
public class BadCode {
	
	public int add(int x, int y) {
		return x - y;
		
	}
}
