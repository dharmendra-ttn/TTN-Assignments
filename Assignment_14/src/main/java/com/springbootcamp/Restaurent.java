package com.springbootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurent{
    @Autowired
    HotDrink hotDrink;
    
    Restaurent(){
    
    }
    
    Restaurent(HotDrink hotDrink){
        this.hotDrink = hotDrink;
    }
    
    public HotDrink getHotDrink() {
        return hotDrink;
    }
//    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
