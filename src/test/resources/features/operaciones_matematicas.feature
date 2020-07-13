
Feature: yo como usuario del servicio
    Necesito comprobar el correcto funcionamiento de la calculadora
    Para realizar operaciones matematicas en ella

    Scenario: Suma exitosa
        Given que Elvis usa la calculadora
        When suma los numeros 2 y 8
        Then podra ver el resultado igual a 10

    Scenario: Resta exitosa
        Given que Elvis usa la calculadora
        When resta los numeros 9 y 8
        Then podra ver el resultado igual a 1

    Scenario: Multiplicacion exitosa
        Given que Elvis usa la calculadora
        When multiplica los numeros 2 y 3
        Then podra ver el resultado igual a 6

    Scenario: Division exitosa
        Given que Elvis usa la calculadora
        When Divide los numeros 2 y 2
        Then podra ver el resultado igual a 1


