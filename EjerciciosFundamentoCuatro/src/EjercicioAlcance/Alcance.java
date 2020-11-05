package EjercicioAlcance;

public class Alcance {

    //campo accesible para los metodos de esta clase
    private int x = 0;

    /* el metodo iniciar cree e inizializa la variable local x
    y llama a los metodos usarVariableLocal y usarCampo */

    public void iniciar() {

        int x = 5;
        System.out.println("la x local en el metodo iniciar es: " + x);

        usarVariableLocal(); //usarVariablesLocal tiene la x local
        usarCampo(); //usarCampo usar el campo x de la clase alcance
        usarVariableLocal(); //usarVariableLocal reinicia a la x local
        usarCampo(); //el campo x de la clase alcance retiene su valor x

        System.out.println("la x local en el metodo iniciar es: " + x);

    }
        public void usarVariableLocal () {
            int x = 25;  //se inicializa cada ves que se llame esta clase

            System.out.println("la x local al entrar al metodo usarVariableLocal es " + x);
            ++x; //modifica la variable x local de este metodo

            System.out.println("La X local antes de salir del metodo usarVariableLocal es " + x);
        }

        public void usarCampo () {

            System.out.println("el campo x al entrar al metodo usarCampo es " + x);

            x *= 10;

            System.out.println("el campo antes de salir del metodo UsarCampo es " + x);

        }
}
