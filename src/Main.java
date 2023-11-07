public class Main {
    public static void main(String[] args) {


       Square square = new Square();
       Circle circle = new Circle();

        System.out.println("Square square = new Square(); ->");
       square.render();
        System.out.println("Circle circle = new Circle(); ->");
       circle.render();

        poligon square2 = new Square();
        poligon circle2 = new Circle();

        System.out.println("poligon square2 = new Square(); ->");
        square2.render();
        System.out.println("poligon circle2 = new Circle(); ->");
        circle2.render();
    }
}