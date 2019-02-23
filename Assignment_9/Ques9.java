import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Language Code: ");
        String langCode = s.nextLine();
        System.out.println("Enter Country Code: ");
        String countryCode = s.nextLine();
        Date date = new Date();
        Locale locale = new Locale(langCode,countryCode);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println("Date : "+df.format(date));
    }
}
