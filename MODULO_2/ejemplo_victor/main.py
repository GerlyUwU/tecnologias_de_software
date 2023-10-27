#ABC se utiliza para definir clases abstractas y abstractmethod se usa para definir métodos abstractos que deben ser implementados en clases derivadas.
from abc import ABC, abstractmethod

# Definición de la interfaz de la fábrica abstracta
class GUIFactory(ABC):
    @abstractmethod
    def createButton(self):
        pass

    @abstractmethod
    def createCheckbox(self):
        pass

# Fábrica concreta para Windows
#WinFactory es una fábrica concreta para Windows que implementa la interfaz GUIFactory
class WinFactory(GUIFactory):
    def createButton(self):
        return WinButton()

    def createCheckbox(self):
        return WinCheckbox()

# Fábrica concreta para macOS
#MacFactory es similar a WinFactory, pero está diseñada para macOS
class MacFactory(GUIFactory):
    def createButton(self):
        return MacButton()

    def createCheckbox(self):
        return MacCheckbox()

# Definición de la interfaz base para el producto "Button"
# Button es una interfaz abstracta que hereda de ABC. Declara un método abstracto paint que debe implementarse en las clases concretas.
class Button(ABC):
    @abstractmethod
    def paint(self):
        pass

#WinButton y MacButton son clases concretas que implementan la interfaz Button.
#Cada una de ellas tiene su propia implementación del método paint.
class WinButton(Button):
    def paint(self):
        print("Representa un botón en estilo Windows.")

class MacButton(Button):
    def paint(self):
        print("Representa un botón en estilo macOS.")

# Definición de la interfaz base para el producto "Checkbox"
# Checkbox es una interfaz abstracta similar a Button.
class Checkbox(ABC):
    @abstractmethod
    def paint(self):
        pass

# Se siguen patrones similares para las clases WinCheckbox y MacCheckbox.
class WinCheckbox(Checkbox):
    def paint(self):
        print("Representa una casilla en estilo Windows.")

class MacCheckbox(Checkbox):
    def paint(self):
        print("Representa una casilla en estilo macOS.")

# Clase de la aplicación
#Application es una clase que utiliza la fábrica y los productos.
# Tiene un constructor que recibe una fábrica, un método createUI que crea un botón utilizando la fábrica y un método paint que llama al método paint del botón.
class Application:
  #Este es el constructor de la clase Application
  def _init_(self, factory):
      self.factory = factory
      self.button = None
      self.checkbox = None

  #: Este método se encarga de crear la interfaz de usuario (UI)
  def createUI(self):
      self.button = self.factory.createButton()
      self.checkbox = self.factory.createCheckbox()

  #  Este método se encarga de "pintar" la interfaz de usuario creada previamente.
  def paint(self):
      self.button.paint()
      self.checkbox.paint()

if _name_ == "_main_":
  # Creación de objetos para Windows
  win_factory = WinFactory()
  win_app = Application(win_factory)
  win_app.createUI()

  # Creación de objetos para macOS
  mac_factory = MacFactory()
  mac_app = Application(mac_factory)
  mac_app.createUI()

  # Impresión de botones y checkboxes para Windows
  print("Windows Application:")
  win_app.paint()

  # Impresión de botones y checkboxes para macOS
  print("\nmacOS Application:")
  mac_app.paint()


#ABC se utiliza para definir clases abstractas y abstractmethod se usa para definir métodos abstractos que deben ser implementados en clases derivadas.
from abc import ABC, abstractmethod

# Definición de la interfaz de la fábrica abstracta
class GUIFactory(ABC):
    @abstractmethod
    def createButton(self):
        pass

    @abstractmethod
    def createCheckbox(self):
        pass

# Fábrica concreta para Windows
#WinFactory es una fábrica concreta para Windows que implementa la interfaz GUIFactory
class WinFactory(GUIFactory):
    def createButton(self):
        return WinButton()

    def createCheckbox(self):
        return WinCheckbox()

# Fábrica concreta para macOS
#MacFactory es similar a WinFactory, pero está diseñada para macOS
class MacFactory(GUIFactory):
    def createButton(self):
        return MacButton()

    def createCheckbox(self):
        return MacCheckbox()

# Definición de la interfaz base para el producto "Button"
# Button es una interfaz abstracta que hereda de ABC. Declara un método abstracto paint que debe implementarse en las clases concretas.
class Button(ABC):
    @abstractmethod
    def paint(self):
        pass

#WinButton y MacButton son clases concretas que implementan la interfaz Button.
#Cada una de ellas tiene su propia implementación del método paint.
class WinButton(Button):
    def paint(self):
        print("Representa un botón en estilo Windows.")

class MacButton(Button):
    def paint(self):
        print("Representa un botón en estilo macOS.")

# Definición de la interfaz base para el producto "Checkbox"
# Checkbox es una interfaz abstracta similar a Button.
class Checkbox(ABC):
    @abstractmethod
    def paint(self):
        pass

# Se siguen patrones similares para las clases WinCheckbox y MacCheckbox.
class WinCheckbox(Checkbox):
    def paint(self):
        print("Representa una casilla en estilo Windows.")

class MacCheckbox(Checkbox):
    def paint(self):
        print("Representa una casilla en estilo macOS.")

# Clase de la aplicación
#Application es una clase que utiliza la fábrica y los productos.
# Tiene un constructor que recibe una fábrica, un método createUI que crea un botón utilizando la fábrica y un método paint que llama al método paint del botón.
class Application:
  #Este es el constructor de la clase Application
  def _init_(self, factory):
      self.factory = factory
      self.button = None
      self.checkbox = None

  #: Este método se encarga de crear la interfaz de usuario (UI)
  def createUI(self):
      self.button = self.factory.createButton()
      self.checkbox = self.factory.createCheckbox()

  #  Este método se encarga de "pintar" la interfaz de usuario creada previamente.
  def paint(self):
      self.button.paint()
      self.checkbox.paint()

if _name_ == "_main_":
  # Creación de objetos para Windows
  win_factory = WinFactory()
  win_app = Application(win_factory)
  win_app.createUI()

  # Creación de objetos para macOS
  mac_factory = MacFactory()
  mac_app = Application(mac_factory)
  mac_app.createUI()

  # Impresión de botones y checkboxes para Windows
  print("Windows Application:")
  win_app.paint()

  # Impresión de botones y checkboxes para macOS
  print("\nmacOS Application:")
