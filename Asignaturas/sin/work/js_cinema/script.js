//querySelector(p,ul,#id,.classe)

const contenidor = document.querySelector(".contenidor");
const seients = document.querySelectorAll(".fila .seient:not(.ocupat");
const contador = document.getElementById("contador");
const total = document.getElementById("total");
const peliculaSelect = document.getElementById("pelicula");

let preuDelTicket = +peliculaSelect.value;

// justo al cargar la pagina, llamar la función
ompleUI();

function actualitzaSeleccioSeients() {
  const seientsSeleccionats = document.querySelectorAll(
    ".fila .seient.seleccionat"
  );
  // console.log(seientsSeleccionats);

  const seientsIndex = [...seientsSeleccionats].map(function (seient) {
    return [...seients].indexOf(seient);
  });

  //   const seientsIndexFletxa = [...seientsSeleccionats].map((seient) => [... seients].indexOf(seient));

  localStorage.setItem("seientsSeleccionats", JSON.stringify(seientsIndex));

  const contadorSeientsSeleccionats = seientsSeleccionats.length;

  contador.innerText = contadorSeientsSeleccionats;

  total.innerText = preuDelTicket * contadorSeientsSeleccionats;
}

// funcion para guardar los indidex de las peliculas (al cambiar de pelicula y al recargar la pagina)
function guardaInfoPelicula(indexPelicula, preuPelicula) {
  localStorage.setItem('indexPeliculaSeleccionada', indexPelicula);
  localStorage.setItem('preuPeliculaSeleccionada', preuPelicula);

}

// recuparar la info del localStorage y actualizar la pagina
function ompleUI() {

  // recuperar los asientos seleccionados
  const seientsSeleccionats = JSON.parse(localStorage.getItem('seientsSeleccionats'));

  // si hay asientos...
  if (seientsSeleccionats !== null && seientsSeleccionats.length > 0) {
    seients.forEach((seient, index) => {
      if(seientsSeleccionats.indexOf(index) > - 1 ) {
        // -1 si NO está
        seient.classList.add('seleccionat'); // añadir la clase 'seleccionat'
      }
    })
  }

  // actualizar el resto de info
  // TODO arreglar esto ?
  const indexPeliculaSeleccionada = localStorage.getItem('indexPeliculaSeleccionada')

  if (indexPeliculaSeleccionada !== null) {
    peliculaSelect.selectedIndex = indexPeliculaSeleccionada;
  }

  const preuPeliculaSeleccionada = localStorage.getItem('preuPeliculaSeleccionada');

  if (preuPeliculaSeleccionada !== null) {
    preuDelTicket = +preuPeliculaSeleccionada; // importante pasar a numurico
  }

}

contenidor.addEventListener("click", (e) => {
  if (
    e.target.classList.contains("seient") &&
    !e.target.classList.contains("ocupat")
  ) {
    e.target.classList.toggle("seleccionat");
    actualitzaSeleccioSeients();
  }
});

// capturar precio
peliculaSelect.addEventListener("change", (e) => {
  preuDelTicket = e.target.value;

  guardaInfoPelicula(e.target.selectedIndex, e.target.value);

  actualitzaSeleccioSeients();
});

// actualizar los totales

actualitzaSeleccioSeients();


