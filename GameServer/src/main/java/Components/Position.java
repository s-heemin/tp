package Components;

public class Position {
    public int x;
    public int y;

    public static Position of(int x, int y) {
        var position = new Position();
        position.x = x;
        position.y = y;

        return position;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
