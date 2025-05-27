Feature: Suma Calculadora
  Para poder acceder a la plataforma de Saucedemo
  Como usuario registrado
  Quiero poder ingresar mis credenciales y verificar el acceso

   Scenario: Suma de dos números enteros
    Given Navego a la página de la Calculadora Básica
    When Ingreso 1 en el campo Build
    And Ingreso 2 en el campo Number 1
    And Ingreso 3 en el campo Number 2
    And Selecciono la operación Add
    And Hago clic en el botón Calculate


   Scenario: Resta de dos números enteros
   Given Navego a la página de la Calculadora Básica
   Then Ingreso 1 en el campo Build
   And Ingreso 10 en el campo Number 1
   And Ingreso 4 en el campo Number 2
   And Selecciono la operación Subtract
   And Hago clic en el botón Calculate

   Scenario: suma de decimales números.
   Given Navego a la página de la Calculadora Básica
   Then Ingreso 1 en el campo Build
   And Ingreso 1.5 en el campo Number 1
   And Ingreso 2.5 en el campo Number 2
   And Selecciono la operación Add
   And Hago clic en el botón Calculate

   Scenario: Concatenar y limpiar los campos.
   Given Navego a la página de la Calculadora Básica
   Then Ingreso 1 en el campo Build
   And Ingreso hola en el campo Number 1
   And Ingreso mundo en el campo Number 2
   And Selecciono la operación Concatenate
   And Hago clic en el botón Calculate
   And limpio los campos elementSpace1
   And limpio los campos elementSpace2
   And limpio los campos Answer

