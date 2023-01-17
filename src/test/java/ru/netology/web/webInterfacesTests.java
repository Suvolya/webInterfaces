package ru.netology.web;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class webInterfacesTests {

    @Test
    void shouldSubmitRequest() {
        open("http://localhost:9999");
        $("span[data-test-id=name] input").setValue("Иванов Василий");
        $("span[data-test-id=phone] input").setValue("+79051112233");
        $("[data-test-id=agreement]").click();
        $("span.button__text").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }


}
