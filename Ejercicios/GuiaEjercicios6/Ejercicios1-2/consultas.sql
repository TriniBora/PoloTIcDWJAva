/*Consultas:*/
/*a. Obtener la lista completa de todos los empleados.*/

SELECT * FROM `empleados`

/*b. Obtener la lista completa de todos los departamentos.*/

SELECT * FROM `empleados`

/*c. Obtener los empleados que tengan el cargo “secretario”.*/

SELECT * FROM `empleados` WHERE `cargo` LIKE 'Secretario'

/*d. Obtener una lista de los nombres y sueldos de cada uno de los empleados.*/

SELECT nombre, apellido, sueldo_neto FROM `empleados`

/*e. Obtener los datos de los empleados que tengan el cargo de “vendedores” y que su sueldo sea mayor a $25.000.*/

SELECT * FROM `empleados` WHERE cargo LIKE 'Vendedor' AND sueldo_neto > 25000

/*f. Obtener una lista con el nombre, cargo y salario de cada uno de los empleados. Ordenar esta lista por salario. */

SELECT nombre, apellido, cargo, sueldo_neto FROM `empleados` ORDER BY sueldo_neto