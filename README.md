# ejercicio_sofka_serenity - Prueba Técnica QA Automation

## Autor
**Iván Antonio Fajardo Castañeda**  
QA Automation Engineer

---

# 1. Contexto del Proyecto
Este repositorio contiene la solución a la **Prueba Técnica - V1 serenity BDD**.  
El objetivo es garantizar la ejecución de un flujo E2E añadiendo 2 productos al carrito de compras y posteriormente finalizando la compra.

---

# 2. Objetivos de Pruebas

## Objetivo General
Validar la funcionalidad y experiencia de usuario del flujo de compra en la página de DemoBlaze mediante pruebas manuales y automatizadas.

## Objetivos Específicos
- Detectar defectos funcionales y de interfaz.
- Automatizar escenario de regresión usando serenity BDD.

---

# 3. Descripción de la automatización

## Repositorio remoto 

- Se utiliza intelliJ con el framework serenity BDD + cucumber y java como lenguaje, en el archivo serenity.properties se encuentra la configuración básica del proyecto donde se deja el modo de ejecución con headless en false para visualizar el proceso de ejecución del driver, screenshots y algunas preferencias del driver.
- Se utiliza el patron de diseño screenplay, lo cual se puede observar en la estructura de paquetes (interactions, models, questions, tasks, userinterfaces y utils).
- Tener en cuenta que se hizo la automatización apuntando a una página de pruebas, el flujo E2E consiste en hacer una prueba básica de un flujo de compra, este flujo es solamente una entrega inicial que se puede mejorar de acuerdo a la necesidad y objetivos de la prueba.

## Ejecutar pruebas

Dentro del proyecto, se crea el runner "PurchaseOnSiteRunner.java" el cual puede correr el escenario definido para la automatización, de igual manera se puede hacer la ejecución desde el feature de acuerdo a la configuración del IDE, tener en cuenta que el proyecto esta en modo headless = false por lo cual se pued ever el paso a paso que se realiza en el navegador.

## Generar reporte HTML

Una vez se ejecuta el runner, en la consola aparece automáticamente el enlace con el reporte de serenity report, también se puede obtener ingresando a la carpeta del proyecto target/index.html 

ejemplo del enlace: file:///C:/Users/User/Documents/Automation/Excersice1/target/index.html

# Contacto

 Email: [iafajardoc@gmail.com]
 GitHub: [https://github.com/IvanFajardo15]

---
