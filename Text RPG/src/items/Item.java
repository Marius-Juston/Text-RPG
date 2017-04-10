package items;

public abstract class Item {
    private int level;
    private Class classRestriction;
    private String name;
    private int price;

    public Item(int level, Class classRestriction, String name, int price) {
        this.level = level;
        this.classRestriction = classRestriction;
        this.name = name;
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public Class getClassRestriction() {
        return classRestriction;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
