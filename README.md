# Automatización móvil

Se realizar la automatización de servicios tipo móvil se desea validar y verificar el correcto funcionamiento de las funciones:

- Sumas
- Restar
- Multiplicar, de la calculadora.

En el sistema operativo Android versión 9

Comenzando ✒️

Con este proyecto se desea realizar una automatización móvil basándonos en los principios SOLID y FIRST, para un mejor entendimiento en los reportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Gradle.

Pre-requisitos 📋

Para la ejecución de este proyecto desdemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:

1. JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files (x86)\Java\jdk1.8.0_251
2. GRADLE_HOME: Descarga el Gradle y se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en C:\Program Files\gradle-5.4.1-bin\gradle-5.4.1.
3. ANDROID_HOME: Descarga el SDK de Android y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso se encuentra en C:\Users\elmie\AppData\Local\Android\Sdk
4. Tener un IDEA instalado para la observación o modificación del código; Adicionalmente deben tener en Android Studio.
5. Debe instalar el Appium
6. SONA: Descargar el sonar Scanner y el SONAR.

NOTA: El SDK de Android lo puede obtener en la aplicación Andoid Studio, siguiente los siguientes pasos.

Abrir Android Studio- Settings – System Settings – Android SDK. Después de estar en esta ruta se procede a descargar el SDK
      
Ejecutando las pruebas ⚙️
 
Para la ejecución del proyecto debe tener presente que las variables de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas que se encuentra en el archivo build.gradle.

La prueba se puede ejecutar por medio de la clase OperacionesRunners, la cual está ubicada en  src\test\java\co\prueba\web\runner.

Para observar las evidencias de las pruebas debemos ejecutar el script y ingresar a la ruta target\site\serenity , allí buscamos el primer archivo HTML que encontramos en la carpeta.

Configuración Appium 🔧️

Los Pre-requisitos que debemos tener son los siguientes:

- El celular debe tener activado la opción (PROGRAMADOR); Ingresar a la configuración del celular.
- Tener la opción (Depuración por USB y Permanecer activado), del celular, la segunda opción se utiliza para que el celular no se bloquee.
-Tener conectado el pc con el celular, por medio de un cable USB.
-Tener Appium instalado.
-Tener Andoid Studio Instalado y configurar las variables de entorno.


Abrir Appium y conecta, con la siguiente información; IP: 127.0.0.1 y PORT: 4723, estos datos son por defecto.

Primero abre la APP en el celular que desea automatizar y NO cerrar la aplicación. (Para obtener los capabilities que necesitamos para la conexión). 
Los capabilities son los de los valores de configuración para la conexión con el dispositivo móvil.

En la parte superior de Appium tenemos un icono en forma de una LUPA, selecciona ahí. En Desired Capabilities comenzamos a ingresar la siguiente información.

Los capabilities se encuentran configurados en la clase Driver. 
platformName = Nombre del sistema operativo
platformVersion = Versión del sistema operativo
automationName = uiautomator2 ; Es po defecto
deviceName = ID del celular
appPackage = información de la aplicación
appActivity = información de la aplicación

Primero, ingresa a la carpeta donde tienes instalado Android studio (la misma ruta de la variable de entorno.

Ingresa el cmd en esa carpeta, luego escribes el comando adb devices y te muestra la información del dispositivo que se encuentra conectado. Ese es el valor de la variable deviceName

Con esa información ya se tiene lo básico para hacer la conexión al móvil, se ingresan los datos dependiendo en Appium.

Nota: Todos los datos son de tipo text; En Appiem se debe mostrar así.

{
  "platformName": "android",
  "platformVersion": "9",
  "automationName": "uiautomator2",
  "deviceName": "ZY2277N7ZN",
}

Después de tener esta información, ingresa por medio del botón Start Session; Se pueden observar los elementos de la app que se tenga abierta.
Ejecuta en consola el siguiente comando:
 
adb shell dumpsys window | find "mCurrentFocus"

Esto para obtener los capabilities appPackage y appActivity con los cuales completaremos la configuración de los capabilities de nuestra automatización y de la conexión con appium.

Ejemplo:

com.google.android.calculator/com.android.calculator2.Calculator

Debido a lo anterior, los datos de los capabilities son:

{
  "platformName": "android",
  "platformVersion": "9",
  "automationName": "uiautomator2",
  "deviceName": "ZY2277N7ZN",
  "appPackage": "com.google.android.calculator",
  "appActivity": "com.android.calculator2.Calculator"
}

Con la información anterior ya se muestre encontrar los elementos de la aplicación.

Analizar el codigo con Sonarqube ⌨️️

En la raiz del proyecto debemos de poner el sonar-project.properties, para poder realizar el analisis del codigo.

Los pasos a seguir son:
1. En el cmd de la carpeta del proyecto ejecutamos  el comando starSonar. 
2. Abrir el cmd y ejecutamos el comando StartSonar
3. Abrir en el navegador la URL http://localhost:9000/about
4. En la carpeta del proyecto se procede abrir el cmd y se ejecuta el comando  sonar -scanner , en otra ventana del mismo proyecto  ejecuto el cmd el comando sonar-scanner
5. Ingresar a la URL http://localhost:9000/about para analizar el resultado.