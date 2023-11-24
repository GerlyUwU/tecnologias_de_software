// Protocolo base: la interfaz común para todos los componentes del sistema de archivos
protocol ComponenteSistemaArchivos {
    func imprimirNombre()
}

// Implementación de la interfaz para archivos individuales
class Archivo: ComponenteSistemaArchivos {
    private var nombre: String

    init(nombre: String) {
        self.nombre = nombre
    

    func imprimirNombre() {
        print("Archivo: \(nombre)")
    }
}

// Implementación de la interfaz para carpetas que pueden contener archivos o subcarpetas
class Carpeta: ComponenteSistemaArchivos {
    private var nombre: String
    private var componentes: [ComponenteSistemaArchivos]

    init(nombre: String) {
        self.nombre = nombre
        self.componentes = [ComponenteSistemaArchivos]()
    }

    func agregarComponente(componente: ComponenteSistemaArchivos) {
        componentes.append(componente)
    }

    func imprimirNombre() {
        print("Carpeta: \(nombre)")
        for componente in componentes {
            componente.imprimirNombre()
        }
    }
}

// Ejemplo de uso del patrón Composite
let archivo1 = Archivo(nombre: "Archivo1.txt")
let archivo2 = Archivo(nombre: "Archivo2.jpg")
let archivo3 = Archivo(nombre: "Archivo3.doc")

let carpetaPrincipal = Carpeta(nombre: "Principal")
carpetaPrincipal.agregarComponente(componente: archivo1)
carpetaPrincipal.agregarComponente(componente: archivo2)

let subcarpeta = Carpeta(nombre: "Subcarpeta")
subcarpeta.agregarComponente(componente: archivo3)

carpetaPrincipal.agregarComponente(componente: subcarpeta)

// Imprimir la estructura
carpetaPrincipal.imprimirNombre()