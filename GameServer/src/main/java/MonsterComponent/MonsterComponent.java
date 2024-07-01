package MonsterComponent;

import BaseComponent.Unit;
import Components.Position;
import Generator.UniqueKey;
import Types.Job;
import Types.UnitType;

public class MonsterComponent extends Unit {
    public MonsterComponent(int x, int y) {
        super(UniqueKey.generateKey(), UnitType.MONSTER, Position.of(10, 10), Job.JOBLESS.id,0, 0);
    }
}
