package task.bar;

public class Consumer {
    private int age;
    private int wallet;
    private double drunkFigure;
    private double fullnessFigure;

    public Consumer(int age, int wallet) {
        this.age = age;
        this.wallet = wallet;
        this.drunkFigure = 0.0;
        this.fullnessFigure = 0.0;
    }

    public int getAge() {
        return age;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public double getDrunkFigure() {
        return drunkFigure;
    }

    public void setDrunkFigure(double drunkFigure) {
        this.drunkFigure = drunkFigure;
    }

    public double getFullnessFigure() {
        return fullnessFigure;
    }

    public void setFullnessFigure(double fullnessFigure) {
        this.fullnessFigure = fullnessFigure;
    }

    public void printState() {
        System.out.println("현재 상태 - 나이: " + age + ", 잔액: " + wallet + "원, 취한 정도: " + String.format("%.2f", drunkFigure) + ", 포만감: " + String.format("%.2f", fullnessFigure));
    }
}