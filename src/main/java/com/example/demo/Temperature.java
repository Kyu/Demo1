package com.example.demo;

public class Temperature {
    public float celsius;

    public float fahrenheit;
    private int id;

    public Temperature(int id, float value) {
        this.id = id;
        if (id == TempID.CELSIUS.id) {
            celsius = value;
            fahrenheit = celsiusToF(value);
        } else if (id == TempID.FAHRENHEIT.id) {
            fahrenheit = value;
            celsius = fahrenheitToC(value);
        } else {
            celsius = fahrenheit = -1000;
        }
    }

    public float getCelsius() {
        return celsius;
    }

    public float getFahrenheit() {
        return fahrenheit;
    }

    public int getId() {
        return id;
    }

    private float celsiusToF(float value) {
        return value * 9/5 + 32;
    }

    private float fahrenheitToC(float value) {
        return (value - 32) * 5/9;
    }

}

enum TempID {
    KELVIN(0),
    CELSIUS(1),
    FAHRENHEIT(2),
    RANKINE(3);

    public final int id;

    private TempID(int id) {
        this.id = id;

    }
}