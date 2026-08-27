/*volumen de una esfera resultados con mensaje que ayude a entender la respuesta 
solucion a cada ejercicio con funcion comun y funcion flecha*/

const pi = Math.PI;
let radio = parseFloat (prompt("ingresa el valor del radio en cm"));//variable 
console.log (typeof radio);
let volumen; 

function calcularVolumen (radio){//parametro de la funcion
let radioCubo = Math.pow(radio);
let v=4/3*pi*radioCubo;
return v; 
}//calcular volumen 

const calcularVolumen = radio => console.log (4/3*pi*Math.pow(radio, 3)); 

volumen = (calcularVolumen(radio)).toFixed(2);

console.log (`radio: ${radio} cm, volumen: ${volumen}cm^3`);