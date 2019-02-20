import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = s.nextLine();
        String[] strArray = str.split(" ");
        for(int i=0;i<strArray.length;i++){
            int count=1;
            for(int j=i+1;j<strArray.length;j++){
                if(strArray[i].equals(strArray[j])){
                    count++;
                    strArray[j] = "_tmp";
                }
            }
            if(strArray[i]!="_tmp") {
                System.out.println(strArray[i] + " Occured " + count + " times");
            }
        }
    
    }
}
