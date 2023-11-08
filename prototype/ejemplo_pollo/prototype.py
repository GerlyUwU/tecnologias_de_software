# Clase abstracta "AlbumMusica" con el método "clone".
class AlbumMusica:
    def clone(self):
        pass

# Clase concreta "AlbumMusicaConcreto" que hereda de "AlbumMusica".
class AlbumMusicaConcreto(AlbumMusica):
    def __init__(self, titulo, artista, año):
        self.titulo = titulo
        self.artista = artista
        self.año = año

    # Implementación del método "clone" que crea una copia del álbum de música concreto.
    def clone(self):
        return AlbumMusicaConcreto(self.titulo, self.artista, self.año)

    # Método para obtener información del álbum de música.
    def obtener_info(self):
        return f"Álbum: {self.titulo} - {self.artista} ({self.año})"

# Clase "ClienteAlbumMusica" que crea copias de álbumes de música.
class ClienteAlbumMusica:
    def crear_album(self, prototipo):
        # Crea una copia del prototipo del álbum de música y la devuelve.
        copia_album = prototipo.clone()
        return copia_album

# Crear un prototipo de álbum de música concreto
prototipo_album = AlbumMusicaConcreto("gradution", "Kanye west", 2008)

# Cliente crea una copia del prototipo de álbum de música.
cliente_album = ClienteAlbumMusica()
copia_album = cliente_album.crear_album(prototipo_album)

# Modificar la copia del álbum de música cambiando el año de lanzamiento.
copia_album.titulo = "My Beautiful Dark Twisted Fantasy"
copia_album.año = 2010

# Comprobar la información del prototipo y su copia.
print("Prototipo de Álbum de Música:", prototipo_album.obtener_info())
print("Copia del Álbum de Música:", copia_album.obtener_info())
