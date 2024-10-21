# Conversor de Monedas

Un simple conversor de monedas desarrollado en Java que utiliza una API externa para convertir entre distintas monedas (USD, ARS, BRL, COP, PEN). El usuario puede seleccionar entre varias opciones de conversión.

![Java](https://img.shields.io/badge/Java-11-blue)
![GitHub license](https://img.shields.io/github/license/creativomultimedia/ConversorMonedas)

## Tabla de Contenidos
1. [Descripción](#descripción)
2. [Instalación](#instalación)
3. [Uso](#uso)
4. [Tecnologías](#tecnologías)
5. [Contribuciones](#contribuciones)
6. [Licencia](#licencia)

## Descripción

Este proyecto es un conversor de monedas que permite convertir entre USD y otras monedas (Peso Argentino, Real Brasileño, Peso Colombiano y Soles Peruanos). La aplicación está desarrollada en Java, utilizando una API de tipo REST para obtener las tasas de cambio en tiempo real.

## Capturas de Pantalla
![Captura de Pantalla](https://github.com/creativomultimedia/ConversorMonedas/blob/main/Conversor.jpg)

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/creativomultimedia/ConversorMonedas.git

cd ConversorMonedas

mvn clean install

mvn exec:java

## Uso

1. Al ejecutar la aplicación, el usuario verá un menú con las siguientes opciones:
    - Convertir Dólares a Pesos Argentinos.
    - Convertir Pesos Argentinos a Dólares.
    - Convertir Dólares a Reales Brasileños.
    - Convertir Reales Brasileños a Dólares.
    - Y otras más...

2. El usuario selecciona la opción deseada e ingresa la cantidad que desea convertir.
3. La aplicación muestra el resultado utilizando la tasa de cambio actualizada.

Ejemplo:

    Seleccione una opción: USD a ARS
    ARS a USD Opción:
    1 
    Ingrese la cantidad en USD:
    100 
    Resultado: 
    100 USD = 35,000 ARS

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
