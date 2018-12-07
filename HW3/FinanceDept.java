package HW3;

public class FinanceDept{
	
	//static variables
	static long maddenBudget;
	static long nBABudget;
	
	FinanceDept(){}
	
	//constructor with parameters
	FinanceDept(long budget){
	this.maddenBudget = budget;
	System.out.println("Budget for Madden Project: " + budget);
	}
	//polymorphism constructor with parameters
	FinanceDept(long budget2, long fake){
		System.out.println("Budget for NBA Project: " + budget2);
		}
}
 