package org.learning.chapters.Array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray();
        patternPrintingWithArray();
    }

    public static void TwoDimensionalArray() {
        //Creating 2-D array for referencing building floors and it's flat
        int[][] flats = new int[5][5];
        int flatNumber = 000;
        System.out.println(flats.length);
        for (int i=0; i<flats.length; i++) {
            for (int j=0; j<flats[i].length; j++) {
                flats[i][j] =flatNumber;
                flatNumber++;
            }
            flatNumber=i*100;
        }

        for (int k=0; k<flats.length; k++) {
            for (int l=0; l<flats[k].length; l++) {
                System.out.println(flats[k][l]);
            }

        }
    }

    public static void patternPrintingWithArray() {
        int [][] pattern = new int[5][5];

        for (int i=0; i< pattern.length; i++) {
            for(int j=0; j< pattern[i].length-1;j++) {
                pattern[i][j]=1;
            }
        }

        for (int k=0; k<pattern.length; k++) {
            for (int l=0; l<pattern[k].length; l++) {
                System.out.print(pattern[k][l]);
            }

        }
    }
}
