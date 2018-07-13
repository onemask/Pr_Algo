import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        try {
            String result = encryptSHA_1(s);
            System.out.print(result);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }

    //해쉬 함수.
    private static String encryptSHA_1(String s) throws NoSuchAlgorithmException{

    //"SHA1"형식으로 암호화. 객체 생서.
    MessageDigest m =  MessageDigest.getInstance("SHA1");
   // 해쉬값 다이제스트 얻기.
    byte[] result = m.digest(s.getBytes());

    StringBuffer strongBuffer = new StringBuffer();
    for (int i=0;i<result.length; i++){
        strongBuffer.append(Integer.toString((result[i] & 0xff) +0x100, 16).substring(1));
    }

    return strongBuffer.toString();
    }
}
