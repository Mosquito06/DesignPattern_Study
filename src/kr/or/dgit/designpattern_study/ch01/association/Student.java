package kr.or.dgit.designpattern_study.ch01.association;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private List<Course> courses;

	public Student() {
		super();
		courses = new ArrayList<>();
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
