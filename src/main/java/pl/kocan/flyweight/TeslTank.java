package pl.kocan.flyweight;

public class TeslTank {

    private final String name;
    private final int hp;
    private final int armour;
    private final int damageDealt;
    private final int speed;
    private final int x;
    private final int y;
    private final int hpLeft;
    private final int resourceCost;

    public TeslTank(String name, int hp, int armour, int damageDealt, int speed, int x, int y, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.hpLeft = hp;
        this.resourceCost = resourceCost;
    }
}
