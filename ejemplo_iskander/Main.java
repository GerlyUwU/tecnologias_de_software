public class Main {
    public static void main(String[] args) {
        Tarea tareaUno = new Tarea("Hacer memes del profe Pino");
        Tarea tareaDos = new Tarea("Estudiar para la presentación");
        Tarea tareaTres = new Tarea("Hacer la tarea de la infografía");

        Tarea.agregarTarea(tareaUno);
        Tarea.agregarTarea(tareaDos);
        tareaUno.marcarCompletada();
        Tarea.mostrarTareas();
        Tarea.agregarTarea(tareaTres);
        Tarea.eliminarTarea(tareaUno);
        Tarea.mostrarTareas();
    }
}
