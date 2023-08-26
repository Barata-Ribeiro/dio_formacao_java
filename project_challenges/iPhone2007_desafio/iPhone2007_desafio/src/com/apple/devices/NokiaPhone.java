package com.apple.devices;

import com.apple.interfaces.MusicPlayer;
import com.apple.interfaces.PhoneDevice;

public class NokiaPhone implements PhoneDevice, MusicPlayer {

  // Methods for music player
  boolean isPlaying = false;

  @Override
  public void play() {

    if (isPlaying)
      System.out.println("Music player is already playing!");

    isPlaying = true;
    System.out.println("Music player is playing...");
  }

  @Override
  public void pause() {
    if (!isPlaying)
      System.out.println("No music is playing!");

    isPlaying = false;
    System.out.println("Music player is paused...");
  }

  @Override
  public void stop() {
    isPlaying = false;
    System.out.println("Music player is stopped...");
  }

  @Override
  public void selectTrack(String trackName) {
    System.out.println("Selected track: " + trackName);
    play();
  }

  // Methods for phone device
  boolean isInCall = false;

  @Override
  public void call(String phoneNumber) {
    System.out.println("Calling: " + phoneNumber);
    isInCall = true;
  }

  @Override
  public void pickUp() {
    if (!isInCall)
      System.out.println("No phone is in call!");

    System.out.println("Picking up call...");
    isInCall = false;
  }

  @Override
  public void voiceMessage(String phoneNumber, String message) {
    System.out.println("Sending " + phoneNumber + " the following voice Message: " + message);
  }

}
