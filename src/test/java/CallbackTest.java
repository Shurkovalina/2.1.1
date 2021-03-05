import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbackTest {


    @Test
    void shouldSubmitRequest() {
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Матвей Морозов");
        $("[data-test-id=phone] input").setValue("+79200000000");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $(".paragraph").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}