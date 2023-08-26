package com.apple.devices;

import com.apple.interfaces.InternetBrowser;
import com.apple.interfaces.MusicPlayer;
import com.apple.interfaces.PhoneDevice;
import com.apple.utilities.PhotoUtils;

public class iPhone implements InternetBrowser, MusicPlayer, PhoneDevice {
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

  // Methods for web browser

  @Override
  public void openURL(String url) {
    System.out.println("Opening URL: " + url);
  }

  @Override
  public void refreshPage() {
    System.out.println("Refreshing page...");
  }

  @Override
  public void addNewTab(String url) {
    System.out.println("Adding new tab: " + url);
  }

  // Creating photo utilities for the iPhone

  private PhotoUtils photoUtils = new PhotoUtils();

  public void takePhoto(String photoName) {
    photoUtils.takePhoto(photoName);
  }

  public void deletePhoto(String photoName) {
    photoUtils.deletePhoto(photoName);
  }

  public void selectPhoto(String photoName) {
    photoUtils.selectPhoto(photoName);
  }

  public void listPhotos() {
    photoUtils.listPhotos();
  }

}
