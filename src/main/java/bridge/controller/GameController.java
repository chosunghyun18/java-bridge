package bridge.controller;

import static org.assertj.core.util.Lists.newArrayList;

import bridge.Bridge;
import bridge.BridgeMaker;
import bridge.BridgeNumberGenerator;
import bridge.BridgeNumbersGenerator;
import bridge.view.InputView;
import java.util.List;

public class GameController {
    private BridgeMaker bridgeMaker;
    private InputController inputController;
    private InputView inputView;
    private Bridge bridge;
    public GameController() {
        this.inputController = new InputController();
    }

    public void initGame() {
        int size = inputView.readBridgeSize();
        BridgeNumberGenerator numberGenerator = new BridgeNumbersGenerator(size);
        bridgeMaker =  new BridgeMaker(numberGenerator);
        bridge = new Bridge(bridgeMaker.makeBridge(size));
    }

    public void startGame() {
        // get user input
    }

    public void endGame() {

    }

    public void restartGame() {

    }
}
