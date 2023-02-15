package assignment.as0213;

import com.google.gson.Gson;
import parser.Transaction;

import java.util.Date;

public class JsonParseApp {
    public static void main(String[] args) {
        User user = new User(6,"asdf","1234", new Date("2023/02/13"), new Date("2023/02/13"));

        //MIME 타입중에 하나를 보내야 한다.
        //: MIME 타입중 application/json 이용

        Gson gson = new Gson();
        //Gson을 이용해 직렬화해 BW
        String json = gson.toJson(user);
        //역직렬화해 BR

        System.out.println(json);
    }
}
