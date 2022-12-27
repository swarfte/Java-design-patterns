package observerPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        this.pressure = pressure;
//        display();
//    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        displayForecast();
    }

    public void displayForecast() {
        if (temperature > 80) {
            System.out.println("Forecast: It's going to be hot!");
        } else if (temperature < 60) {
            System.out.println("Forecast: It's going to be cold!");
        } else {
            System.out.println("Forecast: It's going to be normal!");
        }
    }
}
