package multithreading;

public class StringEx {
	
	public static void main(String[] args) {
		
		String name = "Hyderabad";  //string literal
		
//		System.out.println(name.concat(" Biryani"));
		
		name.concat(" Biryani");
		
		System.out.println(name);
		
		System.out.println("--------------");
		
		StringBuffer name1 =  new StringBuffer("Hyderabad");
		
		name1.append(" Biryani");
		
		System.out.println(name1);
	}

}
