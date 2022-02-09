package string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UpperLowerTest {

    @Test
    @DisplayName("소문자를 대문자로 변환한다.")
    void upper() {
        // given
        String expected = "ABCDEF!!";
        String text = "abcdef!!";

        // when
        // 여기에 작성하시면 됩니다.
        String answer = null;

        // then
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    @DisplayName("대문자를 소문자로 변환한다.")
    void lower() {
        // given
        String expected = "abcdef!!";
        String text = "ABCDEF!!";

        // when
        // 여기에 작성하시면 됩니다.
        String answer = null;

        // then
        assertThat(answer).isEqualTo(expected);
    }
}
