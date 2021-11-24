## TP FINAL COMISIÓN 1
## DESARROLLO WEB FULL STACK CON JAVA – POLO TIC MISIONES
ESTUDIANTE: BORAGINI, TRINIDAD		DOCENTE: ING. DE PAULA, LUISINA
AGOSTO 2021

### DOCUMENTO DE SUPUESTOS

Teniendo como base los requerimientos enunciados en la consigna del presente trabajo final, se consideraron los siguientes supuestos:
•	Un usuario está asociado unívocamente a un empleado. No existe empleado sin usuario y usuario sin empleado.
•	Además de los correspondientes id de cada clase, no pueden existir duplicados:
    o	En huéspedes: número de Dni
    o	En empleados: número de Dni
    o	En usuarios: nombre de usuario
    o	En habitaciones: nombre de habitación
•	Se considera que la habitación múltiple tendrá como máximo 6 personas
•	Las restricciones de validación en los campos de cada formulario se realizan teniendo en cuenta los estándares de Argentina:
    o	Número de Dni tiene siete u ocho dígitos numéricos
    o	Número de teléfono tiene diez dígitos numéricos (no se incluye el prefijo internacional)
•	No se permite modificar en nombre de usuario en la edición de empleados (sí puede modificarse la contraseña)
•	El monto total de una reserva es un campo no modificable por el empleado, éste sólo puede leerlo.

Observación:
Se brinda la opción de crear usuario/empleado al ingresar al sistema por primera vez para fines de acceso de la docente. Se entiende que esto no es ideal en un sistema real porque cualquier persona puede crear un usuario/empleado con datos falsos y acceder al Sistema de gestión.
