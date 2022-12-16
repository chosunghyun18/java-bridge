package bridge.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        try {
            String userinput = readUserInput();
            return Integer.valueOf(userinput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력 해주세요");
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return readUserInput();
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return readUserInput();
    }

    public String readUserInput(){
        return  Console.readLine();
    }
}
