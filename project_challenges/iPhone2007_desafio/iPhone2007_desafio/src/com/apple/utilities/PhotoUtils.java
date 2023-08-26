package com.apple.utilities;

public class PhotoUtils {
  private String[] photoDatabase = new String[100]; // Simulando um banco de dados para até 100 fotos
  private int photoCount = 0; // Contador de fotos

  public void takePhoto(String photoName) {
    if (photoCount < photoDatabase.length) {
      photoDatabase[photoCount] = photoName;
      photoCount++;
      System.out.println("Photo taken: " + photoName);
    } else {
      System.out.println("Cannot take more photos. Photo database is full.");
    }
  }

  public void deletePhoto(String photoName) {
    for (int i = 0; i < photoCount; i++) {
      if (photoDatabase[i].equals(photoName)) {
        // Shift remaining elements to fill the gap
        for (int j = i; j < photoCount - 1; j++) {
          photoDatabase[j] = photoDatabase[j + 1];
        }
        photoCount--;
        System.out.println("Photo deleted: " + photoName);
        return;
      }
    }
    System.out.println("Photo not found: " + photoName);
  }

  public void selectPhoto(String photoName) {
    for (int i = 0; i < photoCount; i++) {
      if (photoDatabase[i].equals(photoName)) {
        System.out.println("Selected photo: " + photoName);
        return;
      }
    }
    System.out.println("Photo not found: " + photoName);
  }
}
