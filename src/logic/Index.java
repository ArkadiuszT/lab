/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import data.MyException;
import data.Student;

/**
 * 
 * @author Arek
 */
public class Index {


	public static void main(String[] args) throws MyException{
		Student s = new Student(3.0);
		System.out.println(s.generujMail());
		System.out.println("Siemka");
	}
}
