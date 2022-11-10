import java.util.*;

class KaKaoReport {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        // 1. 중복제거
        HashSet<String> reportSet = new HashSet<String>();
        for (String rep : report) reportSet.add(rep);

        // 2. report에서 각 사람이 신고 당한 횟수를 counthash로 정의하기
        HashMap<String,ArrayList<String>> notifyListHash = new HashMap<>();

        for(String rep :reportSet) {
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0,blankIdx);
            String reportee = rep.substring(blankIdx+1);

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee,null);
            if(reporterList==null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            notifyListHash.put(reportee,reporterList);
        }

        // 3.notifyListHash를 기반으로 reportHash 만들기
        HashMap<String,Integer> reporterHash = new HashMap<>();

        for (ArrayList<String>notifyList : notifyListHash.values())
            if(notifyList.size()>=k)
                for(String reporter : notifyList)
                    reporterHash.put(reporter,reporterHash.getOrDefault(reporter,0)+1);

        // 4. reporterHash 정보를 answer에 옮겨담기
        for (int i=0; i<id_list.length; i++)
            answer[i] = reporterHash.getOrDefault(id_list[i],0);

        return answer;
    }

    public static void main(String[] args){
        KaKaoReport sol = new KaKaoReport();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        // String[] id_list = {"con", "ryan"};
        // String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        // int k = 3;
        sol.solution(id_list, report, k);
    }


}

// 1. ["muzi", "frodo", "apeach", "neo"] 4명의 사용자 정보가 주어짐

// 2. 중복을 제거해야한다.

// Why? 무지가 프로도를 여러번 신고 가능하나 딱 한번만 인정된다. 앞단에서 전처리로 끝내버리면 훨씬 수월하다.
// HashSet으로 옮기는 순간 중복 제거된다.

// 3. 신고자 목록을 관리
// - NotifyListHash key : 신고 당한 사람(String) / value : 신고 한사람 (ArrayList)
// 이것이 몇번 신고 당했는지 횟수를 알 수 있음. k 이상이면 ArrayList에 있는 사람에게 신고 결과를 알려주면 됨

// 4. 신고 결과를 알려주기 위한 reporterHash
// 신고를 한 사람이 결과를 몇 번 받았느냐 알려줄 수 있음. (  k이상일 때만 신고 결과 알려줄 수 있음)

