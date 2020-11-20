import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class Runner {
    public static void main(String args[]) {
        Subject wire = new Subject("wire", Material.steel, 0.03);
        System.out.println(wire);
        wire.setMaterial(Material.copper);
        System.out.println("The wire mass is " + wire.getMass() + " kg.");
    }
}