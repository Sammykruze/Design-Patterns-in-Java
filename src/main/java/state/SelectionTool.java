package state;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a dash rectangle");

    }

    @Override
    public void mouseScroll() {
        System.out.println("Move down the line");
    }
}
