public class Ques8 {
    public static void main(String[] args) {
        String str = "Hello World";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Original String : "+ str);
        System.out.println("Reversed String : " + rev);
        
        StringBuffer strbuf = new StringBuffer(rev);
        strbuf.replace(4,9,"");
        System.out.println("Removed Sring : " + strbuf);
    }
}
