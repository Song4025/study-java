package pattern.decorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        //decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Green ***************** Start");
        decoratedShape.draw();
        System.out.println("Green ***************** End");
    }
}
