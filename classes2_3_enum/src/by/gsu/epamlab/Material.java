package by.gsu.epamlab;

public enum Material {
    STEEL("Steel", 7850.00),
    COPPER("Copper",8500.00);

    private final String name;
    private final double density;

    Material(String name, double density) {
        this.name = name;
        this.density = density;
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
