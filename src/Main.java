import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrisao do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrisao do curso js");
        curso2.setCargaHoraria(10);




        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria do java");
        mentoria1.setDescricao("descrisoao mentoria java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAva Developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ devMateus.getConteudosInscritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: "+ devMateus.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devMateus.getConteudosConcluidos());
        System.out.println("XP: "+ devMateus.calcularTotalXp());


        System.out.println("---------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());





        }

}