import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp JavaDeveloper");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Dev 1"+ dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Dev 1"+ dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Dev 1"+ dev1.getConteudosConcluidos());
        System.out.println("XP:"+dev1.calcularTotalXp());

        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Dev 2"+ dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Dev 2"+ dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos Dev 2"+ dev2.getConteudosConcluidos());
        System.out.println("XP:"+dev2.calcularTotalXp());








    }
}