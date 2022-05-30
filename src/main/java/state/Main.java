package state;

public class Main {
    public static void main(String[] args){
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Erase());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.mouseScroll();
 }
}
