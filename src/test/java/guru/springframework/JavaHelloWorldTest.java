package guru.springframework;

import org.junit.jupiter.api.Test;

/**
 * Created by Donald F. Coffin on 2019-01-27 at 22:54
 **/
class JavaHelloWorldTest {

    @Test
    void getHello() {
        System.out.println(new JavaHelloWorld().getHello());
    }
}