public class MemberCall {

    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv; // 에러 발생 클래스변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용 가능.

    static void staticMethod() {
        System.out.println(cv);
//        System.out.println(iv); // 결과 : 에러 발생 클래스메서드에서 인스턴스 변수를 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv) ; // 객체를 생성한 후에야 인스턴스 변수 참조 가능
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수를 바로 사용 가능.
    }

    static void staticMethod2() {
        staticMethod();
//        instanceMethod1(); // 에러. 클래스 메서드에서는 인스턴스 메서드를 호출할 수 없음.
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 인스턴스를 생성한 후에 호출할 수 있음.
    }

    void instanceMethod2() { // 인스턴스 메서드에는 인스턴스메서드와 클래스 메서드
        staticMethod(); // 모두 인스턴스 생성없이 바로 호출이 가능하다.
        instanceMethod1();
    }

}
