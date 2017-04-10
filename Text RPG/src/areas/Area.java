package areas;

import entity.GameEntity;

/**
 * Created by Marius Juston on 09/04/2017.
 */
abstract class Area {
    private final String name;

    private final GameEntity[] gameEntities;

    Area(String name, GameEntity... gameEntities) {
        this.name = name;

        this.gameEntities = gameEntities;
    }
}
