package io.zipcoder.microlabs.mastering_loops;


public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                    sb.append(String.format("%3d |", i * j));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static String getLargeMultiplicationTable() {

        StringBuilder sb = new StringBuilder();

        int j = 0;
        for (int i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                    sb.append(String.format("%3d |", i * j));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //having trouble aligning the table but the logic is there
    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                sb.append(String.format("%3d |", i * j));
            }
            sb.append("\n");
        }
//        System.out.println(sb);
        return sb.toString();
    }
}


