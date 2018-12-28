package main.java.models;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import main.java.models.dto.WeatherDto;
import main.java.models.Config;

public class LoadWeather {
    private Gson gson;
    private Config config;
    Scanner scanner=new Scanner(System.in);
    private String userInput="";
    WeatherDto weatherDto;
    private boolean error;


    public LoadWeather(){
        gson=new Gson();
        config=new Config();
        weatherDto=new WeatherDto();

    }

    public WeatherDto loadWeatherToClass(){
        WeatherDto weatherDto = convertJson(readWebsite("http://api.openweathermap.org/data/2.5/weather?q=" + userInput + "&appid=" + config.apiKey));
        return weatherDto;

    }

    public String readWebsite(String urlAdress){
        StringBuilder content=new StringBuilder();
        HttpURLConnection http;
        error=false;
        try {
            http = (HttpURLConnection) new URL(urlAdress).openConnection();

            InputStream inputStream = http.getInputStream();

            int data;
            while ((data=inputStream.read()) != -1) {
                content.append((char) data);
            }

            inputStream.close();
        }catch(IOException e){
            System.out.println("Błędne wprowadzone dane");
            error=true;
        }catch(NullPointerException n){
            System.out.println("Błędne wprowadzone dane");
            error=true;
        }

        return content.toString();
    }


    public WeatherDto convertJson(String content){
        return  gson.fromJson(content, WeatherDto.class);

    }

    public void getUserInput(){
        userInput=scanner.nextLine();
    }


    public String passUserInput(){
        return userInput;
    }

    public boolean getErrorValue(){
        return error;
    }

}
