public abstract class Pokemon {

    protected String name;
    protected String type;
    protected String status;
    protected String nature;
    protected  String trait;

    protected int healthPoints;
    protected int attack;
    protected int defense;

    protected double height;
    protected double weight;

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getNature() {
        return nature;
    }

    public String getTrait() {
        return trait;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void speak();
}
