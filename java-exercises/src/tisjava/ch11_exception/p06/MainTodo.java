package tisjava.ch11_exception.p06;

// TODO 1: Exception을 상속한 LoginExceptionTodo 작성
class LoginExceptionTodo extends Exception {
    public LoginExceptionTodo(String msg) {
        super(msg);
    }
}

public class MainTodo {
    // TODO 2: login(String id) 메소드 작성
    // id가 "admin"이 아니면 LoginExceptionTodo 발생
    static void login(String id) throws LoginExceptionTodo {
        if (!id.equals("admin")) {
            throw new LoginExceptionTodo("관리자 계정만 로그인 가능합니다.");
        }
    }

    public static void main(String[] args) {
        // TODO 3: 예외 메시지 출력
        try {
            login("user");
        } catch (LoginExceptionTodo e) {
            System.out.println(e.getMessage());
        }
    }
}
