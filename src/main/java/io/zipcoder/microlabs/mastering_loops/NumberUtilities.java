package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop){
        String myString = "";
        for(int i = start; i < stop ; i++){
            if ( i % 2 == 0){
                 myString += Integer.toString(i);
            }
        }
        return myString;
    }


    public static String getOddNumbers(int start, int stop) {
        String myString = "";
        for(int i = start; i <= stop; i++){
            if (i % 2 != 0){
                myString += Integer.toString(i);
            }
        }
        return myString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i < stop; i += step){
            stringBuilder.append(i * i);
        }

        return stringBuilder.toString();
    }

    public static String getRange(int stop) {
//        StringBuilder stringBuilder = new StringBuilder();
//                for (int i = 0; i < stop -1; i++){
//                    stringBuilder.append(i);
//                }
//        return stringBuilder.toString();
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
//        StringBuilder str = new StringBuilder();
//        for ( int i = start; i < stop; i++){
//            str.append(i);
//        }
//        return str.toString();
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for(int i = start; i < stop; i += step){
            str.append(i);
        }
        return str.toString();

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String res = "";

        int calculatedValue;
        for(int i = start; i < stop; i += step){
            calculatedValue = i;
            for(int j = 1; j < exponent; j++){
                calculatedValue *= i;
            }
            res += calculatedValue;
        }
        return res;
    }

}
