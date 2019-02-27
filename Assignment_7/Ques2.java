import java.util.Scanner;

public class Ques2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = s.nextLine();
        String srt_str = "";
        char[] str_arr = str.toCharArray();
        for(int i=0;i<str_arr.length;i++){
            char temp;
            for(int j=i+1;j<str_arr.length;j++){
                if(str_arr[i]>str_arr[j]){
                    temp = str_arr[i];
                    str_arr[i] = str_arr[j];
                    str_arr[j] = temp;
                }
            }
            srt_str = srt_str + str_arr[i];
        }
        System.out.println("Sorted String: "+ srt_str);
    }
}
