package com.apple.interfaces;

public interface InternetBrowser {
  void openURL(String url);

  void refreshPage();

  void addNewTab(String url);
}
