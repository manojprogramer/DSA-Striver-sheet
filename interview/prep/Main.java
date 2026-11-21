package com.manoj.interview.prep;

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
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
        GcdOfTwoNumbers g = new GcdOfTwoNumbers();
        System.out.println(g.gcdOfTwoNumberBruteForceApproach(12,18));
        System.out.println(g.gcdOfTwoNumbersOptimalApproach(12,18));
    }
}
