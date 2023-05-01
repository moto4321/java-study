package hello.core.singleton;

public class SingletonService {

    // static으로 하게 되면 class 레벨에 존재하기 때문에 딱 하나만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    // 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
