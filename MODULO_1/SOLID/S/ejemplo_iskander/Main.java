public class Main {
    public static void main(String[] args) {
        ListaTareas listaTareas = new ListaTareas();
        Tarea tareaUno = new Tarea("Hacer memes del profe Pino");
        Tarea tareaDos = new Tarea("Estudiar para la presentación");
        Tarea tareaTres = new Tarea("Hacer la tarea de la infografía");
        listaTareas.agregarTarea(tareaUno);
        listaTareas.agregarTarea(tareaDos);
        tareaUno.marcarCompletada();
        listaTareas.mostrarTareas();
        listaTareas.agregarTarea(tareaTres);
        listaTareas.eliminarTarea(tareaUno);
        listaTareas.mostrarTareas();
    }
}
