package Types;

import java.util.Arrays;

public enum Job {

    UNKNOWN(0, "알 수 없음"),
    WARRIOR(1, "전사"),
    MAGICIAN(2, "마술사"),


    JOBLESS(98, "무직"),
    BOT(99, "무직"),
    NPC(100, "NPC"),
    ;
    public int id;
    public String desc;

    Job(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public static Job of(int job) {
       return Arrays.stream(Job.values())
               .filter(x -> x.id == job)
               .findFirst()
               .orElse(Job.UNKNOWN);
    }
}
