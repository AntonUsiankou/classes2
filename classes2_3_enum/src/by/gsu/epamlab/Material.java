package by.gsu.epamlab;

public enum Material {
    steel( 7850.00),
    copper(8500.00);

    private final double density;

    Material( double density) {
        this.density = density;
    }

    public double getDensity() {
        return density;
    }
    @Override
    public String toString() {
        return  name() + ";" + density;
    }
}
