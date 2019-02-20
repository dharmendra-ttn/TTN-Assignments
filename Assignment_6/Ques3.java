public class Ques3 {
    public static void main(String[] args) {
        String str = "Random String Containing Random Words";
        int count;
        str = str.toLowerCase();
        count = str.length() - str.replaceAll("a","").length();
        System.out.println("Occurences of 'a' : " + count);
    }
}
