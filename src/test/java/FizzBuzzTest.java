import fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void initEach() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_Buzz_when_the_number_is_5() {
        //given
        int givenNumber = 5;
        //when

        String resultFizzBuzz = fizzBuzz.execute(givenNumber);

        assertThat(resultFizzBuzz).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @CsvSource({
            "3",
            "6",
            "9",
            "12",
            "99",
            "3333"
    })
    void should_return_Fizz_when_the_number_is_dividable_by_3(int number) {
        // when

        String resultFizzBuzz = fizzBuzz.execute(number);
        assertThat(resultFizzBuzz).isEqualTo("Fizz");
    }

    @Test
    void should_not_return_FizzBuzz_when_the_number_is_15() {
        int number = 15;

        String result = fizzBuzz.execute(number);

        assertThat(result).isEqualTo("FizzBuzz");

    }

    @ParameterizedTest
    @CsvSource({
            "4",
            "7",
            "8",
            "13",

    })
    void should_return_the_number_when_the_number_is_not_divisile_by_3_or_5(int number) {

        String result=fizzBuzz.execute(number);

        assertThat(result).isEqualTo(""+number);
    }

    @ParameterizedTest
    @CsvSource({
            "5",
            "15",
            "25",
            "35",

    })
    void should_return_the_Buzz_when_the_number_is_divisile_by_5(int number) {

        String result=fizzBuzz.execute(number);

        assertThat(result).isEqualTo("Buzz");
    }

}
