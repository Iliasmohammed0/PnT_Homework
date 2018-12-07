package HW2;

public class Computer {
	
	String model;
	String os;
	int floor; 
	int ticket;
    static String company;
    static String manager;
    static String ManagingDirector = "Shumi";
    static String nextLine = ("\n");
    static String tab = ("-->");
    
    public void space() {
	System.out.print(nextLine);
    	 }
    
    public void cpuPrint() { 
	System.out.println(tab + " Open Cases: " + "Ticket#: "+ ticket + "\n" + "Company: " + company + ", " + "Manger: " + manager + 
			"\n" + "Floor: " + floor + ", " + "Model: " + model + ", OS Version: " + os );
	}	
    
    public static void assignMgrDir() { 
    	System.out.println(tab + "Company: " + company + "\n" + "Managing Director: " + ManagingDirector);
    }	
    
   Computer() {} //construct default
    
   public Computer(String company, int ticket) //construct 
    { 
    	this.company = company; 
        this.ticket = ticket;
        System.out.println(tab + " Closed Cases: " + "Ticket# " + ticket + " " + "Company: " + company);
    } 	
   
   public Computer(String model, String os, int floor ) 
   {
	   this.model = model;
	   this.os = os;
	   this.floor = floor;
	   System.out.println(model + os + floor);
   }
   
 }
