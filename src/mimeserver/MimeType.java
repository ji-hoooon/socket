package mimeserver;
/**
 * public static fianl 생략된 변수들
 */
public interface MimeType {
    public static final String APPLICATION_JSON = "application/json";       //{"title":"제목", "content":"내용"}
    public static final String TEXT_HTML = "text/html";     //<html>title : 제목 <br/> content: 내용</html>
    public static final String FORM_URLENCODED = "application/x-www-form-urlencoded";   //title=제목&content=내용

    //form 태그: x-www-form 인코딩
    //주소 : 쿼리스트링

}
