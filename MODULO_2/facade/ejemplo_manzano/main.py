class Motor:
    def encender(self):
        print("motor encendido")

    def apagar(self):
        print("motor apagado")

class Luces:
    def encender_luces(self):
        print("luces encendidas")

    def apagar_luces(self):
        print("luces apagadas")

class Radio:
    def encender_radio(self):
        print("radio encendida")

    def apagar_radio(self):
        print("radio apagada")

class CocheFachada:
    def _init_(self):
        self.motor = Motor()
        self.luces = Luces()
        self.radio = Radio()

    def encenderCoche(self):
        self.motor.encender()
        self.luces.encender_luces()
        self.radio.encender_radio()
        print("coche encendido")

    def apagarCoche(self):
        self.motor.apagar()
        self.luces.apagar_luces()
        self.radio.apagar_radio()
        print("coche apagado")

coche = CocheFachada()
coche.encenderCoche()
coche.apagarCoche()