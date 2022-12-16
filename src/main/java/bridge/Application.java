package bridge;

import bridge.controller.GameController;

public class Application {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        try{
            gameController.initGame();
            gameController.startGame();
            gameController.endGame();
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
