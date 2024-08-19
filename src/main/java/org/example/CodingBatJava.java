package org.example;

//This class id made for those problems which I had to look into provided solutions.
public class CodingBatJava {
    public static int sum =0;
    static int tableOf = 2;
    static int limit = 10;
    public static void main(String[] args) {

        //System.out.println(sumOfnNaturalNumbers(2));
        //tableWithRecursion(tableOf, sum, limit);
        reversePatternPrinting(5);
    }

    static int sumOfnNaturalNumbers(int range) {
        if(range<=0) {
            return sum;
        }
        sum+=range;
        return sumOfnNaturalNumbers(range-1);
    }

    static void tableWithRecursion(int tableOf, int numberForTable, int limit) {
        if(numberForTable > limit) {
            return;
        }
        System.out.println(tableOf+" * "+numberForTable+" = "+tableOf*numberForTable);

        tableWithRecursion(tableOf, numberForTable+1, limit);
    }

    static void reversePatternPrinting(int sizeOfThePattern) {


        if (sizeOfThePattern>=1) {
            for (int i = 0; i<=sizeOfThePattern; i++) {
                for(int j = sizeOfThePattern-i; j>=1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else System.out.println("Minimum accepted number should be >=1 ");

    }
}
