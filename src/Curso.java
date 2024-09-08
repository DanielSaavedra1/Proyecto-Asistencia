import java.util.*;

public class Curso {
    private String grado;
    private String letra;
    private final ArrayList <Estudiante> listCurso;
    private final Map <String,Estudiante> mapaEstudiante;

    public Curso(String grado,String letra) {
        setGrado(grado);
        setLetra(letra);
        this.listCurso = new ArrayList<>();
        this.mapaEstudiante = new HashMap<>();
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }

}
