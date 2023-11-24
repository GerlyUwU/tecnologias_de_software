<?php

interface Sujeto

{
    public function solicitud(): void; 
}

class SujetoReal implements Sujeto
{
    public function solicitud(): void 
    {
         echo "sujeto real: manejando la solicitud....\n";
    }
}

class Proxy implements Sujeto
{
    private $SujetoReal; 
    public function solicitud(): void 
    {
        if (this->sujetoReal == null){
            $this->sujetoReal = new SujetoReal();
            echo "el proxy sujetoREal ha sido creado.\n";
        }
        this->sujetoReal->solicitud();
    }
}
$proxy = new Proxy(); 
$proxy->solicitud();
$proxy->solicitud();
