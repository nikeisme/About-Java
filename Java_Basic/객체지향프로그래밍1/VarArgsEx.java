public class VarArgsEx {

// 가변인자 : 기존에 메서드의 매개변수 개수가 고정적이었으나 동적으로 지정하는 것
// 가변인자를 매개변수 중에서 제일 마지막에 선언해야한다.

    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",strArr));
        System.out.println(concatenate("m",new String[]{"1","2","3"}));
        System.out.println(concatenate("["+concatenate(",", new String[0])+"]"));
        System.out.println(concatenate(",")+"]");
    }

    static String concatenate(String delim,String...args) {
        String result = "";

        for(String str:args){
            result += str + delim;
        }
        return result;
    }
}

// concatenate 메서드 : 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결합해서 반환
