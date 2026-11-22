package com.manoj.interview.prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
//        String s = "A man, a plan, a canal: Panama";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
//        ValidPalindrome v = new ValidPalindrome();
//        System.out.println(v.validPalindromeBruteForceApproach(s));
//        System.out.println(v.validPalindromeOptimalApproach(s));
//        SwapTwoVariablesWithOutUsingThirdVariable swapTwoVariablesWithOutUsingThirdVariable = new SwapTwoVariablesWithOutUsingThirdVariable();
//        System.out.println(swapTwoVariablesWithOutUsingThirdVariable.swapTwoVariablesWithOutUsingThirdVariable(10,20));
//        PrimeNumber p =new PrimeNumber();
//        System.out.println(p.primeNumber(4));
//        FibonacciSequence f = new FibonacciSequence();
//        System.out.println(f.fibonacciNumber(5));
//        ReverseNumber r = new ReverseNumber();
//        System.out.println(r.reverseNumber(1234));\
//        ArmstrongNumber a = new ArmstrongNumber();
//        System.out.println(a.armstrongNumber(153));
//        GcdOfTwoNumbers g = new GcdOfTwoNumbers();
//        System.out.println(g.gcdOfTwoNumberBruteForceApproach(12,18));
//        System.out.println(g.gcdOfTwoNumbersOptimalApproach(12,18));
        SplitStringBasedOnComma splitStringBasedOnComma = new SplitStringBasedOnComma();
        System.out.println(splitStringBasedOnComma.splitStringBasedOnComma(s));
    }
}
