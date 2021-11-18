/**
 * 
 */
package com.lti.service;

import java.util.Iterator;
import java.util.List;

import com.lti.bean.Course;

/**
 * @author user256
 *
 */
public class StudentOperations implements StudentInterface{

	public void displayCourses(List<Course> courses) {
		// TODO Auto-generated method stub
		/*Iterator<Course> i=courses.iterator();
		while(i.hasNext()){
			
			System.out.println(courses.get(i));
		}*/
	       for (Course value : courses) {
	       	    
	       	    System.out.println("Course Id: " + value.getCourseId()+" Course Name: "+value.getCourseName());
	       	}
	    
		
	}

	public void optCourse(int studentId,int courseId) {
		// TODO Auto-generated method stub
		
	}

	public void dropCourse() {
		// TODO Auto-generated method stub
		
	}

	public void viewRegisteredCourses() {
		// TODO Auto-generated method stub
		
	}

	public void updateCourseDetails() {
		// TODO Auto-generated method stub
		
	}

	public void viewReport() {
		// TODO Auto-generated method stub
		
	}

}
