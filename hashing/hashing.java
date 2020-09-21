import java.util.*;  

public class hashing {

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("What to hash:");
	
	String str = sc.nextLine(); 
	
	System.out.println(str.hashCode());	

    }
}