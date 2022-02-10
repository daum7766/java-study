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
        // 여기에 작성하시면 됩니다.
        char value = 'a';

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
        // 여기에 작성하시면 됩니다.
        char value = 'a';

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
        // 여기에 작성하시면 됩니다.
        char value = 'a';

        //then
        assertThat(value).isEqualTo(expected);
    }
}
