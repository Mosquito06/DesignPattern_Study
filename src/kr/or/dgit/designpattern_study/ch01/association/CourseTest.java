package kr.or.dgit.designpattern_study.ch01.association;

import java.util.Iterator;

public class CourseTest {

	public static void main(String[] args) {
		Student student = new Student("배재진");
		
		Course math = new Math();
		Course eng = new Eng();
		Course kor = new Kor();
		
		student.registerCouse(math);
		student.registerCouse(eng);
		student.registerCouse(kor);
		
		Iterator<Course> courses = student.getCourses().iterator();
		
		while(courses.hasNext()) {
			System.out.printf("%s 학생이 수강한 과목은 %s 입니다.\n", student.getName(), courses.next().toString());
		}
	}

}
