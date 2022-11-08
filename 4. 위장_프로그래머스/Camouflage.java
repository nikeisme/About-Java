import java.util.*;


public class Camouflage {
    public int solution(String[][] clothes) {

        HashMap<String,Integer> map = new HashMap<>();
//        1.옷을 종류별로 분류
        for(String[] clothe : clothes){
            String type = clothe[1];
            map.put(type, map.getOrDefault(type,0)+1);
        }

//        2. 입지 않는 경우 까지 합침
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while (it.hasNext())
            answer *= it.next().intValue()+1;

//        3. 입지 않는 경우 제외
        return answer-1;
    }



    public static void main (String[] args) {

        Camouflage sol = new Camouflage();
        String[][] clothes = {{"yellow_hat", "headgear"},
                            {"blue_sunglasses", "eyewear"},
                            {"green_turban", "headgear"},};
        System.out.println(sol.solution(clothes));
    }
}
