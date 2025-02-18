package example.day02._2의존성;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* SRPING에서 권장하는 방법 (공문)
*
* */
@Service // @Service에는 @Component 포함
class SampleService4 {
   void method() {
       System.out.println("SampleService4.method");
   }
} // c e
class SampleController4 {
    // static : 전역 키워드 , final : 수정 불가능 키워드!
    private final SampleService4 sampleService4;

    @Autowired // @Autowired : DI (Dependency Injection)
    public SampleController4(SampleService4 sampleService4) {
        this.sampleService4 = sampleService4;
    }

    public  void method() {
        sampleService4.method();
    }
} // C E

public class Example4 {
}
