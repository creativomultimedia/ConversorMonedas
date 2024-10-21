# Conversor de Monedas

Un simple conversor de monedas desarrollado en Java que utiliza una API externa para convertir entre distintas monedas (USD, ARS, BRL, COP, PEN). El usuario puede seleccionar entre varias opciones de conversión.

![Java](https://img.shields.io/badge/Java-11-blue)


## Tabla de Contenidos
1. [Descripción](#descripción)
2. [Instalación](#instalación)
3. [Uso](#uso)
4. [Tecnologías](#tecnologías)
5. [Contribuciones](#contribuciones)
6. [Licencia](#licencia)

## Descripción

Este proyecto es un conversor de monedas que permite convertir entre USD y otras monedas (Peso Argentino, Real Brasileño, Peso Colombiano y Soles Peruanos). La aplicación está desarrollada en Java, utilizando una API REST para obtener las tasas de cambio en tiempo real. Además, el usuario puede elegir el país de origen y el país de destino para una mejor experiencia.

## Capturas de Pantalla
![Captura de Pantalla](https://github.com/creativomultimedia/ConversorMonedas/blob/main/Conversor-Actualizado.jpg)

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/creativomultimedia/ConversorMonedas.git

cd ConversorMonedas

mvn clean install

mvn exec:java

## Uso

1. Al ejecutar la aplicación, el usuario verá un menú para seleccionar el país de origen y el país de destino.

2. Luego, el usuario ingresa la cantidad que desea convertir.
3. La aplicación muestra el resultado utilizando la tasa de cambio actualizada.

Ejemplo:

        ¡Bienvenido al Conversor de Monedas!
      
         Seleccione el país de origen:
         1. Argentina
         2. Brasil
         3. Colombia
         4. Perú
         5. Estados Unidos
            Elija el número del país de origen: 5
      
         Seleccione el país de destino:
         1. Argentina
         2. Brasil
         3. Colombia
         4. Perú
         5. Estados Unidos
            Elija el número del país de destino: 1
            Ingrese la cantidad: 100
            100 USD = 35,000 ARS


## Características Adicionales
1. Historial de Conversiones: Mantiene un registro de las conversiones realizadas, mostrando la cantidad, las monedas y la fecha y hora de cada conversión.
2. Soporte para Más Monedas: Ampliar fácilmente la lista de monedas disponibles.
3. Registros con Marca de Tiempo: Registra las conversiones con la fecha y hora, brindando un contexto adicional sobre cada operación.



## Tecnologías

- Java 11
- Maven
- API de tasas de cambio (por ejemplo, Exchangerate API)
- IntelliJ IDEA

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto o reportar errores, por favor sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature-nueva-funcionalidad`).
3. Realiza tus cambios y haz un commit (`git commit -m 'Añadir nueva funcionalidad'`).
4. Haz push de tu rama (`git push origin feature-nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la licencia MIT - mira el archivo [LICENSE](LICENSE) para más detalles.
