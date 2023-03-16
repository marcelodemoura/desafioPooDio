import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso java");
        mentoria.setDescricao("Live ao vivo");
        mentoria.setLocaldate(LocalDate.now());

        System.out.println("\n"+curso1);
        System.out.println("\n"+curso2);
        System.out.println("\n"+mentoria);

    }
}