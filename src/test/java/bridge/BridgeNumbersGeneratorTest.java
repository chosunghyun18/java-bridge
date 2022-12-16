package bridge;

import org.junit.jupiter.api.Test;

class BridgeNumbersGeneratorTest {
    @Test
    public void bridge_number_test(){
        BridgeNumberGenerator numberGenerator = new BridgeNumbersGenerator(3);

        System.out.println(numberGenerator);
    }

}