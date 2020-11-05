public class pruebaLibroCalificaciones4 {

    public static void main (String [] args) {

     libroCalificaciones4 miLibroCalificaciones1 = new libroCalificaciones4("CS101 Introduccion a la Programacion");

     libroCalificaciones4 miLibroCalificaciones2 = new libroCalificaciones4("CS102 Estructuras de Datos en Java");

     System.out.println("El libro del curso de libroCalificaciones 1 es : "
                + miLibroCalificaciones1.obtenerNombreDelCurso());

     System.out.println("El libro del curso de libroCalificaciones 2 es : "
                + miLibroCalificaciones2.obtenerNombreDelCurso());
    }
}
