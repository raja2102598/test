public class vigCipher{
	public static String encode(String text,String key){
		String res="";
		text=text.toUpperCase();
		for(int i=0,j=0;i<text.length();i++){
			char c=text.charAt(i);
			if(c<'A' || c>'Z'){
				continue;
			}
			res +=(char)((c+key.charAt(j) -2 *'A')%26 +'A');
			j=++j%key.length();
		}
		return res;
	}
	public static String decode(String text,String key){
		String res="";
		text=text.toUpperCase();
		for(int i=0,j=0;i<text.length();i++){
			char c=text.charAt(i);
			if(c<'A' || c>'Z'){
				continue;
			}
			res +=(char)((c-key.charAt(j) +26)%26 +'A');
			j=++j%key.length();
		}
		return res;
	}
	public static void main(String[] args){
		String key = "HELLO";
        	String msg = "THECRAZYPROGRAMMER";
        	System.out.println("Simulating Vigenere Cipher\n------------------------");
        	System.out.println("Input Message : " + msg);
        	String enc = encode(msg, key);
        	System.out.println("Encrypted Message : " + enc);
        	System.out.println("Decrypted Message : " + decode(enc, key));
		
	}	
}