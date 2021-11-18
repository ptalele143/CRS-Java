/**
 * 
 */
package com.lti.service;
import java.util.List;

import com.lti.bean.Course;

/**
 * @author user256
 *
 */
public interface StudentInterface {

	public void displayCourses(List<Course> courses);
	public void optCourse(int studentId,int courseId);
	public void dropCourse();
	public void viewRegisteredCourses();
	public void updateCourseDetails();
	public void viewReport();
}
