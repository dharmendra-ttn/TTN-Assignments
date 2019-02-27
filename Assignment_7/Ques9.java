interface Furniture {
    void stresstest();
    
    void firetest();
}

abstract class Chairs {
    
    public Chairs() {
        System.out.println("This is Chairs Abstract Class");
    }
}

abstract class Tables {
    
    public Tables() {
        System.out.println("This is Tables Abstract Class");
    }
}

class WoodenChairs extends Chairs implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("WoodenChairs Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("WoodenChairs Fire Test");
    }
}

class WoodenTables extends Tables implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("WoodenTables Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("WoodenTables Fire Test");
    }
}

class MetallicChairs extends Chairs implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("MetallicChairs Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("MetallicChairs Fire Test");
    }
}

class MetallicTables extends Tables implements Furniture {
    
    @Override
    public void stresstest() {
        System.out.println("MetallicTables Stress Test");
    }
    
    @Override
    public void firetest() {
        System.out.println("MetallicTables Fire Test");
    }
}

public class Ques9 {
    
    public static void main(String[] args) {
        WoodenChairs woodenChairs = new WoodenChairs();
        woodenChairs.stresstest();
        woodenChairs.firetest();
        System.out.println();
        WoodenTables woodenTables = new WoodenTables();
        woodenTables.stresstest();
        woodenTables.firetest();
        System.out.println();
        MetallicChairs metallicChairs = new MetallicChairs();
        metallicChairs.stresstest();
        metallicChairs.firetest();
        System.out.println();
        MetallicTables metallicTables = new MetallicTables();
        metallicTables.stresstest();
        metallicTables.firetest();
        
    }
}