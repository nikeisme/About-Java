// 전화번호가 접두어인가?
// 하나라도 접두어라면 false, 접두어가 아니면 True

import java.util.Arrays;

class Phonebook_Sort {
    public boolean solution(String[] phone_book) {

        // 1. phoneList를 정렬한다.
        Arrays.sort(phone_book);
        // 2. 1중 lopo를 돌면서 앞번호가 뒷번호의 접두어인지 확인한다.
        for (int i=0; i<phone_book.length-1; i++)
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;
        // 3. 여기까지 오지 못했다면 접두어가 없다는 것이다.
        return true;
    }
}
