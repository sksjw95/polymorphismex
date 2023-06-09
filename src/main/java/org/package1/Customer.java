package org.package1;

class Customer {
    int money = 50000;

   /* void buyCoffee(Americano americano){ // 아메리카노 구입
        money = money - americano.price;
    }

    void buyCoffee(CaffeLatte caffeLatte){ // 카페라떼 구입
        money = money - caffeLatte.price;
    } */
    /*사야 하는 커피가 무엇인지 구분하기 위해 매개 변수로 커피에 대한 정보를 전달받아
    매개 변수로 각각 Americano 타입과 CaffeLatte 타입의 객체를 전달해 주었습니다.
    하지만 만약 손님이 구입해야 하는 커피가 수백 가지가 된다면 새로운 타입을 매개 변수로 전달하는
            buyCoffee 메서드를 계속 추가해주어야 합니다.*/

    // 이런 경우 객체의 다형성을 활용하여 문제를 해결할 수 있습니다.
   /* void buyCoffee(Coffee coffee){
        money = money - coffee.price ;
    }*/

}
