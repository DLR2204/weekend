package multithreading;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String name1 = "apple";
		
		String name2 = "apple";
		
		System.out.println(name1==name2);//true
		
		System.out.println(name1.equals(name2));//true
		
		System.out.println(name1.compareTo(name2));//0
		
		System.out.println("-------------");
		
		String name3 = new String("apple");
		
		String name4 = new String("apple");
		
		System.out.println(name3==name4);//
	
		System.out.println(name3.equals(name4));//
		
		System.out.println(name3.compareTo(name4));//
		
		
		
		
		
	}

}
