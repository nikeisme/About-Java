class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동),manual(수동)
    int door ; // 문의 개수

    Car(){}

    // 매개변수가 있는 생성자를 사용할 때, 인스턴스를 생성하는 동시에 원하는 값으로 초기화 가능
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color=" + c1.color +",gearType = "
                + c1.gearType+", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color +",gearType = "
                + c2.gearType+", door=" + c2.door);
    }
}

// Car 인스턴스를 생성할 때, 생성자 Car()를 사용한다면, 인스턴스를 생성한 다음에 인스턴스 변수들을 따로 초기화 해주어야한다.

