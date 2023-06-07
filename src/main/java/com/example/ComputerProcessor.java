package com.example;

import java.util.ArrayList;
import java.util.List;

public class ComputerProcessor {

    private List <Object> computers = new ArrayList <Object> ();
public ComputerProcessor addComputer(Object o) {
computers.add(o);
return ComputerProcessor.this;
}
public void computeAll(long value) {
for (Object o : computers) {
long computedValue = -1;
if (o instanceof Doubler) {
computedValue = ((Doubler) o).computeDouble(value);
} else if (o instanceof Squarer) {
computedValue = ((Squarer) o).computeSquare(value);
}
String name = o.getClass().getSimpleName();
System.out.println("Computer: " + name + ", value: " + value
+ " computed value: " + computedValue);
}
}
    
}