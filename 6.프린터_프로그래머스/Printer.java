import java.awt.print.PrinterJob;
import java.util.*;
public class Printer {

    public int solution(int[] priorities,int location) {

        //1. Queue를 만들기
        List<PrintJob> printer = new ArrayList<PrintJob>();
        for(int i =0; i < priorities.length; i++)
            printer.add(new PrintJob(i,priorities[i]));
        int turn = 0;
        while (!printer.isEmpty()){
            //2. 0번을 꺼내서 max priority가 아니면 다시 끝에 넣는다.
            PrintJob job = printer.remove(0);
            if(printer.stream().anyMatch(otherjob -> job.priority < otherjob.priority)){
                printer.add(job);
            } else {
                //3. max priority 이면 내가 찾는 job이 맞는지 확인한다.
                turn ++ ;
                if (location == job.location)
                    break;
            }

        }
        return turn;
    }

    class PrintJob{
        int priority;
        int location;

        public PrintJob(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }


    public static void main(String[] args) {
        Printer sol = new Printer();
        int [] priorities = {2, 1, 3, 2};
        System.out.print(sol.solution(priorities,0));
    }

}
