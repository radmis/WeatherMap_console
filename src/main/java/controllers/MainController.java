package main.java.controllers;

import main.java.models.LoadWeather;
import main.java.models.dto.WeatherDto;

public class MainController {

    WeatherDto weatherDto;
    LoadWeather loadWeather;

    public MainController(){
        loadWeather=new LoadWeather();
    }


    public void loadData(){

        weatherDto=loadWeather.loadWeatherToClass();
    }


    public void getUserData(){
        loadWeather.getUserInput();
    }

    public String passUserData(){
        return loadWeather.passUserInput();
    }

    public boolean errorAppear(){
        return loadWeather.getErrorValue();
    }


    public double giveWeatherTemp(){

        return weatherDto.getMainDto().getTemp();
    }

    public double giveWeatherTempMin(){

        return weatherDto.getMainDto().getTemp_min();
    }

    public double giveWeatherTempMax(){

        return weatherDto.getMainDto().getTemp_max();
    }

    public double giveWeatherPressure(){

        return weatherDto.getMainDto().getPressure();
    }

    public double giveWeatherHumidity(){

        return weatherDto.getMainDto().getHumidity();
    }

    public double giveWeatherCloud(){

        return weatherDto.getCloudsDto().getAll();
    }

    public double giveWeatherWind(){

        return weatherDto.getWindDto().getSpeed();
    }
}
