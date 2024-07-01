package BaseComponent;

import Components.Position;
import Resource.ResourceMap;

public class Movable {
    public Position position;

    public Movable(int x, int y) {
        position = Position.of(x, y);
    }

    public boolean canMoveTo(int posX, int posY, ResourceMap resMap) {
        return posX >= 0 && posY >= 0 && posX < resMap.x && posY < resMap.y;
    }

    public void moveTo(int posX, int posY) {
        position.setPosition(posX, posY);
    }
}
