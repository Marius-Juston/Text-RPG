package stats;

import entity.GameEntity;

public abstract class Stat {
    private final GameEntity attachedTo;

    protected Stat(GameEntity attachedTo) {
        this.attachedTo = attachedTo;
    }

    abstract void apply();
}
