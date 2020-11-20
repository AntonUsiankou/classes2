package by.gsu.epamlab;

public enum Material {
    STEEL(7850.00),
    COPPER(8500.00);

    private final double density;

    Material( double density) {
        this.density = density;
    }

    public double getDensity() {
        return density;
    }
    @Override
    public String toString() {
        return  name().toLowerCase() + ";" + density;
    }
}
