package com.ohgiraffers.section02.copy;

public class Application01 {

    public static void main(String[] args) {

        /* 목표 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.*/
        /* 필기.
            배열의 복사에는 크게 두 가지 종류가 있다.
            1. 얕은 복사 (shallw copy) : stack 에 주소값만 복사(변수에 담겨있는 주소만 복사)
            2. 깊은 복사( (depep copy) ;heap 의 배열에 저장 된 값을 복사(실제 값을 복사)

         */

        /* 필기
            얕은 복사는 stack 에 저장되어 있는 배열의 동일한 배열의 주소값을 가지고 있다.
            하나의 래퍼런스 변수에 저장 된 주소값을 가지고 배열의 주소값을 가지고 있다.
            하나의 래퍼런스 변수에 저장된 주소값을 가지고 배열의 내영을 수정(값 변경)을 하면
            다른 래퍼런스 변수로 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경 된 값이 반영 되어 있다.
         */

        int[]  orihinArr = {1,2,3,4,5,6,10};

        // originArr 에 저장된 배열의 주소를 coptArr 때도 저장해보자
        int[] copyAtt = orihinArr;

        System.out.println(orihinArr.hashCode()); // hashCode() 는 그냥 우리의 주민번호 처럼 생각하자
        System.out.println(copyAtt.hashCode());

        for(int i = 0; i < orihinArr.length; i++){

            System.out.println(orihinArr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < copyAtt.length; i++ ) {

            System.out.println(copyAtt[i]);
        }

        copyAtt[0] = 99;

        for (int i = 0; i < orihinArr.length; i++){

            System.out.println(orihinArr[i]);

        }

        System.out.println();

        for (int i =0; i < copyAtt.length; i++){

            System.out.println(copyAtt[i]);
        }

    }


}
