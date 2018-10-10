public class CellularPhone {
    /* フィード */
    String telephoneNumber;
    int batteryRemaining = 100;

    /* コンストラクタ */
    public CellularPhone(String telNum) {
        telephoneNumber = telNum;
    }

    /* メソッド */
    // 着信メソッド
    public void receiveCall(String caller) {
        System.out.println("リン！リン！リン！");
        System.out.println(caller + " から " + telephoneNumber + " への着信");
    }

    // 通話メソッド
    public void talkiSomething(String msg) {
        System.out.println("[" + msg + "]");
    }

    // 切断メソッド
    public void hungUp() {
        System.out.println("通話終了");
        batteryRemaining = batteryRemaining - 10;
        System.out.println("バッテリー残量 = " + batteryRemaining);
    }
}