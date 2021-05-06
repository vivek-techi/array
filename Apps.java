package vive;

class Student{
public int id;
public String name;
public String degree;
public String college;
//getter
public int getId() {
return id;
}
public String getName() {
return name;
}
public String getDegree() {
return degree;
}
public String getCollege() {
return college;
}
//setter
public void setId(int newId) {
this.id= newId;
}
public  void setName(String newName) {
this.name=newName;
}
public void setDegree(String newDegree) {
this.degree=newDegree;
}
public void setCollege(String newCollege) {
this.college=newCollege;
}
}
//student class ends

//child class 1 of parent class student
class EngineeringStudent extends Student{
void displaystudentprofile() {
System.out.println("The EngineeringStudent details are:");
System.out.println("The Name is:"+name);
System.out.println("ID of"+" "+name+" "+"is:"+" "+id);
System.out.println("Degree of"+" "+name+" "+"is:"+" "+degree);
System.out.println("College Name of"+" "+name+" "+"is:"+" "+college);
System.out.println("");
}
}//end of EngineeringStudent class

//child class 2 of parent class student
 class ArtAndScienceStudent extends Student{
void displaystudentprofile() {
System.out.println("The ArtAndScienceStudent details are:");
System.out.println("The Name is:"+name);
System.out.println("ID of"+" "+name+" "+"is:"+" "+id);
System.out.println("Degree of"+" "+name+" "+"is:"+" "+degree);
System.out.println("College Name of"+" "+name+" "+"is:"+" "+college);
}
}//end of ArtAndScienceStudent class

 
 // Main method
public class Apps{
public static void main(String[] args) {

//Object created for EngineeringStudent class
EngineeringStudent engineer=new EngineeringStudent();
         engineer.setId(32123);//using Inheritance
         engineer.setName("Saran");
         engineer.setDegree("B.TECH");
         engineer.setCollege("Anna University");
         engineer.displaystudentprofile();//calling a method
         
       //Object created for ArtAndScienceStudent class      
  ArtAndScienceStudent Scientist=new ArtAndScienceStudent();
  Scientist.setId(11211);//using Inheritance
  Scientist.setName("Arun");
  Scientist.setDegree("MCA");
  Scientist.setCollege("Madras Univeristy");
  Scientist.displaystudentprofile();//calling a method
}
}


