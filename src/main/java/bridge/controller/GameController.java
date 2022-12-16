package bridge.controller;

import static org.assertj.core.util.Lists.newArrayList;

import bridge.Bridge;
import bridge.BridgeGame;
import bridge.BridgeMaker;
import bridge.BridgeNumberGenerator;
import bridge.BridgeNumbersGenerator;
import bridge.view.InputView;
import java.util.List;

public class GameController {
    private BridgeMaker bridgeMaker;
    private InputController inputController;
    private InputView inputView;
    private BridgeGame bridgeGame;

    public GameController() {
        this.inputController = new InputController();
        this.bridgeGame = new BridgeGame();
        this.inputView  = new InputView() ;
    }

    public void initGame() {
        int size = inputView.readBridgeSize();
        bridgeGame.initBridge(size);
    }

    public void startGame() {
        // get user input
    }

    public void endGame() {

    }

    public void restartGame() {

    }
}
