egresado_marketing <- c(34.2,45.0,28.4,37.7,35.8,30.6,35.2,34.2,42.4)

egresado_contaduria <-c(33.5,57.1,49.7,40.2,44.2,45.2,47.8,38,53.9,41.1,41.7,40.8,55.5,43.5,49.1,49.9)

tabla_contaduria <- table(egresado_contaduria)
tabla_marketing <- table(egresado_marketing)

moda_contaduria <- as.numeric(names(tabla_contaduria[which.max(tabla_contaduria)]))
moda_contaduria
  moda_marketing <-as.numeric(names(tabla_marketing[which.max(tabla_marketing)]))
  moda_marketing
  
media_marketing <- sum(egresado_marketing)/length(egresado_marketing)
media_contaduria <- sum(egresado_contaduria)/length(egresado_contaduria)

rango_marketing <- max(egresado_marketing)-min(egresado_marketing)
rango_contaduria <- max(egresado_contaduria)-min(egresado_contaduria)

varianza_marketing <- sum((egresado_marketing-media_marketing)^2)/(length(egresado_marketing)-1)
varianza_contaduria <- sum((egresado_contaduria-media_contaduria)^2)/(length(egresado_contaduria)-1)


desviacion_marketing <- varianza_marketing ^0.5
desviacion_contaduria <- varianza_contaduria ^0.5


correlacion_marketing <- (desviacion_marketing/media_marketing)*100
  correlacion_contaduria<-(desviacion_contaduria/media_contaduria)*100
  correlacion_contaduria
  correlacion_marketing