package lista3;

public class Ex8 {

	public static void main(String[] args) {
		
		int n [] = new int [50];
		
		n[0] = 1;
		n[1] = 1;
		
		for (int i = 2; i < n.length; i++) {
			
			n [i] = n [i-1] + n [i - 2];
		
			
		 	System.out.println(n);
		}
		
		
		
		
				

	}

}
