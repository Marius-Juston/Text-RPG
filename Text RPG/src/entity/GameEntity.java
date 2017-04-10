package entity;

import attack.Attack;
import effect.Effect;
import stats.Stat;

import java.util.ArrayList;

public abstract class GameEntity {
    private int health;
    private int stamina;

    private ArrayList<Stat> stats;
    private ArrayList<Attack> attacks;
    private ArrayList<Effect> effects;

    private String name;

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Stat> getStats() {
        return stats;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public abstract void attack();
}
