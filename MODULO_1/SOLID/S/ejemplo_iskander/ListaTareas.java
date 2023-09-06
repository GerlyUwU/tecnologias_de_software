  import java.util.ArrayList;
import java.util.List;

class ListaTareas {
    private static List<Tarea> arrayTareas = new ArrayList<>();

    public void agregarTarea(Tarea nuevaTarea) {
        arrayTareas.add(nuevaTarea);
    }

    public void mostrarTareas() {
        System.out.println("Lista de Tareas:");
        for (Tarea nuevaTarea : arrayTareas) {
            System.out.println(nuevaTarea.estaCompletada() ? "[X] " + nuevaTarea.getDescripcion() : "[ ] " + nuevaTarea.getDescripcion());
        }
    }

    public void eliminarTarea(Tarea nuevaTarea) {
        arrayTareas.remove(nuevaTarea);
    }
}
