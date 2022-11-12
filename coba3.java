package coba;
import java.util.*;
public class coba3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String str = in.nextLine();
  
        char[] ch = new char[str.length()];
  
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        
        int x = 0;
        for (char i : ch) {
        	  x++;
        	}
        if (Character.isDigit(ch[0])) {
			System.out.println("Karakter awal tidak boleh angka");
		}else if( str.matches("[0-9]+") ){
            /* A non-alphanumeric character was found, return false */
            System.out.println("Harus memiliki angka");
        }else if( (str.matches("[A-Z0-9]+")) || (str.matches("[a-z0-9]+")) ){
        	System.out.println("Harus memiliki huruf kapital dan huruf kecil");
        }else if (x<8) {
			System.out.println("Kata sandi minimal 8 karakter");
		}else if (x>32) {
			System.out.println("Kata sandi maksimal 32 karakter");
		}else {
			System.out.println("Kata sandi valid");
		}
	}

}
