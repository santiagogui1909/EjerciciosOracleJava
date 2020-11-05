public class libroCalificaciones4 {

    private String nombreDelCurso;


    public libroCalificaciones4 (String nombre) {
        nombreDelCurso = nombre;
    }

    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso=nombre;
    }

    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

    public void mostrarMensaje(){
        System.out.println("Bienvenido al curso " + obtenerNombreDelCurso());
    }
}
