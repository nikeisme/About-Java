public class OverloadingTest {

    public static void main(String[] args) {

        class MyMath3 {
            int add(int a, int b) {
                System.out.print("long add(int a, long b) - ");
                return a + b;
            }

            long add(long a, int b) {
                System.out.print("long add(long a, int b) - ");
                return a + b;
            }

            long add(long a, long b) {
                System.out.print("long add(long a, long b) - ");
                return a + b;
            }

            int add(int[] a) {
                System.out.print(" int  add( int[] a ) - ");
                int result = 0;
                for (int i = 0; i < a.length; i++) {
                    result += a[i];
                }
                return result;
            }
        }
    }
}

// 메서드 오버로딩 : 한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것
// 조건 1. 메서드 이름이 같아야 한다.
// 조건 2. 매개변수의 개수 또는 타입이 달라야한다.

// 장점 1. 여러 메서드들이 하나의 이름으로 정의될 수 있다.
// 장점 2. 메서드의 이름을 절약할 수 있다.
