Ejercicio-1

let frutas = ["manzana", "banana", "pera", "naranja", "uva"];
// Eliminar el último elemento
frutas.pop();
console.log("Después de eliminar el último elemento:", frutas);
// Añadir "kiwi" al principio del array
frutas.unshift("kiwi");
console.log("Después de añadir 'kiwi' al principio:", frutas);
// Combinar con otro array
let nuevasFrutas = ["fresa", "mango"];
let combinado = frutas.concat(nuevasFrutas);
console.log("Array combinado:", combinado);

Ejercicio-2

let numeros = [5, 12, 8, 130, 44];
// Filtrar números mayores a 10
let mayoresA10 = numeros.filter(num => num > 10);
console.log("Números mayores a 10:", mayoresA10);
// Mapear al cuadrado
let cuadrados = numeros.map(num => num * num);
console.log("Números al cuadrado:", cuadrados);

Ejercicio-3

let array = [1, 2, 3, 4, 5];
// Suma con reduce
let suma = array.reduce((acum, val) => acum + val, 0);
console.log("Suma total:", suma);
// Orden descendente
let descendente = [...array].sort((a, b) => b - a);
console.log("Orden descendente:", descendente);
// Invertir el array
let invertido = [...array].reverse();
console.log("Array invertido:", invertido);

