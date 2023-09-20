package com.barata.desafiopoo;

import java.time.LocalDate;

import com.barata.desafiopoo.dominio.Curso;
import com.barata.desafiopoo.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {

    Curso cursoUm = new Curso();
    cursoUm.setTitulo("Curso Java");
    cursoUm.setDescricao("Curso de formação Java");
    cursoUm.setCargaHoraria(120);

    Curso cursoDois = new Curso();
    cursoDois.setTitulo("Curso TypeScript");
    cursoDois.setDescricao("Curso de formação em TypeScript");
    cursoDois.setCargaHoraria(80);

    System.out.println(cursoUm);
    System.out.println(cursoDois);

    Mentoria mentoriaJava = new Mentoria();
    mentoriaJava.setTitulo("Mentoria de Java");
    mentoriaJava.setDescricao("Mentoria para a formação de devs em Java");
    mentoriaJava.setData(LocalDate.now());

    System.out.println(mentoriaJava);

  }

}
