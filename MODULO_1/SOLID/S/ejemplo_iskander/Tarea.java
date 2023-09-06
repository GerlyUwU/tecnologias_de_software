import java.util.ArrayList;
import java.util.List;

class Tarea {
    private String tareaDescripcion;
    private boolean tareaCompletada;
    private static List<Tarea> arrayTareas = new ArrayList<>();

    public Tarea(String tareaDescripcion) {
        this.tareaDescripcion = tareaDescripcion;
        this.tareaCompletada = false;
    }

    public void marcarCompletada() {
        tareaCompletada = true;
    }

    public String getDescripcion() {
        return tareaDescripcion;
    }

    public boolean estaCompletada() {
        return tareaCompletada;
    }

    public static void mostrarTareas() {
        System.out.println("Lista de Tareas:");
        for (Tarea nuevaTarea : arrayTareas) {
            System.out.println(nuevaTarea.estaCompletada() ? "[X] " + nuevaTarea.getDescripcion() : "[ ] " + nuevaTarea.getDescripcion());
        }
    }

    public static void agregarTarea(Tarea nuevaTarea) {
        arrayTareas.add(nuevaTarea);
    }

    public static void eliminarTarea(Tarea nuevaTarea) {
        arrayTareas.remove(nuevaTarea);
    }
}