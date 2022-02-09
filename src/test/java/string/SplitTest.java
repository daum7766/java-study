package string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SplitTest {

    @Test
    @DisplayName("문자열을 특정 기준으로 잘라 배열로 만든다.")
    void splitTest1() {
        // given
        String[] expected = {"안녕하세요", "반갑습니다", "수고하셨습니다", "감사합니다"};
        String text = "안녕하세요,반갑습니다,수고하셨습니다,감사합니다";

        // when
        // 여기에 작성하시면 됩니다.
        String[] answer = null;

        // then
        assertThat(answer).isEqualTo(expected);
    }

    @Test
    @DisplayName("문자열을 잘라서 전화번호의 가운데 번호를 가져온다.")
    void splitTest2() {
        // given
        String expected = "1234";
        String text = "010-1234-5678";

        // when
        // 여기에 작성하시면 됩니다.
        String[] answer = null;

        // then
        assertThat(answer[1]).isEqualTo(expected);
    }

    @Test
    @DisplayName("배열의 길이를 제한해서 자른다.")
    void splitTest3() {
        // given
        String[] expected = {"010", "1234-5678"};
        String text = "010-1234-5678";

        // when
        // 여기에 작성하시면 됩니다.
        String[] answer = null;

        // then
        assertThat(answer).isEqualTo(expected);
    }
}
