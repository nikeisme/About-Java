import java.util.*;

public class ClothesSet {
    public int solution(int n, int[] lost, int[] reverse) {
        // 1. set을 만든다.
        HashSet<Integer>resSet = new HashSet<>();
        HashSet<Integer>losSet = new HashSet<>();

        for(int i : reverse)
            resSet.add(i);
        for(int i : lost)
            if(resSet.contains(i))
                resSet.remove(i);
            else
                losSet.add(i);

        // 2. 여분을 기준으로 앞뒤를 확인하여 체육복을 빌려준다.
        for (int i : resSet)
            if(losSet.contains(i-1))
                losSet.remove(i-1);
            else if(losSet.contains(i+1))
                losSet.remove(i+1);

        // 3. 전체 학생 수에서 lostSet에 남은 학생수를 빼준다.
        return n - losSet.size();

    }

    public static void main(String[] args) {
        ClothesSet sol = new ClothesSet();
        int[] lost = { 2, 4 };
        int[] reserve = { 1, 3, 5 };
        System.out.print(sol.solution(5, lost, reserve));
    }

}
