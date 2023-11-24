<?php

interface Subject{
  public function request(): void;
}

class RealSubject implements Subject{
  public function request(): void{
    echo "RealSubject: Solicitud de manejo.\n";
  }
}

class Proxy implements Subject {
  private $realSubject;

  public function __construct(RealSubject $realSubject){
    $this -> realSubject = $realSubject;
  }

  public function request(): void{
    if($this->checkAccess()){
      $this->realSubject->request();
      $this->logAccess();
      
      
    }
  }

  public function checkAccess(): bool{
    echo "PROXY: Comprobar el acceso antes de activar una solicitud real.\n";
    return true;
  }

  private function logAccess(): void{
    echo "PROXY: Registra la hora de la solicitud";
  }  
}

function clientCode(Subject $subject){
  $subject->request();
}

echo "Client: Ejecutando el codigo del cliente con un asunto real:\n";
$realSubject = new Realsubject();
clientCode($realSubject);
echo "\n";

echo"Client: Ejecutar el mismo codigo de cliente con un proxy:\n";
$proxy = new Proxy($realSubject);
clientCode($proxy);