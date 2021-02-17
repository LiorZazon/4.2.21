package com.company.arkia;

import com.company.hardware.Engine;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Boing747 {

    private Engine engine1;

    //function:
    public void fly (double miles) {
        engine1.runEngine(miles);
    }

}
