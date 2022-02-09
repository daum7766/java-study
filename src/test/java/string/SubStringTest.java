package string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SubStringTest {

    @Test
    @DisplayName("특정범위의 문자열을 가져오기 위해 자른다.")
    void subString1() {
        // given
        String expected = "010";
        String value = "010-1234-5678";

        // when
        // 여기에 작성하시면 됩니다.
        String answer = null;

        // then
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    @DisplayName("특정위치 이후의 문자열을 가져온다.")
    void subString3() {
        // given
        String expected = "1234-5678";
        String value = "010-1234-5678";

        // when
        // 여기에 작성하시면 됩니다.
        String answer = null;

        // then
        assertThat(answer).isEqualTo(expected);
    }
}
