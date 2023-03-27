import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);



    }
}