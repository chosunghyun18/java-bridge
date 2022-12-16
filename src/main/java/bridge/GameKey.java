package bridge;

public enum GameKey {
    UP(1,"U"),
    Down(0,"D");

    private final int value;
    private final String mean;

    GameKey(int value, String mean) {
        this.value = value;
        this.mean = mean;
    }

    public int getValue() {
        return value;
    }
    public String getMean(){
        return mean;
    }

}
