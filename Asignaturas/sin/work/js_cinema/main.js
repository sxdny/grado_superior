// querySelector(p, #id, .class)

const contenidor = document.querySelector('.contenidor');
// coge el primero

const seients = document.querySelectorAll('.fila .seients:not(.ocupat)');

const contador = document.getElementById('contador');
const total = document.getElementById('total');

const peliculaSelect = document.getElementById('pelicula');


let preuTicket = +peliculaSelect.value; // + -> parseInt