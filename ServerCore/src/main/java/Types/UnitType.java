package Types;

public enum UnitType {

    UNKNOWN(0, "알 수 없음"),
    PLAYER(1, "플레이어"),
    MONSTER(2, "몬스터"),
    NPC(3, "NPC"),
    BOT(4, "봇"),
    ;
    public int id;
    public String desc;

    UnitType(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
