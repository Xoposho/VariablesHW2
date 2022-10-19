public class FourthTask {
    public static void main(String[] args) {

        byte countBottlesForTwoMinutes = 16;

        byte twentyMinutes = 20;
        short oneDayMinutes = 1440;
        short threeDayMinutes = 4320;
        int oneMonthMinutes = 43200;

        short bottlesForTwentyMinutes = (short) (countBottlesForTwoMinutes * (twentyMinutes / 2));
        System.out.println("За 20 минут машина произвела бутылок " + bottlesForTwentyMinutes + " штук");

        short bottlesForOneDay = (short) (countBottlesForTwoMinutes * (oneDayMinutes / 2));
        System.out.println("За один день машина произвела бутылок " + bottlesForOneDay + " штук");

        int bottlesForThreeDays = countBottlesForTwoMinutes * (threeDayMinutes / 2);
        System.out.println("За три дня машина произвела бутылок " + bottlesForThreeDays + " штук");

        int bottlesForMonth = countBottlesForTwoMinutes * (oneMonthMinutes / 2);
        System.out.println("За один месяц минут машина произвела бутылок " + bottlesForMonth + " штук");



    }
}
