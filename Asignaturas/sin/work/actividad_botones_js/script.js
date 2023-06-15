// definir variables

// let content = document.getElementById('menu');
// let firstChild = content.firstChild.nodeName;
// console.log(firstChild);

// tengo los dos botones
const botones = document.querySelectorAll('.boto')

const provar = document.getElementById('provarButton');
const jugar = document.getElementById('jugarButton')

jugar.addEventListener('click', () => {

    jugar.disabled = true;
    provar.disabled = false;

})

// disable probar button
provar.disabled = true

const botonIzquierda = botones[0]
const botonDerecha = botones[1]

// boton izquierda
botonIzquierda.addEventListener('click', () => {

    if (jugar.disabled == true) {
        if (botonIzquierda.style.backgroundColor == "blue") {
            botonIzquierda.style.backgroundColor = "red"
        }
        else {
            botonIzquierda.style.backgroundColor = "blue"
        }
    }

})

// boton derecha
botonDerecha.addEventListener('click', () => {

    if (jugar.disabled == true) {
        if (botonDerecha.style.backgroundColor == "blue") {
            botonDerecha.style.backgroundColor = "red"
        }
        else {
            botonDerecha.style.backgroundColor = "blue"
        }  
    }
})
