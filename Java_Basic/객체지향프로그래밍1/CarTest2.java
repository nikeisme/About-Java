class Car2 {

    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.door = door;
        this.gearType = gearType;
    }
}
    class CarTest2{
        public static void main(String[] args) {
            Car2 c1 = new Car2();
            Car2 c2 = new Car2("blue");

            System.out.println("c1의 color = " + c1.color+ " , gearType = "
                                                + c1.gearType + " , door = " + c1.door);

            System.out.println("c2의 color = " + c2.color+ " , gearTyoe = "
                    + c2.gearType + " , door = " + c2.door);
        }
    }

    // this는 참조변수로 인스턴스 자신을 가리킨다. 인스턴스의 주소가 저장되어 있다. 모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.

// this() , this(매개변수)  : 생성자 같은 클래스의 다른 생성자를 호출할 떄 사용된다.




