package week1.day2;

public class Employeeinfo {
public void printcompanyaddress() {
	
System.out.println("THOOTHUKUDI ");
}
public String getCompanyAddress() {

System.out.println("i am giving company address");
return "MADURA ";
}
	public static void main(String[] args) {
	
 Employeeinfo ei = new Employeeinfo();
 ei.printcompanyaddress();
 System.out.println(ei.getCompanyAddress());
	}
 
}
