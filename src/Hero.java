public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String typeOfSuperAbility;

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setTypeOfSuperAbility(String typeOfSuperAbility) {
        this.typeOfSuperAbility = typeOfSuperAbility;
    }

    public String getTypeOfSuperAbility() {
        return typeOfSuperAbility;
    }
}