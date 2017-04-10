package entity.ally;

import entity.GameEntity;
import items.Item;

import java.util.ArrayList;

abstract class Player extends GameEntity {
    private final ArrayList<Item> inventory;

    private int maxInventorySpace;

    Player() {
        inventory = new ArrayList<>(32);
    }

    public boolean addItem(Item item) {
        if (inventory.size() < maxInventorySpace) {
            inventory.add(item);

            return true;
        }

        return false;
    }

    public boolean removeItem(Item item) {
        return inventory.remove(item);
    }
}
