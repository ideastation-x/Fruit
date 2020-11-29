import java.util.Arrays;

public class FruitCollection {
    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size){
        fruits = (size < 1) ? new Fruit[1] : new Fruit[size];
    }

    public int getCount(){
        return count;
    }

    public boolean isFull(){
        return count == fruits.length;
    }

    public boolean addFruit(String name, double price, int quality){
        if(!isFull() || price > 0 || quality >= 1 && quality <= 10) {
            fruits[count++] = new Fruit(name, price, quality);
            return true;
        }
        else
            return false;
    }

    public Fruit getFruitAt(int slot){
        return slot > 0 && slot < count ? fruits[slot] : null;
    }

    public boolean expand(int size){
        if(size <= 0)
            return false;
        Fruit[] temp = new Fruit[fruits.length+size];
        System.arraycopy(fruits, 0, temp, 0, fruits.length);
        fruits = temp;
        return true;
    }

    public int searchForFruitName(String name){
        for (int i = 0; i < count; i++) {
            if (name.toLowerCase().equals(fruits[i].getName().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(fruits);
    }
}
