package practice;

public class Student {
private String name;
private int marks;
private int id;
public Student(String name,int marks,int id)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}
public int getMarks()
{
	return this.marks;
}
public int getId()
{
	return this.id;
}
public String getName()
{
	return this.name;
}
public void setName(String name)
{
	this.name=name;
}
public void setMarks(int marks)
{
	this.marks=marks;
}
public void setId(int id)
{
	this.id=id;
}
public String toString()
{
	return  "name  : "+ name + "\n"+
			"id    : "+ id +"\n"+
			"marks : "+ marks ;
}
}
