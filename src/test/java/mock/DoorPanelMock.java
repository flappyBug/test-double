package mock;

public class DoorPanelMock extends DoorPanel {
    private boolean isClosed = false;
    boolean verify() {
        return isClosed;
    }
    @Override
    public void close() {
        isClosed = true;
        System.out.println("Mock door is closed");
    }
}
