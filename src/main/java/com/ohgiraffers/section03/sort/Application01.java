package com.ohgiraffers.section03.sort;

public class Application01 {
    public static void main(String[] args) {

        /* 목표 변수 의 두 값을 먼저 */
        /* 필기 변수의 두 값 변경하기*/

        int num1 = 10;
        int num2 = 20;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //두 변수의 값을 바꾸기 위해 다른 변수 한 개를 만든다.
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] arr = {2,1,3};
        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1]= temp2;

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " " );
        }
    }
}
