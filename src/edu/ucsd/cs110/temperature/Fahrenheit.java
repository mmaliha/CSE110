package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        Temperature output=null;
        output = new Celsius(((super.getValue()-32)*5)/9);

        return output;
    }

    @Override
    public Temperature toFahrenheit() {
        Temperature output = null;
        output = new Fahrenheit(super.getValue());
        return output;
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = Float.toString(super.getValue()) + " F";
        return s;

    }
}
