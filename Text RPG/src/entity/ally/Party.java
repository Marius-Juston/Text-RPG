package entity.ally;

import entity.GameEntity;

import java.util.ArrayList;

class Party {
    private ArrayList<GameEntity> entities;

    public void addEntity(GameEntity entity) {
        entities.add(entity);
    }

    public void removeEntity(GameEntity entity) {
        entities.remove(entity);
    }

    public ArrayList<GameEntity> getEntities() {
        return entities;
    }
}
