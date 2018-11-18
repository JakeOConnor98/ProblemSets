public class Weapon{
    private String name;
    private int damage;
    private int range;
    private int dps;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getDps() {
        return dps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public Weapon(String name, int damage, int range, int dps){
        setName(name);
        setDamage(damage);
        setRange(range);
        setDps(dps);
    }

    public Weapon(){
        name = "John";
        damage = 0;
        range = 10;
        dps = 20;
    }

    public String toString(){
        return "Name: " + getName() + "\nDamage: " + getDamage() + "\nRange: " + getRange() +
                "\nDPS: " + getDps();
    }

}
