class Collage{
String collagename="Amrita School of engineering";
String address="andhra pradesh";
public void showcollegedetails(){
	System.out.println("Collage name="+collagename);
	System.out.println("Address="+address);
}
}
class Department extends Collage{
String departmentname="computer science";
String hod=".......";
public void showdepartmentdetails(){
	System.out.println("department name="+departmentname);
	System.out.println(" hod="+ hod);
}
}
class Facultymembers extends Department{

String facultyname=".....";
String facultyqualification="phd";
String experiance="5 years";
public void facultydetails(){
	System.out.println("facultyname="+facultyname);
	System.out.println(" faculty qualification="+ facultyqualification);
	System.out.println(" experiance="+ experiance);
}
}

class Main{
public static void main(String [] args){
Collage c=new Collage();
c.showcollegedetails();
System.out.println();
Department d=new Department();
d.showcollegedetails();
d.showdepartmentdetails();
System.out.println();
Facultymembers f=new Facultymembers();
f.showcollegedetails();
f.showdepartmentdetails();
f.facultydetails();
}
}
