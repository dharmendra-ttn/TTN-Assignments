interface Pizza {
    String info();
}

class Pepperoni implements Pizza {
    
    @Override
    public String info() {
        return "pepperoni";
    }
}

class Mushrooms implements Pizza {
    @Override
    public String info() {
        return "mushrooms";
    }
}

class ExtraCheese implements Pizza {
    @Override
    public String info() {
        return "extra cheese";
    }
}

class Sausage implements Pizza {
    @Override
    public String info() {
        return "sausage";
    }
}

class RegularSized implements Pizza {
    
    private Pizza pizza;
    
    public RegularSized(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public Pizza getPizza() {
        return pizza;
    }
    
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String info() {
        return "Regular-Sized pizza with " + pizza.info() + " topping.";
    }
}

class Medium implements Pizza {
    private Pizza pizza;
    
    public Medium(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public Pizza getPizza() {
        return pizza;
    }
    
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String info() {
        return "Medium-Sized pizza with " + pizza.info() + " topping.";
    }
}

class Large implements Pizza {
    private Pizza pizza;
    
    public Large(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public Pizza getPizza() {
        return pizza;
    }
    
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String info() {
        return "Large-Sized pizza with " + pizza.info() + " topping.";
    }
}

public class Ques6 {
    
    public static void main(String[] args) {
        
        Pepperoni pepperoni = new Pepperoni();
        System.out.println(pepperoni.info());
        
        Large large = new Large(pepperoni);
        System.out.println(large.info());
        
        RegularSized regularSized = new RegularSized(new ExtraCheese());
        System.out.println(regularSized.info());
    }
}