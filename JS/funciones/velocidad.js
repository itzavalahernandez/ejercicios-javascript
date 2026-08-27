/*funciones: 
velocidad de un objeto dadas distancia y tiempo
resultados con mensaje que ayude a entender la respuesta 
solucion a cada ejercicio con funcion comun y funcion flecha
*/ 

let distancia = parseFloat(prompt("inserta la distancia"));
let tiempo =parseFloat (prompt ("inserta el tiempo"));
let velocidad;
 
//funcion comun: multiples instrucciones 
function calcularVelocidad (distancia, tiempo) {
let velocidad = distancia/tiempo; 
return velocidad; 
}// calcular velocidad 

//funcion flecha: una sola instruccion o funciones sencillas 
 const calcularVelocidad2 = (distancia, tiempo) => console.log(distancia/tiempo);

 velocidad = (calcularVelocidad(distancia, tiempo)).toFixed (2);

 console.log (`distancia: ${distancia}metros, tiempo; ${tiempo} segundos.
   velocidad: ${velocidad} m/s^2`); 

   calcularVelocidad2 (distancia, tiempo);











