package com.chainsys.hackerrank;

import java.util.Scanner;

public class HackerRank7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int  lineNumber =1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        sc.close();
    }
	
	}


