public class Square implements SquareInterface{

    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int getArea() {
        return 0;
    }

    public int getPerimeter() {
        return 0;
    }
}
