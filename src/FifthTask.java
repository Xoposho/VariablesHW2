public class FifthTask {
    public static void main(String[] args) {

       int countColors = 120;
       int countBrownForOneClass = 4;
       int countWhiteForOneClass = 2;

       int countColorsForOneClass = countBrownForOneClass + countWhiteForOneClass;
       int countClass = countColors / (countColorsForOneClass);
       int countWhiteForAllClass = countClass * countWhiteForOneClass;
       int countBrownForAllClass = countClass * countBrownForOneClass;

        System.out.print("В школе, где "+ countClass + " классов, нужно " + countWhiteForAllClass);
        System.out.println(" белой краски и " + countBrownForAllClass + " банок коричневой краски.");

    }
}
//by Igor