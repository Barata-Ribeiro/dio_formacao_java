import java.util.Scanner;

import com.apple.devices.iPhone;

public class User {
  public static void main(String[] args) {
    iPhone iphone = new iPhone();

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter a song name: ");
      String songName = scanner.nextLine();
      iphone.selectTrack(songName);

      iphone.pause();
      iphone.play();

      iphone.takePhoto("Photo 1");
      iphone.takePhoto("Photo 2");
      iphone.deletePhoto("Photo 2");
      iphone.takePhoto("Photo 3");
      iphone.listPhotos();

      System.out.println("Enter a URL: ");
      String url = scanner.nextLine();
      iphone.openURL(url);
      iphone.refreshPage();
      iphone.addNewTab("https://www.google.com/");

      System.out.println("Enter a phone number: ");
      String phoneNumber = scanner.nextLine();
      iphone.call(phoneNumber);
      iphone.voiceMessage(phoneNumber, "Hello, this is Jason!");
    }
  }
}
