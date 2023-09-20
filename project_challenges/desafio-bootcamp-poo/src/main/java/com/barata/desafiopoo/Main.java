package com.barata.desafiopoo;

import java.time.LocalDate;

import com.barata.desafiopoo.dominio.Bootcamp;
import com.barata.desafiopoo.dominio.Curso;
import com.barata.desafiopoo.dominio.Dev;
import com.barata.desafiopoo.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {

    Curso cursoUm = new Curso();
    cursoUm.setTitulo("Curso Java");
    cursoUm.setDescricao("Curso de formação Java");
    cursoUm.setCargaHoraria(120);

    Curso cursoDois = new Curso();
    cursoDois.setTitulo("Curso JavaScript");
    cursoDois.setDescricao("Curso de formação em JavaScript");
    cursoDois.setCargaHoraria(120);

    Curso cursoTres = new Curso();
    cursoTres.setTitulo("Curso TypeScript");
    cursoTres.setDescricao("Curso de formação em TypeScript");
    cursoTres.setCargaHoraria(60);

    Mentoria mentoriaJava = new Mentoria();
    mentoriaJava.setTitulo("Mentoria de Java");
    mentoriaJava.setDescricao("Mentoria para a formação de devs em Java");
    mentoriaJava.setData(LocalDate.now());

    // System.out.println(cursoUm);
    // System.out.println(cursoDois);
    // System.out.println(mentoriaJava);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp FullStack Developer");
    bootcamp
        .setDescricao("Este é o Bootcamp orientado aos que desejam se tornarem desenvolvedores de software FullStack.");
    bootcamp.getConteudosDoBootcamp().add(cursoUm);
    bootcamp.getConteudosDoBootcamp().add(cursoDois);
    bootcamp.getConteudosDoBootcamp().add(cursoTres);
    bootcamp.getConteudosDoBootcamp().add(mentoriaJava);

    Dev devUm = new Dev();
    devUm.setNome("Jason Bourne");
    devUm.inscreverBootcamp(bootcamp);
    System.out
        .println(
            "Desenvolvedor(a): " + devUm.getNome() + " - " + "Conteúdos Inscritos: " + devUm.getConteudosInscritos());

    System.out.println();

    devUm.progredir();

    System.out
        .println(
            "Desenvolvedor(a): " + devUm.getNome() + " - " + "Conteúdos Concluídos: " + devUm.getConteudosConcluidos());

    System.out.println();

    System.out
        .println(
            "Desenvolvedor(a): " + devUm.getNome() + " - " + "Conteúdos Inscritos: " + devUm.getConteudosInscritos());

    System.out.println("XP do dev: " + devUm.calcularXpTotal());

    System.out.println();
    System.out.println("---------------------------------------------------");
    System.out.println();

    Dev devDois = new Dev();
    devDois.setNome("Barata Ribeiro");
    devDois.inscreverBootcamp(bootcamp);
    System.out
        .println("Desenvolvedor(a): " + devDois.getNome() + " - " + "Conteúdos Inscritos: "
            + devDois.getConteudosInscritos());
    devDois.progredir();
    devDois.progredir();

    System.out.println();

    System.out.println(
        "Desenvolvedor(a): " + devDois.getNome() + " - " + "Conteúdos Concluídos: " + devDois.getConteudosConcluidos());

    System.out.println();

    System.out
        .println("Desenvolvedor(a): " + devDois.getNome() + " - " + "Conteúdos Inscritos: "
            + devDois.getConteudosInscritos());
    devDois.progredir();
    devDois.progredir();

    System.out.println();

    System.out
        .println("Desenvolvedor(a): " + devDois.getNome() + " - " + "Conteúdos Inscritos: "
            + devDois.getConteudosInscritos());

    System.out.println();

    System.out.println(
        "Desenvolvedor(a): " + devDois.getNome() + " - " + "Conteúdos Concluídos: " + devDois.getConteudosConcluidos());
    System.out.println("XP do dev: " + devDois.calcularXpTotal());

  }

}
