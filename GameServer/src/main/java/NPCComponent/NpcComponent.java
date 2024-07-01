package NPCComponent;

import BaseComponent.Unit;
import Components.Position;
import Generator.UniqueKey;
import Types.Job;
import Types.UnitType;

public class NpcComponent extends Unit {
    public NpcComponent(int x, int y) {
        super(UniqueKey.generateKey(), UnitType.NPC, Position.of(85, 85), Job.NPC.id,0, 0);
    }
}
