package com.barataribeiro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
  @Test
  @EnabledIfEnvironmentVariable(named = "USER", matches = "Barata")
  void validarAlgoSomenteNoUsuarioBarata() {
    Assertions.assertEquals(10, 5 + 5);
  }

  @Test
  @DisabledIfEnvironmentVariable(named = "USER", matches = "Barata")
  void validarAlgoSomenteEmOutrosUsuarios() {
    Assertions.assertEquals(20, 10 + 10);
  }

  @Test
  @EnabledOnOs(OS.WINDOWS)
  void validarAlgoSomenteWindows() {
    Assertions.assertEquals(100, 50 + 50);
  }

  @Test
  @EnabledOnOs(OS.LINUX)
  void validarAlgoSomenteLinux() {
    Assertions.assertEquals(8, 4 + 4);
  }

  @Test
  @EnabledOnOs({ OS.LINUX, OS.WINDOWS, OS.SOLARIS })
  void validarAlgoEmCertosSistemas() {
    Assertions.assertEquals(50, 25 + 25);
  }

  @Test
  @EnabledOnJre(JRE.JAVA_8)
  void validarAlgoSomenteEmCertaJRE() {
    Assertions.assertEquals(80, 40 + 40);
  }
}
