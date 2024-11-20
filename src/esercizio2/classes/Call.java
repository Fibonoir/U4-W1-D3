package esercizio2.classes;

public class Call {
    private int duration; // duration in minutes
    private String numberCalled;

    public Call(int duration, String numberCalled) {
        this.duration = duration;
        this.numberCalled = numberCalled;
    }

    @Override
    public String toString() {
        return "Number Called: " + numberCalled + ", Duration: " + duration + " minutes";
    }
}
