package coba;

public class coba2 {
	public static void main(String[] args) {
		String s = "Berikut adalah kisah sang gajah. Sang gajah memiliki teman serigala bernama DoeSang. Gajah sering dibela oleh serigala ketika harimau mendekati gajah";
		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    // You may want to check for a non-word character before blindly
		    // performing a replacement
		    // It may also be necessary to adjust the character class
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase("sang") && words[i+1].equalsIgnoreCase("gajah")) {
				System.out.print("sang gajah");
				System.out.print(" - ");
			}else if (words[i].equalsIgnoreCase("serigala")) {
				System.out.print("serigala");
				System.out.print(" - ");
			}else if (words[i].equalsIgnoreCase("harimau")) {
				System.out.print("harimau");
			}
		}
	}
}
