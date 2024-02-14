package com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args) {

        /* 목표.  배열을 사용하는 예시를 이해하고 적용해보자*/
        /* 필기.  랜덤한 카드를 한 장 뽑아서 출력해보자*/


        String[] shapes = {"♣", "♠", "♥" , "◆"};
        String[] cardNumbers = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","AEC" };

        int randomShapeIndex = (int)(Math.random() * shapes.length );
        int randomCardNumIndex = (int)(Math.random() * cardNumbers.length );

        System.out.println("당신이 뽑은 카드는 ? " + shapes[randomShapeIndex] + cardNumbers[randomCardNumIndex] + "카드입니다 .");

    }


}
