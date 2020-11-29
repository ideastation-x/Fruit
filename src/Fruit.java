public class Fruit {
    private final String name;
    private final double price;
    private final int quality;

    public Fruit(String name, double price, int quality){
        this.name = (name == null) ? "" : name;
        this.price = Math.max(price, 0.0);
        this.quality = (quality < 1) ? 1 : Math.min(quality, 10);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public boolean equals(Fruit f){
        return f != null && getName().equals(f.getName()) && getPrice() == f.getPrice() && getQuality() == f.getQuality();
    }

    public int compareTo(Fruit f){
        return f == null || getQuality() > f.getQuality() ? 1 : getQuality() == f.getQuality() ? 0 : -1;
    }

    public String toString(){
        return String.format("%s (price: %.2f , quality: %d)",getName(),getPrice(),getQuality());
    }
}
