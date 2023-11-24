# Interfaz del Sujeto
class Television:
    def cambiar_canal(self):
        pass

    def ajustar_volumen(self):
        pass

    def apagar(self):
        pass

# Sujeto Real
class TelevisionReal(Television):
    def cambiar_canal(self):
        print("Cambiando de canal.")

    def ajustar_volumen(self):
        print("Ajustando el volumen.")

    def apagar(self):
        print("Apagando la televisión.")

# Proxy
class ControlRemotoProxy(Television):
    def __init__(self):
        self.television_real = None

    def cambiar_canal(self):
        if self.television_real is None:
            self.television_real = TelevisionReal()
        print("Verificando acceso al cambio de canal.")
        self.television_real.cambiar_canal()

    def ajustar_volumen(self):
        if self.television_real is None:
            self.television_real = TelevisionReal()
        print("Verificando acceso al ajuste de volumen.")
        self.television_real.ajustar_volumen()

    def apagar(self):
        if self.television_real is None:
            self.television_real = TelevisionReal()
        print("Verificando acceso para apagar la televisión.")
        self.television_real.apagar()

# Cliente
def main():
    control_remoto = ControlRemotoProxy()

    # Utilizando el proxy para cambiar de canal
    control_remoto.cambiar_canal()

    # Utilizando el proxy para ajustar el volumen
    control_remoto.ajustar_volumen()

    # Utilizando el proxy para apagar la televisión
    control_remoto.apagar()

if __name__ == "__main__":
    main()
