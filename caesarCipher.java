import java.util.*;

public class caesarCipher {
    public static String encode(String str,int offset){
        offset=offset % 26 +26;
        StringBuilder Encoded =new StringBuilder();
        for(char i: str.toCharArray()){
            if(Character.isLetter(i)){
                if(Character.isUpperCase(i)){
                    Encoded.append((char)('A'+(i-'A'+offset)%26));
                }
                else{
                    Encoded.append((char)('a'+(i-'a'+offset)%26));
                }
            }
            else {
                Encoded.append(i);
            }
        }
        return  Encoded.toString();
    }
    public static String decode(String str,int offset){
        return  encode(str,26-offset);
    }
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        String input=Scan.nextLine();
        String EncodedStr= encode(input,3);
        System.out.print(EncodedStr + "\n");
        String DecodedStr=decode(EncodedStr,3);
        System.out.print(DecodedStr);
    }
}
