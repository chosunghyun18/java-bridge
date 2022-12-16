package bridge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BridgeNumbersGenerator implements BridgeNumberGenerator{

    private List<Integer> numbers = new ArrayList<>();
    public BridgeNumbersGenerator(int size){
        BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
        IntStream.range(0,size).forEach(i -> {
            numbers.add(bridgeRandomNumberGenerator.generate());
        });
    }

    // same as testcode
    @Override
    public int generate() {
        return numbers.remove(0);
    }
}
