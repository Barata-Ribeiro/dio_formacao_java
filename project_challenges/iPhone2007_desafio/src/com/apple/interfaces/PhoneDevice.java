package com.apple.interfaces;

public interface PhoneDevice {
  void call(String phoneNumber);

  void pickUp();

  void voiceMessage(String phoneNumber, String message);
}
