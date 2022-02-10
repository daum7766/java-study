package string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharAtTest {

    @Test
    @DisplayName("String에서 특정 문자를 가져온다1.")
    void charAt1() {
        //given
        char expected = '멍';
        String text = "멍토 블로그";

        //when
        char value = text.charAt(0);

        //then
        assertThat(value).isEqualTo(expected);
    }

    @Test
    @DisplayName("String에서 특정 문자를 가져온다2.")
    void charAt2() {
        //given
        char expected = '로';
        String text = "멍토 블로그";

        //when
        char value = text.charAt(4);

        //then
        assertThat(value).isEqualTo(expected);
    }

    @Test
    @DisplayName("String에서 특정 문자를 가져온다3.")
    void charAt3() {
        //given
        char expected = ' ';
        String text = "멍토 블로그";

        //when
        char value = text.charAt(2);

        //then
        assertThat(value).isEqualTo(expected);
    }

    @Test
    @DisplayName("테스트 이름")
    void name() {
        //given
        int a = 1;
        int b = 1;

        //when
        boolean value = a == b;

        //then
        assertThat(value).isTrue();
    }
}
