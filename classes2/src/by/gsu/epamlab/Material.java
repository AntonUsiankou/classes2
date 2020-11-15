package by.gsu.epamlab;

public class Material {
    private final String name;
    private final double density;

    public Material() {
        name = null;
        density = 0.0;
    }

    public Material(String Name, double Density) {
        this.name = Name;
        this.density = Density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name + ";" + density;
    }
}

