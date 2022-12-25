package com.perscholas;

import java.io.*;
import java.util.*;
public class StringTokens {

	// https://www.hackerrank.com/challenges/java-string-tokens/problem
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        if (!scan.hasNext()) {
	        System.out.println("0");
	    } else {
	        String s = scan.nextLine();
	        String[] tokens = s.trim().split("[^A-Za-z]+");
	        System.out.println(tokens.length);
	        for (String token : tokens) {
	            System.out.println(token);
	            }
	        }
	        scan.close();
	    }
	
}
