public class Ques6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 5, 5, 4};
        int count;
        for(int a1 : arr){
            count=0;
            for(int a2 : arr){
                if(a1 == a2){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("Element with Single Occurances : " + a1);
                break;
            }
        }
    }
}

