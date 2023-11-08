# Definición de la clase base "Saludo"
class Saludo:
    def saludar(self):
        pass

# Definición de la clase derivada "SaludoEnEspanol"
class SaludoEnEspanol(Saludo):
    def saludar(self):
        return "¡Hola!"

# Definición de la clase derivada "SaludoEnIngles"
class SaludoEnIngles(Saludo):
    def saludar(self):
        return "Hello!"

class SaludoEnJapones(Saludo):
    def saludar(self):
        return "konichiwa UWU"

# Factory para crear saludos
class SaludoFactory:
    def create_saludo(self, idioma):
        if idioma == "espanol":
            return SaludoEnEspanol()
        elif idioma == "ingles":
            return SaludoEnIngles()
        elif idioma =="japones":
            return SaludoEnJapones()
        else:
            return None


# Uso de la fábrica
factory = SaludoFactory()

# Crear un saludo en español
saludo_espanol = factory.create_saludo("espanol")

# Crear un saludo en inglés
saludo_ingles = factory.create_saludo("ingles")

#crea un saludo en japones 
saludo_japones = factory.create_saludo("japones")

# Imprimir los saludos
print(saludo_espanol.saludar())  # Imprimirá "¡Hola!"
print(saludo_ingles.saludar())  # Imprimirá "Hello!"
print(saludo_japones.saludar())