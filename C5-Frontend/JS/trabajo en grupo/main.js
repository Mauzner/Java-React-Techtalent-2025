// Evento onclick + getElementById
function cambiarTexto() {
  const titulo = document.getElementById("titulo");
  titulo.textContent = "¡Gracias por visitarnos!";
}

// Evento oninput + querySelector + toUpperCase
function validarNombre() {
  const input = document.querySelector("input[name='nombre']");
  const mensaje = document.getElementById("mensaje-validacion");
  mensaje.textContent = input.value.toUpperCase();
}

function mostrarFrase() {
  const frases = [
    "Respira profundo. Conecta con lo natural 🌱",
    "La sabiduría crece como una planta: con paciencia y luz ☀️",
    "Donde hay respeto, florece la comunidad 🤝",
    "Cultiva con amor, cosecha con gratitud 💚"

  ];

  const fraseAleatoria = frases[Math.floor(Math.random() * frases.length)];
  document.getElementById("fraseInspiradora").textContent = fraseAleatoria;
}


// onmouseover + querySelectorAll
const enlaces = document.querySelectorAll("nav a");
enlaces.forEach(enlace => {
  enlace.onmouseover = () => {
    enlace.style.color = "yellow";
  };
});

// Uso de métodos de array y string
function procesarArticulos() {
  const articulos = ["primer post", "otro tema", "entrada final"];
  const resultado = articulos
    .filter(titulo => titulo.includes("post"))
    .map(titulo => titulo.replace("post", "artículo").toUpperCase());

  console.log(resultado);
}

procesarArticulos();

function cambiarImagen(idElemento, nuevaSrc) {
  document.getElementById(idElemento).src = nuevaSrc;
}

function irAProducto(nombre, precio, imagen) {
  // Codificamos para evitar problemas con caracteres especiales
  const url = `producto.html?nombre=${encodeURIComponent(nombre)}&precio=${precio}&imagen=${encodeURIComponent(imagen)}`;
  window.location.href = url;
}