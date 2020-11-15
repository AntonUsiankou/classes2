package by.gsu.epamlab;

public class Subject {
    public String name;
    public Material material;
    public double volume;
    
    public Subject (){
    }

    public Subject(String name, Material material, double volume){
        super();
        this.name = name;
        this.material = material;
        this. volume = volume;
    }

    public String getName() {
        return name;
    }
    public Material getMaterial() {
            return material;
        }
    public double getVolume() {
            return volume;
        }
    public void setName(String name) {
            this.name = name;
        }
    public void setMaterial(Material material) { this.material = material; }
    public void setVolume(double volume) {
    this.volume = volume;
    }
    public double getMass(){
            return material.getDensity() * volume;
        }
    @Override
    public String toString(){
            return name + ";" + material + ";" + volume + getMass();
        }
    }

