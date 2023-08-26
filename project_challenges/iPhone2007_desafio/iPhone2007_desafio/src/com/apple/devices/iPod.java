package com.apple.devices;

import com.apple.interfaces.MusicPlayer;

public class iPod implements MusicPlayer {
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
}
