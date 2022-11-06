class CalculateTemp{
    
    
    static double celsiusToFahrenheit(double celsius){
        return celsius * 1.8 +32;
    }
    static double celsiusToKelvin(double celsius){
        return celsius+273.15;
    }
    static double kelvintoCelsius(double kelvin){
        return kelvin-273.15;
    }
    static double kelvinToFahrenheit(double kelvin){
        return (kelvin-273.15)*1.8+32;
    }
    static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
    static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit-32)*5/9+273.15;
    }
    
    public static void main(String[] args){
        System.out.println(celsiusToFahrenheit(25.0));
        System.out.println(celsiusToKelvin(25.0));
        System.out.println(kelvintoCelsius(100.0));
        System.out.println(kelvinToFahrenheit(100.0));
        System.out.println(fahrenheitToCelsius(0.0));
        System.out.println(fahrenheitToKelvin(0.0));
        
        
    }
}
