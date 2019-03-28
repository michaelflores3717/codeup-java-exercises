package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        int area = length * length;
        return area;
    }

    @Override
    public int getPerimeter() {
        int perimeter = length * 4;
        return perimeter;
    }
}
