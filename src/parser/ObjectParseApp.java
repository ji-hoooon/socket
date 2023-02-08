package parser;

import com.google.gson.Gson;

public class ObjectParseApp {

    public static void main(String[] args) {
        //\n은 문자열을 감싸는 쌍따옴표가 아니라는 뜻
        String json ="{\"id\":6,\"gubun\":\"입금\",\"sender\":\"ATM\",\"receiver\":\"1111\",\"amount\":100}\n";
        //문자열로 들어온 데이터를 객체로 변환 :역직렬화
        Gson gson = new Gson();
        Transaction transaction =gson.fromJson(json, Transaction.class);
        System.out.println("transaction.getId() = " + transaction.getId());
        System.out.println("transaction.getAmount() = " + transaction.getAmount());
        System.out.println("transaction.getGubun() = " + transaction.getGubun());
        System.out.println("transaction.getReceiver() = " + transaction.getReceiver());
        System.out.println("transaction.getSender() = " + transaction.getSender());
    }
}
