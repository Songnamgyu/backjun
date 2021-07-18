package com.song.bj;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 정수를 입력해주세요");
        System.out.println("첫 번 쨰 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();

        System.out.println("두번쨰 숫자를 입력해주세요");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("두 수의 합은 : " + sum);

    }
}
