class Alumno with clonador {
  String _nombre;
  int _edad;
  String _curso;
  double _calificacion;

  Alumno(this._edad, this._nombre, this._curso, this._calificacion);

  //getters
  String get nombre => _nombre;
  int get edad => _edad;
  String get curso => _curso;
  double get calificacion => _calificacion;

  //setters
  set nombre(String nombre) {
    this.nombre = _nombre;
  }

  set edad(int edad) {
    this.edad = _edad;
  }

  set curso(String curso) {
    this.curso = _curso;
  }

  set calificacion(double calificacion) {
    this.calificacion = _calificacion;
  }

  //metodo mostrar:

  @override
  String toString() {
    return 'alumno $_nombre, $_edad años, curso: $_curso, calificacion: $_calificacion';
  }

  @override
  Alumno clone() {
    return Alumno(_edad, _nombre, _curso, _calificacion);
  }
}

mixin clonador<T> {
  T clone();
}

void main() {
//ejemplo de alumno
  var alumnoOriginal = Alumno(22, "Diegoooo", "BD", 10);
  var alumnoClonado = alumnoOriginal.clone();
  var otro = alumnoOriginal.clone();
  otro._nombre = "julio";
  otro._curso = "mates discretas";
  otro._calificacion = 0;
  alumnoClonado._nombre = "nava";
  print(alumnoOriginal.toString());
  print(alumnoClonado.toString());
  print(otro.toString());
}
