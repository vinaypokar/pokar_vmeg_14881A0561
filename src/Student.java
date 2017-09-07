import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id=id;
		this.fullName=fullName;
		this.birthDate=birthDate;
		this.avgMark=avgMark;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id=id;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName=fullName;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate=birthDate;
	}

	public double getAvgMark() {
		return this.avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark=avgMark;
	}

	@Override
	public boolean equals(Object o) {

	}

	@Override
	public int hashCode() {

	}

	@Override
	public int compareTo(Object o) {

	}
}