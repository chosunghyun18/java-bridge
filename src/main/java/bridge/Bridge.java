package bridge;

import java.util.List;

public class Bridge {
    private final List<String> targetBridge;
    public Bridge(List<String> targetBridge){
        this.targetBridge = targetBridge;
    }

    public List<String> getTargetBridge() {
        return targetBridge;
    }
}
