package org.example.chapters;

public class Methods {

    static int checkNumberAndAdd(int a, int b) {
        int result;
        if((a%b)>2) {
            result= a+b;
        } else {
            result=a*b;
        }
        return result;
    }

    public static void main(String[] args) {
        
    }
}
