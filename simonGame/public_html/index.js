//Start
var tituloPrincipal = document.querySelector("h1");
document.addEventListener("keydown", function(event) {
  if (event.key == "a") {
    var nivelActual = "level 1";
    tituloPrincipal.innerHTML = nivelActual;
    jugar(nivelActual);

  }
});

//jugar() se encarga de dar inicio al juego
function jugar(nivelActual) {
  if (nivelActual === "level 1") {
    reproducirSecuencia(ArregloBotones(), generarPatron(3), 3000);
  }
}

//genera un patron de botones a oprimir y devuelve un arreglo llamado secuencia
function generarPatron(tamaño) {
  var secuencia = {};
  for (var i = 0; i < tamaño; i++) {
    secuencia[i] = Math.floor(Math.random() * 4 + 1);
  }
  return secuencia;
}

//ArregloBotones() crea un arreglo de los botones a comparar con el arreglo de
//patron generado aleatoriamente y asi saber cuales imprimir
function ArregloBotones() {
  var elemento = document.querySelectorAll('.btn');
  var botones = {};

  for (var i = 0; i < elemento.length; i++) {
    botones[i] = parseInt(elemento[i].getAttribute('value'));
  }

  return botones;
}



//reproducirSecuencia() se encarga de hacer que los botones reproduzcan la secuencia
//de botones a pulsar de forma gráfica


function reproducirSecuencia(botones, secuencia, velocidad) {


  for (var i; i < botones.length; i++) {
    var elemento = document.querySelectorAll('.btn');

    setInterval(function() {
      for (var j = 0; j < secuencia.length; j++) {
        if (botones[i] === secuencia[j]) {

          elemento.classList.add('pressed');

          setTimeout(function() {
            elemento.classList.remove('pressed');
          }, 3000);
          if (secuencia[j] < secuencia.length) {
            j++;
          }
        }

      }

    }, 4000);



  }

}



//recolectarSecuencia() se encarga de captar los botones oprimidos por el usuario en tiempo real
function recolectarSecuencia(secuencia) {

}

//compara el patron generado de forma constante con el ingresado por el usuario, en caso de error,
//restablece el juego con ayuda de la funcion reiniciar()
function comparar(event) {

}

//reiniciar() se encarga de hacer que el usuario vuelva al nivel 1 si se equivoca
function reiniciar() {

}



// document.addEventListener("click", function() {
//
// });


