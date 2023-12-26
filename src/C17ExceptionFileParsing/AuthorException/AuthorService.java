package C17ExceptionFileParsing.AuthorException;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AuthorService {
    AuthorRepository repository = new AuthorRepository();
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$";
    private static final String PHONE_REGEX =
            "^\\d{3}\\d{3,4}\\d{4}$";

    void register(Author author) throws IllegalArgumentException {

        if(author.getPassword().length() < 5) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
        if(!isValidEmail(author.getEmail()))
        {
            throw new IllegalArgumentException("이메일 형식에 맞지 않습니다.");
        }
        if(!isValidPhoneNumber(author.getPhoneNumber())) {
            throw new IllegalArgumentException("휴대폰 형식에 맞지 않습니다.");
        }
        Optional<Author> search = repository.findByEmail(author.getEmail());
        if(search.isPresent()) {
            throw new IllegalArgumentException("이미 가입된 이메일입니다.");
        }

        repository.register(author);
    }

    Optional<Author> login(String email, String password) throws IllegalArgumentException,NoSuchElementException {
        //email이 존재하지 않으면 예외발생 NosuchElementException
        //password illegalable
        Optional<Author> author = repository.findByEmail(email);
        if(author.isPresent()) {
            if(!author.get().getPassword().equals(password)) {
                throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
            }
        } else {
            throw new NoSuchElementException("이메일이 존재하지 않습니다.");
        }

        return author;
    }
    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
