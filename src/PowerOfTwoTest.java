import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

    @Test
    void test() {
        PowerOfTwo test = new PowerOfTwo();
        double output = test.value(32);

        while (output > 0)
        {
            if (output == 1 || output < 1)
                break;

            System.out.println(output);

            output /= 2;
        }
        assertEquals(1, output);
    }
}