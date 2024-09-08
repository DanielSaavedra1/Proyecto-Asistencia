import java.util.ArrayList;

public class Colegio{
    private  ArrayList<Curso> cursos;
    

    public Colegio() {
        this.cursos = new ArrayList<>();
        
        listarCurso();
    }
    public void listarCurso(){
        Curso primeroA = new Curso("1ro Basico", "A");
        cursos.add(primeroA);

        Curso segundoA = new Curso("2do Basico", "A");
        cursos.add(segundoA);

        Curso terceroA = new Curso("3ro Basico", "A");
        cursos.add(terceroA);

        Curso cuartoA = new Curso("4to Basico", "A");
        cursos.add(cuartoA);

        Curso quintoA = new Curso("5to Basico", "A");
        cursos.add(quintoA);

        Curso sextoA = new Curso("6to Basico", "A");
        cursos.add(sextoA);

        Curso septimoA = new Curso("7to Basico", "A");
        cursos.add(septimoA);

        Curso octavoA = new Curso("8vo Basico", "A");
        cursos.add(octavoA);

        Curso primeroMA = new Curso("1ro Medio","A");
        cursos.add(primeroMA);

        Curso segundoMA = new Curso("2do Medio","A");
        cursos.add(segundoMA);

        Curso terceroMA = new Curso("3ro Medio","A");
        cursos.add(terceroMA);

        Curso cuartoMA = new Curso("4to Medio","A");
        Estudiante eCuartoMA = new Estudiante("Daniel","Savedra","Erazo","212194026");
        Estudiante eCuartoMA2 = new Estudiante("Matías","Diaz","Castro","220380025");
        cursos.add(cuartoMA);
    }


}
