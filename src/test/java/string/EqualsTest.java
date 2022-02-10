package string;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EqualsTest {

    @Test
    @DisplayName("String은 비교할때 == 로 비교하면 안된다.")
    void equals1() {
        //given
        String a = "멍토블로그";
        String b = new String("멍토블로그");

        //when
        boolean value = true;

        //then
        assertThat(value).isFalse();
    }

    @Test
    @DisplayName("String은 비교할때 equals 메서드로 비교해야 한다.")
    void equals2() {
        //given
        String a = "멍토블로그";
        String b = new String("멍토블로그");

        //when
        boolean value = false;

        //then
        assertThat(value).isTrue();
    }
}
