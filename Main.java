package practice;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
Studentop service=new Studentop();
while(true) {
System.out.println("1.create student \n2.view student\n 3.search student\n 4.update student\n5.delete student\n6.exit program");
System.out.println("enter choice");
int choice=scan.nextInt();
switch(choice)
{
case 1:System.out.println("enter id:");
int id=scan.nextInt();
scan.nextLine();
System.out.println("enter name:");
String name=scan.nextLine();
System.out.println("enter marks:");
int marks=scan.nextInt();
Student s=new Student(name,marks,id);
service.addStudent(s);
System.out.println("student details  added successfuly");
break;
case 2:
service.viewStudent();
System.out.println("details of all students");
break;
case 3:System.out.println("enter id");
int searchId=scan.nextInt();
service.searchStudent(searchId);
System.out.println("student details searched");
break;
case 4:System.out.println("enter details to update");
System.out.println("enter id");
int updateId=scan.nextInt();
System.out.println("enter new marks");
int newmarks=scan.nextInt();
scan.nextLine();
System.out.println("enter new name");
String newname=scan.nextLine();

service.updateStudent(updateId,newname,newmarks);
break;
case 5:System.out.println("enter id to delete");
int delId=scan.nextInt();
service.deleteStudent(delId);
System.out.println("student details deleted succesfuly");
break;
case 6:System.out.println("program exited");
return;
default:System.out.println("invalid input");
}
}
}
}
