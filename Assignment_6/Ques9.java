enum House_Details{
    HOUSE1(1000), HOUSE2(2000), HOUSE3(3000), HOUSE4(4000);
    
    private int price;
    
    House_Details(int new_price){
        price = new_price;
    }
    
    public int getPrice() {
        return price;
    }
}
public class Ques9 {
    
    public static void main(String[] args) {
        for(House_Details h : House_Details.values()){
            System.out.println("House Name : " + h + " Price : "+h.getPrice());
        }
    }
    
}

