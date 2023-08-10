package edu.barata.smarttv;

public class User {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV is on? " + smartTv.isOn);

    smartTv.turnOn();
    System.out.println("New state - TV is on? " + smartTv.isOn);

    smartTv.decreaseVolume();
    smartTv.decreaseVolume();
    smartTv.decreaseVolume();
    smartTv.increaseVolume();
    System.out.println("Current Volume: " + smartTv.volume);

    System.out.println("Current Channel: " + smartTv.channel);

    smartTv.increaseChannel();
    smartTv.increaseChannel();
    System.out.println("Current Channel: " + smartTv.channel);

    smartTv.decreaseChannel();
    System.out.println("Current Channel: " + smartTv.channel);
    
    smartTv.setChannel(13);
    System.out.println("Current Channel: " + smartTv.channel);

    smartTv.turnOff();
    System.out.println("New state - TV is on? " + smartTv.isOn);
  }
}
