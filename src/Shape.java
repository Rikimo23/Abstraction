public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }


    /** All shapes must provide a method called get
    public abstract double getArea();
    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapeName()
    {
        System.out.println("I am a Shape.");
    }
}

