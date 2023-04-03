package zendesk.messaging;

public class Banner {
    private final String label;
    private final Position position;

    public enum Position {
        BOTTOM
    }

    public String getLabel() {
        return this.label;
    }

    public Position getPosition() {
        return this.position;
    }
}
