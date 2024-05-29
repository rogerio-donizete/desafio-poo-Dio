import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descreve o curso java");
        curso.setCargaHoraria(8);

        Curso cursoNovo = new Curso();
        cursoNovo.setTitulo("Curso JavaScript");
        cursoNovo.setDescricao("descreve o curso js");
        cursoNovo.setCargaHoraria(6);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoriaJava");
        mentoriaJava.setDescricao("mentoria atralado ao curso Java");
        mentoriaJava.setCargaHoraria(2);
        mentoriaJava.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoriaJava);
        System.out.println(cursoNovo);
    }
}