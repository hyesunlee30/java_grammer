package C17ExceptionFileParsing;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C1705JsonWithJackSonHttp {
    public static void main(String[] args) {
        URI uri = URI.create("https://jsonplaceholder.typicode.com/posts/1");
        URI uri2 = URI.create("https://jsonplaceholder.typicode.com/posts");

        //http 클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
        //http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            Post1 post = mapper.readValue(body, Post1.class);
            System.out.println(post.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //http 요청객체 생성
        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(uri2)
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request2, HttpResponse.BodyHandlers.ofString());
            String body = response.body();

            List<Post1> postList = mapper.readValue(body, new TypeReference<List<Post1>>(){});

            //java객체를 json 직렬화
            String serialized_data = mapper.writeValueAsString(postList);
            System.out.println(serialized_data);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}


class Post1 {
    int userId;
    int id;
    String title;
    String body;

    Post1(){
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post1{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}