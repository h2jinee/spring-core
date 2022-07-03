package hello.core.singleton;

public class SingletonService {

    // 클래스 level에 올라가기 때문에 1개만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
