import br.com.dio.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("back end com java e springboot");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(cursoNovo);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev dev1 = new Dev();
        dev1.setNome("Joõa");
        dev1.inscreverBootcamp(bootcamp);

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);

        System.out.println("Conteudo inscritos João: " + dev1.getConteudosInscritos());
        System.out.println("Conteudo concluídos João: " + dev1.getConteudosConcluídos());
        System.out.println("XP Joaõ: " + dev1.calcularTotalXp());
        System.out.println("______________________________________");
        System.out.println("Conteudo inscritos Maria: " + dev2.getConteudosInscritos());
        System.out.println("Conteudo concluídos Maria: " + dev2.getConteudosConcluídos());
        System.out.println("XP Maria: " + dev2.calcularTotalXp());

        dev1.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("______________________________________");

        System.out.println("Conteudo inscritos João: " + dev1.getConteudosInscritos());
        System.out.println("Conteudo concluídos João: " + dev1.getConteudosConcluídos());
        System.out.println("XP Joaõ: " + dev1.calcularTotalXp());
        System.out.println("______________________________________");
        System.out.println("Conteudo inscritos Maria: " + dev2.getConteudosInscritos());
        System.out.println("Conteudo concluídos Maria: " + dev2.getConteudosConcluídos());
        System.out.println("XP Maria: " + dev2.calcularTotalXp());
        }


}