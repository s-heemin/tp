package BaseComponent;

import Components.Position;
import Types.Job;
import Types.UnitType;

public class Unit extends Movable {
    protected final long id;
    protected long hp = 0;
    protected long mp = 0;
    protected Job job = Job.UNKNOWN;
    protected final UnitType unitType;
    public Unit(long uniqueId, UnitType unitType, Position pos, int job, long hp, long mp) {
        super(pos.x, pos.y);
        this.id = uniqueId;
        this.unitType = unitType;
        this.hp = hp;
        this.mp = mp;

        this.job = Job.of(job);
        if(unitType == UnitType.PLAYER && this.job == Job.UNKNOWN) {
            // 에러 처리 해야한다.
        }
    }

    public static Unit of(long uniqueId, UnitType unitType) {
        return new Unit(uniqueId, unitType, Position.of(0, 0), Job.JOBLESS.id, 0, 0);
    }
}
