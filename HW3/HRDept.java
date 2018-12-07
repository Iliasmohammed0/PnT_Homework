package HW3;

public class HRDept extends MangementDept {
	
	//local private variables
	private String eFirstName; 
	private String eLastName; 
	private int employeeID; 
	private int employeeSalary; 
	private static int employeeLocationID = 1201;
	
	//constructor using private variables to be used in TestGamingTech class
	HRDept(String FN, String LN, int ID, int Salary) {
		this.eFirstName = FN;
		this.eLastName = LN;
		this.employeeID = ID;
		this.employeeSalary = Salary;
		System.out.println("Employee Name: " + FN + " " + LN + " ID: " + ID + " Salary: " + Salary + " Location_ID: " + employeeLocationID);		
	}
	
}
