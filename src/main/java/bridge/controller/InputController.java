package bridge.controller;

import bridge.BridgeMaker;
import bridge.BridgeNumbersGenerator;
import bridge.view.InputView;
import javax.swing.InputMap;

public class InputController {
    private InputView  inputView;
    public InputController(){
        this.inputView = new InputView();
    }
    public BridgeMaker initBridge(){
        try {
            int size = inputView.readBridgeSize();
            return new BridgeMaker(new BridgeNumbersGenerator(size));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력 해주세요");
        }
    }
}
