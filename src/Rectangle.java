public  class Rectangle extends Shape {

    public Rectangle(String color) {
        super.color = color;
    }

    public Rectangle() {
    }
    public Rectangle(String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
    }

    public double getArea() {
        return super.width *  super.height;
    }


    public void displayshapName() {
        System.out.println("I am a Rectangle"  );
    }
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }
}

