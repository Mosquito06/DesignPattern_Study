package kr.or.dgit.designpattern_study.ch01.association;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private List<Course> courses;
	private String name;

	public Student(String studentName) {
		super();
		courses = new ArrayList<>();
		this.name = studentName;
	}

	public String getName() {
		return name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void registerCouse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		courses.remove(course);
	}

}
