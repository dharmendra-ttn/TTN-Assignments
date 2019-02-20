import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cntUpparCase=0;
        int cntLowerCase=0;
        int cntDigits=0;
        int cntSpec=0;
        System.out.println("Enter String : ");
        String str = s.nextLine();
        for(char temp : str.toCharArray()){
        
            if(Character.isLowerCase(temp)){
                cntLowerCase++;
            }else if(Character.isUpperCase(temp)){
                cntUpparCase++;
            }else if(Character.isDigit(temp)){
                cntDigits++;
            }else{
                cntSpec++;
            }
        }
        int strLength = str.length();
        System.out.println("Number of LowerCase Characters : " + cntLowerCase);
        System.out.println("Percentage of LowerCase Characters : " + ((float)cntLowerCase/strLength)*100);
        System.out.println("Number of UpparCase Characters : " + cntUpparCase);
        System.out.println("Percentage of UpparCase Characters : " + ((float)cntUpparCase/strLength)*100);
        System.out.println("Number of Digits Characters : " + cntDigits);
        System.out.println("Percentage of Digits Characters : " + ((float)cntDigits/strLength)*100);
        System.out.println("Number of Special Characters : " + cntSpec);
        System.out.println("Percentage of Special Characters : " + ((float)cntSpec/strLength)*100);
    }
   
}
