interface Color {
    String getColorType();
}

class Blue implements Color{
    @Override
    public String getColorType() {
        return "Blue";
    }
}
class Red implements Color{
    @Override
    public String getColorType() {
        return "Red";
    }
}
class Pink implements Color{
    @Override
    public String getColorType() {
        return "Pink";
    }
}

abstract class Shape {
    String type;
    Color color;
    
    public Shape(String type, Color color) {
        this.type = type;
        this.color = color;
    }
    
    
}

class Square extends Shape {
    public Square(Color color) {
        super("Square", color);
    }
    
    @Override
    public String toString() {
        return color.getColorType() + type;
    }
}

class Triangle extends Shape {
    String specification;
    
    public Triangle(Color color) {
        super("Triangle", color);
    }
    
    @Override
    public String toString() {
        return color.getColorType() + type;
    }
}
class Ques5 {
    public static void main(String[] args) {
        Square square1 = new Square(new Red());
        System.out.println(square1);
        Triangle triangle1 = new Triangle(new Pink());
        System.out.println(triangle1);
        Square square2 = new Square(new Blue());
        System.out.println(square2);
    }
}
