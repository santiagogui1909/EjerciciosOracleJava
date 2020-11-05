package EjerciciosPracticas3;

public class libroCalificaciones3 {

        private String nombreDelCurso;

        public void establecerNombreDelCurso(String nombre) {

            nombreDelCurso = nombre;
        }

        public String obtenerNombreDelCurso () {

            return nombreDelCurso;
        }

        public void mostrarMensaje () {
            System.out.println("Bienvenido al libro de calificaciones para " + obtenerNombreDelCurso());
        }
    }
