mediaMuestra <- 19.4
mediaH <- 20 
desvi <- 2
n <- 50 

z <- (mediaMuestra - mediaH)/(desvi/(n^0.5))
z
p <- 0.0170
a <- 0.05
za <- -1.64
print("metodo de la p")
if (p<=a) {
   print("prueba de hipotesis nula rechazada")
}else{
    print("prueba de hipotesis  nula aceptada")
}
print("metodo del valor  critica")
if (p<=za) {
   print("prueba de hipotesis nula rechazada")
}else{
    print("prueba de hipotesis  nula aceptada")
}

#cuando ya tenemos z, encontramos el valor en la tabla de
#probabilidad normal estandar, ese sera el nuevo valor 
#de p 