package test.basics;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] temp = new int[a.length];
        int count=0;
        for(int i=a.length-1;i>=0;i--){
            temp[count]=a[i];
            count++;
        }
        return temp;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	int[] arr = {4,2,3,1};
        int[] res = reverseArray(arr);

    }
}
