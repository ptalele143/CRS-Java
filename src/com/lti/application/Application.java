/**
 * 
 */
package com.lti.application;

import java.util.ArrayList;
import java.util.List;

import com.lti.bean.Course;
import com.lti.bean.Student;
import com.lti.service.StudentInterface;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.lti.service.StudentOperations;

/**
 * @author user256
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course();
		Course c2=new Course();
		Course c3=new Course();
		Course c4=new Course();
		Course c5=new Course();
		Course c6=new Course();
		Course c7=new Course();
		
		c1.setCourseId(1);
		c1.setCourseName("Physics");
		c1.setDept("Engineering");
		c1.setPreReq("preReq1");
		c1.setProf("ProfA");
		c1.setSemester("semesterA");
		c1.setBill(1000.0);
		
		
		c2.setCourseId(2);
		c2.setCourseName("Maths");
		c2.setDept("Engineering");
		c2.setPreReq("preReq2");
		c2.setProf("ProfB");
		c2.setSemester("semesterB");
		c2.setBill(1100.0);
		
		c3.setCourseId(3);
		c3.setCourseName("Chem");
		c3.setDept("Engineering");
		c3.setPreReq("preReq3");
		c3.setProf("ProfC");
		c3.setSemester("semesterC");
		c3.setBill(1000.0);
	
		c4.setCourseId(4);
		c4.setCourseName("Mechanics");
		c4.setDept("Engineering");
		c4.setPreReq("preReq4");
		c4.setProf("ProfD");
		c4.setSemester("semesterD");
		c4.setBill(1500.0);
	    
		StudentInterface operations=new StudentOperations();
		
		List<Course> courses= new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		courses.add(c4);
		
		operations.displayCourses(courses);
		
		Student s1=new Student();
		
		
		//operations.optCourse();
	}

}
