package main.java.views;
import main.java.controllers.MainController;

public class ConsoleView {
    MainController mainController;

    public ConsoleView(){
        mainController=new MainController();
    }

    public static void main(String[] args) {
        ConsoleView consoleView=new ConsoleView();

        consoleView.welcomeInfo();
        consoleView.loopView();



    }

    public void welcomeInfo(){
        System.out.println(" ");
        System.out.println("Witaj w Applikacji WeatherMap.");
        System.out.println("Jeżeli chcesz zakończyć aplikację wybierz '0' a następnie naciśnij 'Enter'." );
        System.out.println("Wpisz miasto do którego dla którego chcesz uzyskać informacje pogodowe:  ");
    }


    public void loopView(){
        mainController.getUserData();
        do{
            mainController.loadData();
            if(mainController.errorAppear()) {
                break;
            }
            System.out.println("Obecna pogoda dla miasta "+mainController.passUserData());
            System.out.println("Temperatura średnia: "+(mainController.giveWeatherTemp()-273.15)+"st C");
            System.out.println("Temperatura min: "+(mainController.giveWeatherTempMin()-273.15)+"st C");
            System.out.println("Temperatura max: "+(mainController.giveWeatherTempMax()-273.15)+"st C");
            System.out.println("Ciśnienie: "+mainController.giveWeatherPressure()+"hPa");
            System.out.println("Wilgotność: "+mainController.giveWeatherHumidity()+"%");
            System.out.println("Zachmurzenie: "+mainController.giveWeatherCloud()+"%");
            System.out.println("Predkosc wiatru: "+mainController.giveWeatherWind()+"m/s");
            System.out.println("Wpisz kolejne miasto: ");
            mainController.getUserData();



        }while(!mainController.passUserData().equals("0"));
    }
}
