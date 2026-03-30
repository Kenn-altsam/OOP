package Lab3.Problem4;

import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
