package intro;

public class VariablesEx3 {

	static String nationality = "Indian";  //static g.v
	
	int aadhar; //instance g.v
	
	public static void main(String[] args) {
		
		VariablesEx3 ramesh = new VariablesEx3();
		
		VariablesEx3 suresh = new VariablesEx3();
		
		VariablesEx3 naresh = new VariablesEx3();
		
		ramesh.aadhar = 100;suresh.aadhar = 200;naresh.aadhar= 300;
		
		
		System.out.println("Ramesh :- Nationality = "+ramesh.nationality +"\t\t"+"Aadhar = " +ramesh.aadhar);
		
		System.out.println("Suresh :- Nationality = "+suresh.nationality+"\t\t" +"Aadhar = " +suresh.aadhar);
		
		System.out.println("Naresh :- Nationality = "+naresh.nationality+"\t\t" +"Aadhar = " +naresh.aadhar);
		
		
		
	}
	
	
}
