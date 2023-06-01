package com.students.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Display student");
			System.out.println("PRESS 4 to Exit Student app");
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add student to database
				System.out.println("Enter student name  : ");
				String name = br.readLine();
				
				System.out.println("Enter  student mobno : ");
				String mobno = br.readLine();
				
				System.out.println("Enter student age : ");
				 int age = br.read();
				
				//create a object to store student data
				Student st = new Student(name,mobno,age);
				
				boolean answer = StudenDao.inserStudentIntoDb(st);
				if(answer) {
					System.out.println("Student is added successfully....");
				}
				else {
					System.out.println("something went to worng....try again");
				}
				System.out.println(st);
			}
			else if(c == 2) {
				//Delete the student
				
				
			}
			else if (c == 3) {
				//Display the student
				
			}
			else if (c == 4) {
				//exit the student 
				break;
			}
			else {
				System.out.println("Invalid option.....");
			}
			
			
			
		}
	}

}
