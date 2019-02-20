public class Ques5 {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 1, 2, 3,4, 6, 5};
        int[] arr2 = {2, 1, 3, 4};
        
        sort_me(arr1);
        
        boolean flag;
        System.out.println("Common Elements : ");
        for(int i=0;i<arr1.length-1;i++){
            flag = false;
            if(arr1[i]<arr1[i+1] ){
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        flag = true;
                        continue;
                    }
                }
            }
            if (flag) {
                System.out.println(arr1[i]);
            }
        }
    }
    
    static void sort_me(int arr1[]){
        for (int i = 0; i < arr1.length; i++) {
            int temp;
            for (int j = i + 1; j < arr1.length; j++) {
            
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[i] = temp;
                }
            
            }
        
        }
    }
}
