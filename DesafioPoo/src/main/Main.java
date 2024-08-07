package main;

import java.time.LocalDate;

import com.desafiopoo.*;

public class Main {
	public static void main(String[] args) {
		Cursos curso1 = new Cursos();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Cursos curso2 = new Cursos();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Devs devGui = new Devs();
        devGui.setNome("Camila");
        devGui.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devGui.getConteudosInscritos());
        devGui.progredir();
        devGui.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devGui.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devGui.getConteudosConcluidos());
        System.out.println("XP:" + devGui.calcularTotalXp());

        System.out.println("-------");

        Devs devJoao = new Devs();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}

