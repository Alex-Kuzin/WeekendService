import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.CalcWeekend;

public class CalcWeekendTest {
    @ParameterizedTest
    @CsvSource({
            "2,100000,60000,150000",
            "3,10000,3000,20000"
    }

    )
    public void shouldCalcExtract(int expected, int income, int expenses, int threshold) {
        CalcWeekend service = new CalcWeekend();
        // int expected = 2;
        int calcCount = (int) service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, calcCount);

    }
}