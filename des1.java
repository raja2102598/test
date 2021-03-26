import javax.crypto.*;
import java.security.*;

public class des1{
    public static void main(String[] args){
        try{
            KeyGenerator keygenerator=KeyGenerator.getInstance("DES");
            SecretKey key=keygenerator.generateKey();
            Cipher desCipher;
            desCipher =Cipher.getInstance("DES");
            desCipher.init(Cipher.ENCRYPT_MODE,key);
            byte[] str="Raja".getBytes();
            byte[] Encrypted=desCipher.doFinal(str);
            System.out.println(Encrypted);
            desCipher.init(Cipher.DECRYPT_MODE,key);
            byte[] decrypted=desCipher.doFinal(Encrypted);
            System.out.println(new String(decrypted));


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}