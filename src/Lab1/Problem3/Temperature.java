package Lab1.Problem3;

import java.awt.font.TextMeasurer;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0.0;
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Defaulting to Celsius.");
            this.scale = 'C';
        }
    }

    public Temperature(double value, char scale) {
        this.value = value;
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Defaulting to Celsius");
        }
    }

    public double getDegreesC() {
        if (scale == 'C') {
            return value;
        } else {
            return (9.0 * value / 5.0) + 32;
        }
    }

    public double getDegreesF() {
        if (scale == 'F') {
            return value;
        }
        else {
            return (9.0 * value / 5.0) + 32;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            if (this.scale != scale) {
                if(scale == 'C') {
                    this.value = getDegreesC();
                }
                else {
                    this.value = getDegreesF();
                }
                this.scale = scale;
            }
        } else {
            System.out.println("Invalid scale of " + scale + ". Scale not changed.");
        }
    }

    public void set(double value, char scale) {
        this.value = value;
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Keeping current scale.");
        }
    }

    public char getScale() {
        return scale;
    }
}
