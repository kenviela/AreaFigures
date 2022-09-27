public class Main {
    public static void main(String[] args) {
    }
    public double area_square(){
        areaSquare square=new areaSquare();
        double width=30;
        double large=30;
        return square.area(width,large);

    }
    public double area_triangle(){
        areaTriangle triangle=new areaTriangle();
        double base=30;
        double height=40;
        return triangle.area(base,height);
    }
    public double area_Rectangle(){
        areaRectangle rectangle=new areaRectangle();
        double base=10;
        double height=20;
        return rectangle.area(base,height);
    }
}