package HW3;

public class GamingTech extends AbstractCorp implements InterfaceCorp {
// extends abstract class "AbstractCorp and implements interface InterfaceCorp 
	
	//local method created
	public void Space() {
		System.out.println("\n");}
	
	//the following methods had be imported from both abstract class and interface.
	//now i can implement the methods since is is a regular class.
	
	//methods are from interface "InterfaceCorp"
	public void HR(int hrEmployees) {
		System.out.println("Number of Employees in HR department: " + hrEmployees);
	}

	public void Operations(int opEmployees) {
		System.out.println("Number of Employees in Operations department: " + opEmployees);	
	}

	public void Marketing(int marketingEmployees) {
		System.out.println("Number of Employees in Marketing department: " + marketingEmployees);		
	}

	public void Finance(int finEmployees) {
		System.out.println("Number of Employees in Finance department: " + finEmployees);	
	}
    //following methods are from the abstract class "AbstractCorp"
	public void GameProduction(String proStartDate) {
		System.out.println("Production Start Date: " + proStartDate);	
	}
	//method overloading polymorphism
	public void GameProduction(String proStartDate, String endDate) {
		System.out.println("Production Start Date: " + proStartDate + " End Date: " + endDate);	
		}
	public void GameTesting(String testStartDate) {
		System.out.println("Testing Start Date: " + testStartDate);	
	}
	//method overloading polymorphism
	public void GameTesting(String testStartDate, String endDate) {
		System.out.println("Testing Start Date: " + testStartDate+ " End Date: " + endDate);	
	}
	public void GameDeployment(String deployStartDate) {
		System.out.println("Deployment Start Date: " + deployStartDate);	
	}
	//method overloading polymorphism
	public void GameDeployment(String deployStartDate, String endDate) {
		System.out.println("Deployment Start Date: " + deployStartDate + " End Date: " + endDate);	
		}
	public void GameDevelopemt(String proStartDate) {
		System.out.println("Development Start Date: " + proStartDate);
	}
	//method overloading polymorphism
	public void GameDevelopemt(String proStartDate, String endDate) {
		System.out.println("Development Start Date: " + proStartDate+ " End Date: " + endDate);
		}
}
