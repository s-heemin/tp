package toyProject.root.Models;

import java.time.Instant;

public class DMPlayer {
    public long id;
    public String name;
    public int job;
    public long attack;
    public long hp;
    public long mp;
    public int x;
    public int y;

    public Instant updated_at;

    public Instant created_at;

    public static DMPlayer of(String name, int job, long attack, long hp, long mp, int x, int y) {
        var model = new DMPlayer();
        model.name = name;
        model.job = job;
        model.attack = attack;
        model.hp = hp;
        model.mp = mp;
        model.x = x;
        model.y = y;

        return model;
    }
}
