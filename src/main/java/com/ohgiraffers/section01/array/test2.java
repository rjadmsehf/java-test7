package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        {
            char[] week = {'월','화','수','목','금','토','일'};	// char형 배열은 ""가 아닌 '' 써야된다.

            Scanner sc = new Scanner(System.in);

            System.out.print("0 ~ 6 사이 숫자 입력 : ");
            int num = sc.nextInt();

            if(num >= 0 && num < 7) {
                System.out.print(week[num]);
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
