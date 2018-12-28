package main.java.models.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {
    @SerializedName("main")
    private MainDto mainDto;

    public MainDto getMainDto() {
        return mainDto;
    }

    @SerializedName("wind")
    private WindDto windDto;



    public WindDto getWindDto() {
        return windDto;
    }

    @SerializedName("clouds")
    private CloudsDto cloudsDto;

    public CloudsDto getCloudsDto() {
        return cloudsDto;
    }


    public class MainDto{
        private double temp;
        private double pressure;
        private double humidity;
        private double temp_min;
        private double temp_max;

        public double getTemp() {
            return temp;
        }

        public double getPressure() {
            return pressure;
        }

        public double getHumidity() {
            return humidity;
        }

        public double getTemp_min() {
            return temp_min;
        }

        public double getTemp_max() {
            return temp_max;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public void setTemp_min(double temp_min) {
            this.temp_min = temp_min;
        }

        public void setTemp_max(double temp_max) {
            this.temp_max = temp_max;
        }
    }


    public class WindDto{
        private double speed;

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
    }

    public class CloudsDto{
        private double all;

        public void setAll(double all) {
            this.all = all;
        }

        public double getAll() {
            return all;
        }
    }

}
