package kr.or.dgit.designpattern_study.ch01.association;

import java.util.Iterator;

public class CourseTest {

	public static void main(String[] args) {
		Student student = new Student();
		
		Course math = new Math();
		Course eng = new Eng();
		Course kor = new Kor();
		
		student.registerCouse(math);
		student.registerCouse(eng);
		student.registerCouse(kor);
		
		Iterator<Course> courses = student.getCourses().iterator();
		
		while(courses.hasNext()) {
			System.out.println(courses.next().toString());
		}
	}

}
