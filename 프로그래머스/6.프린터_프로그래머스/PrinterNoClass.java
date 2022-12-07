import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrinterNoClass {

    public int solution(int[] priorities,int location) {

        //1. Queue를 만들기
        List<Integer> printer = new ArrayList<Integer>();
        for (int priority : priorities)
            printer.add(priority);

        int turn =0;
        //2. 0번을 꺼내서 max priority가 아니면 다시 끝에 넣는다.

        while(!printer.isEmpty()) {
            //2. 0번을 꺼내서 max priority가 아니면 다시 끝에 넣는다.
            Integer priority = printer.remove(0);
            if(printer.stream().anyMatch(otherPriority->priority<otherPriority)) {
                printer.add(priority);
            } else {
                //3. max priority 이면 내가 찾는 job이 맞는지 확인한다.
                turn ++;
                if (location ==0)
                    break;
            }

            location -- ;
            if(location < 0)
                location = printer.size() -1;
        }
        
        return turn;
    }



    public static void main(String[] args) {
        PrinterNoClass sol = new PrinterNoClass();
        int [] priorities = {2, 1, 3, 2};
        System.out.print(sol.solution(priorities,0));
    }

}
