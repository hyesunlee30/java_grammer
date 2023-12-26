package C17ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class AuthorRepository {
     //실행서비스
     static List<Author> authors = new ArrayList<>();

     void register(Author author) {
         authors.add(author);
     }

     Optional<Author> findByEmail(String email) {
         Optional<Author> author = authors.stream()
                 .filter(a->a.getEmail().equals(email))
                 .findFirst();
         return author;
     }
}
