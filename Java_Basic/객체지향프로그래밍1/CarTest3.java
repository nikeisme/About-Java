import javax.swing.*;

class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual( 수동)
    int door; // 문의 개수

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) { // 인스턴스의 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    public Car(String color, String auto, int door) {

        this.color = color;
        this.gearType = gearType;
        this.door = door;

    }
}


public class CarTest3 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // c1의 복사본 c2를 생성한다.

        System.out.println("c1의 color = " + c1.color + ", gearType = "
                                            + c1.gearType + ", door = " + c1.door);

        System.out.println("c2의 color = " + c2.color + ", gearType = "
                                            + c2.gearType + ", door = " + c2.door);

        c1.door = 100; // c1의 인스턴스 변수 door의 값을 변경한다.

        System.out.println("c1.door = 100; 수행 후" );

        System.out.println("c1의 color = " + c1.color + ", gearType = "
                                            + c1.gearType + ", door = " + c1.door);

        System.out.println("c2의 color = " + c2.color + ", gearType = "
                                            + c2.gearType + ", door = " + c2.door);

        // 인스턴스 c2는 c1을 목사하여 생성된 것
        // 서로 같은 상태 but 서로 독립적으로 메모리 공간에 존재 -> c1의 값들이 변경되어도 c2는 영향을 받지 않는다.

        // 인스턴스 생성 시, 결정 사항 2가지
        // 1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가?
        // 2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가?


    }




}
