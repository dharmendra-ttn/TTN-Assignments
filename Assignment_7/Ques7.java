import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ques7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sec = s.nextInt();
//        int day = sec/86400;
//        int rem_sec = sec%86400;
//        int hour = rem_sec/3600;
//        int rem_secs = rem_sec%3600;
//        int minute = rem_secs/60;
//        int rem_secss = rem_sec%60;
//
//        System.out.println("days: "+ day + " hours: "+ hour + " minute: "+ minute + " sec: "+ rem_secss);
    
        int day = (int) TimeUnit.SECONDS.toDays(sec);
        int hours = (int)TimeUnit.SECONDS.toHours(sec) - (day*24);
        int minute = (int)(TimeUnit.SECONDS.toMinutes(sec) - TimeUnit.SECONDS.toHours(sec)* 60);
        int secs = (int)(TimeUnit.SECONDS.toSeconds(sec)- TimeUnit.SECONDS.toMinutes(sec)*60);
    
        System.out.println("days: "+ day + " hours: "+ hours + " minute: "+ minute + " sec: "+ secs);
        
    }
}
