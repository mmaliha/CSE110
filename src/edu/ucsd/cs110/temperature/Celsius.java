package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    //initialize float obj

    public Celsius(float t)
    {
        super(t);

    }

    @Override
    public Temperature toCelsius() {
        Temperature output = null;

        output = new Celsius(super.getValue());
        return output;

    }

    @Override
    public Temperature toFahrenheit() {
        Temperature output=null;
        output = new Fahrenheit(((super.getValue()*9)/5)+32);

        return output;
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = Float.toString(super.getValue()) + " C";
        return s;

    }
}