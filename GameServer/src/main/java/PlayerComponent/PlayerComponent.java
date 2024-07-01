package PlayerComponent;

import BaseComponent.Unit;
import Components.Position;
import toyProject.root.Models.DMPlayer;
import Types.UnitType;

public class PlayerComponent extends Unit {
    private String name;
    private DMPlayer model;
    public PlayerComponent(long uniqueId, DMPlayer model) {
        super(uniqueId, UnitType.PLAYER, Position.of(model.x, model.y), model.job, model.hp, model.mp);
        name = model.name;
    }

    public String getName() {
        return name;
    }

    public DMPlayer getModel() {
        return model;
    }


}
