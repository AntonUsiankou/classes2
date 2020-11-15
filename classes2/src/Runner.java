import by.gsu.epamlab.*;


public class Runner {
    public static void main (String args[]){
        Material steel = new Material("Steel", 7850.0);
        Material copper = new Material("Copper", 8500.0);

        Subject subject = new Subject("Wire", steel, 0.03);

        System.out.println(subject);
        subject.setMaterial(copper);

        System.out.println("The block mass is " + subject.getMass() + "kg.");
    }
}
