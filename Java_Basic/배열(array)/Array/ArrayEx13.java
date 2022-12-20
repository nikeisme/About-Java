package Array;

// 16진수를 2진수로 변경하는 예제
public class ArrayEx13 {

    public static void main(String[] args) {

        // 16진수에는 A~F까지 6개의 문자가 포함되므로 char배열로 처리.
        char[] hex = {'C', 'A', 'F', 'E'};

        // 이진수 '0000' 부터 '1111'까지 모두 16개의 값을 문자열로 지정
        String[] binary = {"0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1110", "1111"};

        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i] - '0']; // '8' -'0'의 결과는 8
            } else { // A ~ F 이면
                result += binary[hex[i] - 'A' +10]; // 'C' - 'A' 의 결과는 2
            }
        }

        System.out.println("hex : " + new String(hex));
        System.out.println("binary : " + result);

    } // end of main
}// end of classArrayArrayEx13