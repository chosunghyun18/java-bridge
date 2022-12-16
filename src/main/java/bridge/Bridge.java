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
    public boolean getComparison(int index,String command) {
        if(getTargetBridge().get(index).equals(command)) {
            return true;
        }
        return false;
    }
}
