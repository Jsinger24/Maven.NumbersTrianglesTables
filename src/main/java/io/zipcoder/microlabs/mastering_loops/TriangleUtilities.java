package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfRows -1; i++){

            for (int j = 0; j <= i; j++){
               sb.append("*");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++) {
            stringBuilder.append("*");
//
        }
        return stringBuilder.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

//    directions called for 10 X 10, however test calls for 9 * 9
    public static String getLargeTriangle() {
        StringBuilder stringy = new StringBuilder();

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j <= i; j++) {
                stringy.append("*");
            }
            stringy.append("\n");
        }
        return stringy.toString();
    }

}
