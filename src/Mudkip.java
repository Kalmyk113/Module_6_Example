public class Mudkip extends Pokemon{

    public Mudkip(){
        this.weight = 0.5;
        this.type = "Water";
        this.name = "Mudkip";

    }

    @Override
    public void speak() {
        System.out.println("Mudkip");
    }
}
