package HW3;

public class TestGamingTech{

	//main class calling all methods to execute
	public static void main(String[] args) {
	
	 MangementDept Exec = new  MangementDept();
	 Exec.ceoName = "Shumi Mohammed";
	 Exec.cfoName = "Sid Mohammed";
	 Exec.financeDir = "BooBoo";
	 Exec.opsDir = "Latte";
	 System.out.println("**Executives of GamingTech**");
	 System.out.println("CEO: " + Exec.ceoName);	
	 System.out.println("CFO: " + Exec.cfoName);	
	 System.out.println("Finance_Director: " + Exec.financeDir);	
	 System.out.println("Operation_Director: " + Exec.opsDir);	
	 System.out.println();			
	 GamingTech GT = new GamingTech();	
	 GT.HR(10);
	 GT.Marketing(21);
	 GT.Finance(8);
	 GT.Operations(30);
	 GT.Space();
	 System.out.println("**NFL Madden 2030**");
	 GT.GameDevelopemt("01/20/2029");
	 GT.GameProduction("02/20/2029");
	 GT.GameTesting("10/10/2029");
	 GT.GameDeployment("01/01/2030");
	 GT.Space();
	 System.out.println("**NBA Jam 19**");
	 GT.GameDeployment("01/20/2017", "02/10/17");
	 GT.GameProduction("02/20/2017","10/09/18");
	 GT.GameTesting("10/10/2018","12/20/19");
	 GT.GameDeployment("01/01/2019", "01/01/2020");
	 GT.Space();
	 HRDept Employee1 = new HRDept("Kobe", "Bryant", 123321, 100000 );
	 HRDept Employee2 = new HRDept("James", "Conor", 123322, 120000 );
	 GT.Space();
	 FinanceDept maddenBudget = new FinanceDept(355000);
	 FinanceDept nBABudget = new FinanceDept(250000, 0);
	 
	}
}
