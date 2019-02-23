import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class SpecialStack{
    int MAX = 10;
    List<Integer> lst = new LinkedList<>();
    void push(int i){
        if(lst.size() < MAX) {
            lst.add(i);
            System.out.println(i + " Added Successfully");
        }else {
            System.out.println("Stack Overflow : Insert Failed");
        }
        }
    void pop(){
        if(lst.size()>0) {
            System.out.println(lst.get(lst.size()-1) + " Removed Successfully");
            lst.remove(lst.size()-1);
        }else{
            System.out.println("Stack Underflow : Stack is Empty");
        }
    }
    void isEmpty(){
        if(lst.isEmpty()){
            System.out.println("Stack is Empty");
        }else {
            System.out.println("Stack is not Empty");
        }
    }
    void isFull(){
        if(lst.size() == MAX){
            System.out.println("Stack is Full");
        }else{
            System.out.println("Stack is not Full");
        }
    }
    int getMin(){
        if(lst.isEmpty()){
            System.out.println("Stack is Empty Returning 0");
            return 0;
        }
        return Collections.min(lst);
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SpecialStack specialStack = new SpecialStack();
        while(true){
            System.out.println("+++++SPECIAL STACK+++++");
            System.out.println("1. Push a value");
            System.out.println("2. Pop a value");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Check if Stack is Full");
            System.out.println("5. Get Min Value");
            System.out.println("6. EXIT");
            
            switch (s.nextInt()){
                case 1:
                    System.out.println("Enter Value: ");
                    specialStack.push(s.nextInt());
                    break;
                case 2:
                    specialStack.pop();
                    break;
                case 3:
                    specialStack.isEmpty();
                    break;
                case 4:
                    specialStack.isFull();
                    break;
                case 5:
                    System.out.println("Min value: "+ specialStack.getMin());
                    break;
                default:
                    System.out.println("STACK DATA: " + specialStack.lst);
                    System.exit(0);
            }
        }
    }
}
