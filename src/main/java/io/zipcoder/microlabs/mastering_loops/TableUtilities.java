package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if (i * j < 10){
                    sb.append((i * j) + " | ");
                } else {
                    sb.append((i * j) + " | ");
                }

            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
