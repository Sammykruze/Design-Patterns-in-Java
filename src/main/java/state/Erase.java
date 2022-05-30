package state;

public class Erase implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Select");
    }

    @Override
    public void mouseDown() {
        System.out.println("Delete");
    }

    @Override
    public void mouseScroll() {
        System.out.println("Select all");

    }
}
