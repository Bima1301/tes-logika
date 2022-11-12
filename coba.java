package coba;
import java.util.*;

public class coba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 3;
		int b = 7;
		int n = in.nextInt();
		int p =1;
		int i = 1; 
		do {
			i++;
			if ((i%a == 0) || (i%b == 0)) {
				p ++;
				
				if ((i%a == 0) && (i%b == 0)) {
					System.out.print("Z");
				}else {
					System.out.print(i);
				}
			}
		} while (p<=n);
		
		
	}

}
