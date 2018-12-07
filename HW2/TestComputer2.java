package HW2;

public class TestComputer2 {

	public static void main(String[] args) {
		
		Computer supportTicket3 = new Computer();
		Computer supportTicket4 = new Computer();
		
		Computer newline = new Computer();
		
		supportTicket3.model = "MacBook";
		supportTicket3.floor = 6;	
		supportTicket3.ticket = 21249;
		supportTicket3.os = "iOS";	
		supportTicket3.company = "TECHteam"; //last company used was set to static ("mindTECH") so it will output last string used  
		supportTicket3.manager = "Mohammed"; //last value used for variable manager was "Ilias" in this static variable. Will print out "Ili
		
		supportTicket4.model = "Lenovo";
		supportTicket4.floor = 1;	
		supportTicket4.ticket = 21251;
		supportTicket4.os = "Windows";
	    supportTicket4.company = "mindTECH"; 
		supportTicket4.manager = "Ilias"; 
		
		supportTicket3.cpuPrint();
		newline.space();
		supportTicket4.cpuPrint();
		newline.space();
		Computer supportTicket1 = new Computer("Mindshift", 201323);
		newline.space();
		Computer supportTicket2 = new Computer("SHUMITech", 212432);
		
	}
	
}

