public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
       }

    public Square(double side, String color, boolean filled) {
      super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
       }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double len) { this.setSide(len);
    }

    @Override
    public void setWidth(double wid) { this.setSide(wid);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
