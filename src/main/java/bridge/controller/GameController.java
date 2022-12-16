package bridge.controller;

import static org.assertj.core.util.Lists.newArrayList;

import bridge.Bridge;
import bridge.BridgeGame;
import bridge.BridgeMaker;
import bridge.BridgeNumberGenerator;
import bridge.BridgeNumbersGenerator;
import bridge.view.InputView;
import bridge.view.OutputView;
import java.util.List;

public class GameController {
    private InputController inputController;
    private InputView inputView;
    private BridgeGame bridgeGame;
    private Bridge bridge;

    private OutputView outputView;
    private int round;
    private int totalNumber;


    public GameController() {
        this.inputController = new InputController();
        this.bridgeGame = new BridgeGame();
        this.inputView  = new InputView() ;
        this.outputView = new OutputView();
        this.round = 0;
        this.totalNumber = 1;
    }

    public void initGame() {
        int size = inputView.readBridgeSize();
        bridgeGame.initBridge(size);
    }

    public void startGame() {
        bridge = bridgeGame.getBridgeInstance();
        while (round < bridgeGame.getBridgeSize()) {
            String moveCommand = inputView.readMoving();
            boolean result = bridge.getComparison(round,moveCommand);
            round++;
            move(result,moveCommand);
        }
    }

    public void move(boolean result,String moveCommand) {
        bridgeGame.move(result,moveCommand);
        outputView.printMap(bridgeGame.getUserUpNumbers(),bridgeGame.getUserDownNumbers());
        if (!result) {
            round--;
            retry(inputView.readGameCommand());
        }
    }

    public void endGame() {
        outputView.printResultTotalMap(bridgeGame.getUserUpNumbers(),bridgeGame.getUserDownNumbers());
        outputView.printResultSuccess(round, bridgeGame.getBridgeSize());
        outputView.printResultTotalNumber(totalNumber);
    }

    public void retry(String userInput) {
        if (bridgeGame.retry(userInput)) {
            resetGame();
            startGame();
        }
        if (!bridgeGame.retry(userInput)) {
            round=bridgeGame.getBridgeSize()+1;
        }
    }
    public void resetGame(){
        round = 0;
        totalNumber++;
        bridgeGame.resetUserList();
    }
}
