class Data1{
    int value;
}

class Data2 {
    int value;

    Data2 (int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

public class ConstructorTest {

    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // complie error 발생
    }

}

// 생성자 : 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'
// 조건 1 : 생성자의 이름은 클래스의 이름과 같아야 한다.
// 조건 2 : 생성자는 리턴 값이 없다.

//    Card c = new Card();

//1. 연산자 new에 의해서 메모리(heap)에 Card 클래스의 인스턴스가 생성된다.
//2. 생성자 Card()가 호출되어 생성된다.
//3. 연산자  new 의 결과로, 생성된 Card 인스턴스의 주소가 반환되어 참조변수 c에 저장된다.