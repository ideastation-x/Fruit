public class TestCollection {
    public static void main(String[] args) {
        FruitCollection fc = new FruitCollection(2);
        fc.addFruit("Cherry", 85.179, 8);
        fc.addFruit("Date", 94.62, 9);
        fc.expand(1);
        fc.addFruit("Kiwi", 64.93, 7);
        System.out.println(fc);
        int s = fc.searchForFruitName("DATE");
        if (s >= 0) {
            System.out.println(fc.getFruitAt(s));
        }
    }
}
