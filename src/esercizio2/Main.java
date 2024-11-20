package esercizio2;

import esercizio2.classes.Sim;

public class Main {
    public static void main(String[] args) {
        // Create a new SIM instance
        Sim mySim = new Sim("123456789");

        // Add credit to the SIM
        mySim.addCredit(20.0);

        // Simulate calls
        mySim.addCall(10, "987654321");
        mySim.addCall(5, "456789123");
        mySim.addCall(15, "654321987");
        mySim.addCall(7, "789123456");
        mySim.addCall(20, "123789456");
        mySim.addCall(12, "321987654"); // This call will push out the oldest one (987654321)

        // Print SIM data
        mySim.printSimData();
    }
}

//
