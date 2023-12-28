package C17ExceptionFileParsing;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class C1703JSONWIthJacksonClass {
    public static void main(String[] args) {

        String path = "src/C17ExceptionFileParsing/test_data2.json";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(Paths.get(path).toFile());
            List<Student> students = mapper.readValue(node.get("students").toString(),new TypeReference<List<Student>>(){});
            System.out.println(students);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class Student {

    private int id;
    private String name;
    private String classNumber;
    private String city;

    Student(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
