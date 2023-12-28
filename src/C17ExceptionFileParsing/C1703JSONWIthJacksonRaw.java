package C17ExceptionFileParsing;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C1703JSONWIthJacksonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String path = "src/C17ExceptionFileParsing/test_data1.json";

        try {
            //readTree를 통해서 json을 계층적 트리구조형태로 변환
            JsonNode node = mapper.readTree(Paths.get(path).toFile());
            Map<String,String> map = new HashMap<>();
            map.put("id", node.get("id").asText());
            map.put("name", node.get("name").asText());
            map.put("classNumber", node.get("classNumber").asText());
            map.put("city", node.get("city").asText());

            for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                System.out.println(stringStringEntry.getKey() + " "+stringStringEntry.getValue());
            }
            //key, value 중에 value 타입이 예상되지 않을때는 Object 타입으로도 받을 수 있따.
            Map postMap = mapper.readValue(Paths.get(path).toFile(), Map.class);
            System.out.println(postMap);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}


