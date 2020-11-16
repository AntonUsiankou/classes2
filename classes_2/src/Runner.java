import by.gsu.epamlab.*;


public class Runner {
    public static void main (String args[]){
        Material STEEL = new Material("Steel", 7850.0);
        Material COPPER = new Material("Copper", 8500.0);

        Subject subject = new Subject("Wire", STEEL, 0.03);

        System.out.println(subject);
        subject.setMaterial(COPPER);

        System.out.println("The block mass is " + subject.getMass() + "kg.");
    }
}
