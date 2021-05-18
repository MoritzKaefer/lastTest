import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test2_Given_WeWantToSeeAWelcomeMessage_When_WeGetTheMessage_Then_theMessageShouldBeExactlyHelloTest2(){
        //arrange

        //act
        String actual = Main.GetMessage();
        //assert
        Assertions.assertEquals("hello lasttest", actual);
    }
}
