package esercizio2.classes;

import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String phoneNumber;
    private double credit;
    private List<Call> callHistory;

    public Sim(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credit = 0.0;
        this.callHistory = new ArrayList<>();
    }

    public void addCall(int duration, String numberCalled) {
        if (callHistory.size() == 5) {
            callHistory.remove(0); // Remove the oldest call to maintain the list size
        }
        callHistory.add(new Call(duration, numberCalled));
    }

    public void addCredit(double amount) {
        if (amount > 0) {
            this.credit += amount;
        }
    }

    public void printSimData() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Credit: €" + credit);
        System.out.println("Call History:");
        if (callHistory.isEmpty()) {
            System.out.println("No calls made.");
        } else {
            for (Call call : callHistory) {
                System.out.println(call);
            }
        }
    }
}
