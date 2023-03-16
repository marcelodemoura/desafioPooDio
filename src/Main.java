import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Modulo Basico");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Modulo Basico");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso java");
        mentoria.setDescricao("Live ao vivo");
        mentoria.setLocaldate(LocalDate.now());

        /* System.out.println("\n"+curso1);
        System.out.println("\n"+curso2);
        System.out.println("\n"+mentoria);
         */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setNome("Desecrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João " + devJoao.getConteudosInscritos());
        devJoao.progredindo();
        devJoao.progredindo();
        devJoao.progredindo();
        System.out.println("--");
        System.out.println("Conteudos inscritos João " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluido João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " +devJoao.calcularTaxaXp());

        Dev devJosefa= new Dev();
        devJosefa.inscreverBootcamp(bootcamp);
        devJosefa.setNome("Josefa");
        System.out.println("Conteudos inscritos Josefa " + devJosefa.getConteudosInscritos());

        Dev devJoas = new Dev();
        devJoas.inscreverBootcamp(bootcamp);
        devJoas.setNome("Joas");
        System.out.println("Conteudos inscritos Joas " + devJoas.getConteudosInscritos());
        devJoas.progredindo();
        System.out.println("--");
        System.out.println("Conteudos inscritos Joas " + devJoas.getConteudosInscritos());
        System.out.println("Conteudos Concluido Joas " + devJoas.getConteudosConcluidos());
        System.out.println("XP: " +devJoas.calcularTaxaXp());

        Dev devJoana = new Dev();
        devJoana.inscreverBootcamp(bootcamp);
        devJoana.setNome("Joana");
        System.out.println("Joana Conteudos inscritos " + devJoana.getConteudosInscritos());




    }
}