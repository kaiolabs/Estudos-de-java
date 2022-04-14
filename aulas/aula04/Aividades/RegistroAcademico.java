package aulas.aula04.Aividades;

public class RegistroAcademico {
    private static int numeroDeMatriculas;

    public RegistroAcademico() {
        numeroDeMatriculas++;
        System.out.println("Número de matrículas: " + numeroDeMatriculas);
    }
}
