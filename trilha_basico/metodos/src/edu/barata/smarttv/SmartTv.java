package edu.barata.smarttv;

public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int volume = 25;

  // Turn on/off the smart TV
  public void turnOn() {
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  // Change volume
  public void increaseVolume() {
    volume += 1;
    System.out.println("Increasing the volume to: " + volume);
  }

  public void decreaseVolume() {
    volume -= 1;
    System.out.println("Decreasing the volume to: " + volume);
  }

  // Change channel
  public void setChannel(int newChannel) {
    this.channel = newChannel;
  }

  public void increaseChannel() {
    channel += 1;
    System.out.println("Increasing the channel to: " + channel);
  }

  public void decreaseChannel() {
    channel -= 1;
    System.out.println("Decreasing the channel to: " + channel);
  }
}
