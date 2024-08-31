package org.learning.chapters.Array;

public class Array {
    public static void main(String[] args) {
        arrayFirstProgram();
        arraySecondProgram();
        arrayReverseOrderPrint();
    }

    public static void arrayFirstProgram() {
        int[] a = {100, 200, 300, 400, 500, 600};   // This type of array is Declare + Initialize
        for (int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void arraySecondProgram() {
        int[] b;
        b = new int[11];
        int tempSize = b.length, ii =0;

        for(int i = 0; i<tempSize; i++) {
            b[i]=2*i;
        }

        while(tempSize>0) {

            System.out.println(b[ii]);
            ii++;
            tempSize--;
        }
    }

    public static void arrayReverseOrderPrint() {
        int [] c =new int[5];
        for (int i = 0; i<c.length; i++) {
            c[i] = i;
        }

        for(int j = c.length-1; j>=0; j--) {
            System.out.println(c[j]);
        }

        System.out.println("This print is shown by using foreach loop");
        for (int k: c
             ) {
            System.out.println(c[k] );
        }
    }
}
