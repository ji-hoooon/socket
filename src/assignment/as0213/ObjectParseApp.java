package assignment.as0213;

import com.google.gson.Gson;
import parser.Transaction;

public class ObjectParseApp {

    public static void main(String[] args) {
        //\n은 문자열을 감싸는 쌍따옴표가 아니라는 뜻
        String json ="{\"uno\":6,\"id\":\"asdf\",\"pw\":\"1234\",\"regDate\":\"Feb 13, 2023, 12:00:00 AM\",\"upDate\":\"Feb 13, 2023, 12:00:00 AM\"}\n";
        //문자열로 들어온 데이터를 객체로 변환 :역직렬화
        Gson gson = new Gson();
        User user=gson.fromJson(json, User.class);
        System.out.println("user = " + user);
    }
}
