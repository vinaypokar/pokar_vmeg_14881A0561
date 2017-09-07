import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Collections;

public class StudentGroup implements GroupOperationService {

	private Student[] students;
	
	public StudentGroup(int length) {

	}

	@Override
	public Student[] getStudents() {
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		this.students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		llStudents.addFirst(student);
		students=llStudents.toArray();
	}

	@Override
	public void addLast(Student student) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		llStudents.addLast(student);
		students=llStudents.toArray();
	}

	@Override
	public void remove(int index) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		llStudents.remove(index);
		students=llStudents.toArray();
	}

	@Override
	public void remove(Student student) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		llStudents.remove(student);
		students=llStudents.toArray();
	}

	@Override
	public void removeFromIndex(int index) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		for(int i=index;i<llStudents.size();i++){
			llStudents.remove(i);
		}
		students=llStudents.toArray();
	}

	@Override
	public void removeFromElement(Student student) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		int index=llStudents.indexOf(student);
		for(int i=index;i<llStudents.size();i++){
			llStudents.remove(i);
		}
		students=llStudents.toArray();
	}

	@Override
	public void removeToIndex(int index) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		for(int i=0;i<index;i++){
			llStudents.remove(i);
		}
		students=llStudents.toArray();
	}

	@Override
	public void removeToElement(Student student) {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		int index=llStudents.indexOf(student);
		for(int i=0;i<index;i++){
			llStudents.remove(i);
		}
		students=llStudents.toArray();
	}

	@Override
	public void bubbleSort() {
		LinkedList<Student> llStudents = new LinkedList<Student>(Arrays.asList(students));
		Collections.sort(llstudents);
		students=llStudents.toArray();
	}

	@Override
	public Student[] getByBirthDate(Date date) {

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {

	}

	@Override
	public Student[] getStudentsByAge(int age) {

	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {

	}

	@Override
	public Student getNextStudent(Student student) {

	}

	@Override
	public void add(Student student, int index) {

	}

	private int getStudentIndex(Student student) {

	}

	private int getDiffYears(Date first, Date last) {

	}

	private Calendar getCalendar(Date date) {

	}
}