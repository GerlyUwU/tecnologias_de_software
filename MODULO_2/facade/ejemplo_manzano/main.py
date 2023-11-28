# Subsistemas

class Motor:
    def encender(self):
        print("Motor encendido")

    def apagar(self):
        print("Motor apagado")


class Luces:
    def encender_luces(self):
        print("Luces encendidas")

    def apagar_luces(self):
        print("Luces apagadas")


class Radio:
    def encender_radio(self):
        print("Radio encendida")

    def apagar_radio(self):
        print("Radio apagada")


# Fachada

class CocheFachada:
    def _init_(self):
        self.motor = Motor()
        self.luces = Luces()
        self.radio = Radio()

    def encender_coche(self):
        self.motor.encender()
        self.luces.encender_luces()
        self.radio.encender_radio()
        print("Coche encendido")

    def apagar_coche(self):
        self.motor.apagar()
        self.luces.apagar_luces()
        self.radio.apagar_radio()
        print("Coche apagado")


# Uso de la fachada

coche = CocheFachada()
coche.encender_coche()
coche.apagar_coche()