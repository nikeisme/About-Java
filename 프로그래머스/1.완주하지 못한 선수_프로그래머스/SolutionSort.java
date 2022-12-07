import java.util.Arrays;

class SolutionSort {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

//      1. 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

//      2. 다른 점이 나올 때까지 찾는다.
        int i=0 ;
        for(; i< completion.length; i++)
            if (!participant[i].equals(completion[i]))
                break;

//      3. 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미.
        return participant[i];
    }

    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution sol = new Solution();
        System.out.println(sol.solution(part, comp));
    }
}

