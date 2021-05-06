package vive;



import java.util.Scanner;

public class Student {
private String studentname;
 private int[] marks = new int[6];
 public String getstudentname() {
return studentname;

 }
 
 public void setstudentname(String name) {
this.studentname=name;
 }
 public int[] getmarks() {
     return marks;
 }
 public void setmarks(int setmarks)
 {
 for(int i = 0 ; i<5 ; i++){
 marks[i] += setmarks;
 }
 }
void displaydetail() {
System.out.println("student details are:");
System.out.println("the student name is:"+studentname);
for(int v=1;v<6;v++) {
System.out.println("subject"+" "+v+" "+"marks="+" "+marks[v]);
}
}



public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.println("Enter the number of students:");
 int totalstudents =  Integer.parseInt(in.nextLine().trim());


Student stu[]=new Student[totalstudents];
for(int a = 0; a < totalstudents; a++) {

    stu[a] = new Student();
}

for (int i = 0; i < totalstudents; i ++) {

System.out.println("Student Name:");
stu[i].studentname=in.next();
for(int m=1;m<6;m++) {
System.out.println("enter the mark of subject:"+m+":");
stu[i].marks[m]=in.nextInt();
in.nextLine();
}
}

for(int j=0;j<totalstudents;j++) {

stu[j].displaydetail();

}

}
}
