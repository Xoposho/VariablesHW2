public class SixthTask {
    public static void main(String[] args) {

     short weightBananas = (5 * 80);
     short weightMilk = (105 * 200) / 100;
     short weightIceCream = 2 * 100;
     short weightEggs = 4 * 70;

     short weightCocktail = (short) (weightBananas + weightEggs + weightMilk + weightIceCream);
     double wightInKG = weightCocktail / 1000.0;

        System.out.println("Вес спорт-завтрака составляет: " + wightInKG + " кг.");
    }
}
//by Igor