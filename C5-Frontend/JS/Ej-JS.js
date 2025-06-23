Ejercicio-1

let str1 = "JavaScript es increíble";
console.log("Longitud:", str1.length);  23
console.log("Slice:", str1.slice(15));  "increíble"
console.log("Substr:", str1.substr(0, 10));  "JavaScript"

Ejercicio-2

let str2 = "  Bienvenido a la programación  ";
let trimmedStr2 = str2.trim();
let upperStr2 = trimmedStr2.toUpperCase();
let replacedStr2 = upperStr2.replace("PROGRAMACIÓN", "JAVASCRIPT");
let finalStr2 = replacedStr2.concat(" en 2024!");
console.log(finalStr2);  "BIENVENIDO A LA JAVASCRIPT en 2024!"

Ejercicio-3

let str3 = "Aprender JavaScript es divertido";
console.log("CharAt:", str3.charAt(8));  "r"
console.log("CharCodeAt:", str3.charCodeAt(8)); 114
let splitStr3 = str3.split(" ");
console.log("Split:", splitStr3);  ["Aprender", "JavaScript", "es", "divertido"]
let paddedEndStr3 = str3.padEnd(40, "!");
console.log("PadEnd:", paddedEndStr3); "Aprender JavaScript es divertido!!!!!!"
