package entity.ennemy;

import entity.GameEntity;

/**
 * Created by Marius Juston on 09/04/2017.
 */
public abstract class Enemy extends GameEntity {
    boolean isHealthRevealed;
    boolean areStatsRevealed;
    boolean areAttacksRevealed;
    boolean isStaminaRevealed;
    boolean isNameRevealed;

    abstract void getDrop();
}
