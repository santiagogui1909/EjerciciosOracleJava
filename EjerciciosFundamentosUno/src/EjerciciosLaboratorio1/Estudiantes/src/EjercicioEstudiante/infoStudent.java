package EjercicioEstudiante;

public class infoStudent {


    String lName = "Luis Hernandez";
    String fName = "Hernandez";
    int studentId = 123456789;
    String status = "Active";

    public infoStudent() {
        super();
        this.lName = lName;
        this.fName = fName;
        this.studentId = studentId;
        this.status = status;
    }

    public void mostrarDatos() {  //sin static

        System.out.println("El nombre del estudiante es: "+lName+
                " \nEl apellido del estudiante es: "+fName+
                " \nEl ID del estudiante es"+studentId+ " \ny el estado del estudiante es :"+status);

    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}

