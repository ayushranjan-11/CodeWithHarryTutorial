package org.learning;

//This class id made for those problems which I had to look into provided solutions.
public class CodingBatJava {
    public static int sum =0;
    static int tableOf = 2;
    static int limit = 10;
    public static void main(String[] args) {

        //System.out.println(sumOfnNaturalNumbers(2));
        //tableWithRecursion(tableOf, sum, limit);

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

}
