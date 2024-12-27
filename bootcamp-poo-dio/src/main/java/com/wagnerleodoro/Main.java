package com.wagnerleodoro;

import com.wagnerleodoro.dominio.Bootcamp;
import com.wagnerleodoro.dominio.Curso;
import com.wagnerleodoro.dominio.Dev;
import com.wagnerleodoro.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Bootcamp Java Developer");
        curso1.setDescricao("Bootcamp Java Developer DIO");
        curso1.setCargaHoraria(64);

        Curso curso2 = new Curso();
        curso2.setTitulo("Bootcamp GFT START #2 Java");
        curso2.setDescricao("Bootcamp GFT START #2 Java DIO");
        curso2.setCargaHoraria(80);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Bootcamp Java Developer");
        mentoria1.setDescricao("Mentoria Bootcamp Java Developer DIO");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devs = new Dev();
        devs.setNome("Wagner Leodoro");
        devs.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devs.getConteudosInscritos());
        devs.progredir();
        devs.progredir();
        devs.progredir();
        System.out.println("Conteúdos inscritos: " + devs.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devs.getConteudosConcluidos());

        System.out.println("XP: " + devs.calcularTotalXp());

    }
}