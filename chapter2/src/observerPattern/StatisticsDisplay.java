package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Double> temperature = new ArrayList<>();

    private int times = 0;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

//    @Override
//    public void update(float temperature, float humidity, float pressure) {
//        this.temperature.add((double) temperature);
//        this.times++;
//        display();
//    }

    @Override
    public void update() {
        this.temperature.add((double) weatherData.getTemperature());
        this.times++;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + getAvgTemperature() + "/" + getMaxTemperature() + "/" + getMinTemperature());
    }

    public double getAvgTemperature() {
        double sum = 0;
        for (Double temp : temperature) {
            sum += temp;
        }
        return sum / times;
    }

    public double getMaxTemperature() {
        double max = temperature.get(0);
        for (Double temp : temperature) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public double getMinTemperature() {
        double min = temperature.get(0);
        for (Double temp : temperature) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

}
