interface Polygon{
    void get();
}

class Convex implements Polygon{
    @Override
    public void get() {
        System.out.println("Convex Polygon");
    }
}

class Concave implements Polygon{
    @Override
    public void get() {
        System.out.println("Concave Polygon");
    }
}

class Equilateral implements Polygon{
    @Override
    public void get() {
        System.out.println("Equilateral Polygon");
    }
}

class Regular implements Polygon{
    @Override
    public void get() {
        System.out.println("Regular Polygon");
    }
}

class GetPolygon{
    Polygon polygon;
    public Polygon getPolygon(){
        return polygon;
    }
    
    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }
}

class PolygonFactory{
    static GetPolygon getPolygonObject(String string){
        GetPolygon getPolygon = new GetPolygon();
        switch (string){
            case "convex":
                getPolygon.setPolygon(new Convex());
                break;
            case "concave":
                getPolygon.setPolygon(new Concave());
                break;
            case "equilateral":
                getPolygon.setPolygon(new Equilateral());
                break;
            case "regular":
                getPolygon.setPolygon(new Regular());
                break;
        }
        return getPolygon;
    }
}

class Ques2{
    public static void main(String[] args) {
        GetPolygon polygonConvex = PolygonFactory.getPolygonObject("convex");
        polygonConvex.getPolygon().get();
        GetPolygon polygonConcave = PolygonFactory.getPolygonObject("concave");
        polygonConcave.getPolygon().get();
        GetPolygon polygonEquilateral = PolygonFactory.getPolygonObject("equilateral");
        polygonEquilateral.getPolygon().get();
        GetPolygon polygonRegular = PolygonFactory.getPolygonObject("regular");
        polygonRegular.getPolygon().get();
        
    }
}
