package lesson3.polymorphism2;

public class Faculty extends StaffPerson {
	private String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double computeStipend() {
		return 4000.0;
	}
}
