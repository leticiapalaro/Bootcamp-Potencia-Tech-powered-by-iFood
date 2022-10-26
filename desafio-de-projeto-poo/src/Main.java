import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Abstraindo um Bootcamp usando Java OO");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Aprenda JavaScript com as atualizações do ECMA Script");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Turbine seu perfil no LinkedIn");
        mentoria1.setDescricao("Otimize seu perfil no LinkedIn");
        mentoria1.setData(LocalDate.of(2022,11,10));

    }
}
