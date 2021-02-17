package com.company.hardware;

import com.company.arkia.Boing747;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Engine engine = new Engine("suzuki", 100, 0, 887, 500);
        Boing747 aircraft = new Boing747(engine);
        aircraft.fly(1_000_000);
        if (engine.doesEngineNeedsRestart()) {
            System.out.println("take engine to repair...");
        }
    }
}
