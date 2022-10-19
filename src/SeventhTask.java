class SeventhTask {
    public static void main(String[] args) {

            int needToLoseWeight = 7;
            int convertToGrams = needToLoseWeight * 1000;

            int minLoseWeightPerDay = 250;
            int maxLoseWeightPerDay = 500;

            int maxDaysToLoseWeight = convertToGrams / minLoseWeightPerDay;
            int minDaysToLoseWeight = convertToGrams / maxLoseWeightPerDay;

            int avgLoseWeightPerDay = (maxLoseWeightPerDay + minLoseWeightPerDay) / 2;
            int avgDaysToLoseWeight = convertToGrams / avgLoseWeightPerDay;

    System.out.println("За " + maxDaysToLoseWeight + " дней спорстмен потеряет 7кг веса при потере 250г каждый день.");
    System.out.println("За " + minDaysToLoseWeight + " дней спорстмен потеряет 7кг веса при потере 500г каждый день.");
    System.out.print("За " + avgDaysToLoseWeight + " дней спорстмен потеряет 7кг веса при потере ");
    System.out.println(avgLoseWeightPerDay + "г каждый день.");




    }
}
//by Игорь