package parser;

import com.google.gson.Gson;

public class JsonParseApp {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(6,"입금","ATM", "1111", 100);

        //MIME 타입중에 하나를 보내야 한다.
        //: MIME 타입중 application/json 이용

        Gson gson = new Gson();
        //Gson을 이용해 직렬화해 BW
        String json = gson.toJson(transaction);
        //역직렬화해 BR

        System.out.println(json);
    }
}
