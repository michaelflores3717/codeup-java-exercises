package shapes;

public class Square extends Quadrilateral {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void setLength(int length) {
        this.side = length;
    }

    @Override
    public void setWidth(int width) {
        this.side = width;
    }

    @Override
    public double getPerimeter() {
        int perimeter = 4 * side ;
        return perimeter;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }
}
