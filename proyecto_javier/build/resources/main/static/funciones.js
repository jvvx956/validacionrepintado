
function deseleccionarGenero() {
    const radios = document.querySelectorAll('input[name="generoSeleccionado"]');
    radios.forEach(radio => radio.checked = false);
}


function deseleccionarMusicas() {
    const musicas = document.getElementById("musicasSeleccionadas");
    for (let i = 0; i < musicas.options.length; i++) {
        musicas.options[i].selected = false;
    }
}


function seleccionarMusicas() {
    const musicas = document.getElementById("musicasSeleccionadas");
    for (let i = 0; i < musicas.options.length; i++) {
        musicas.options[i].selected = true;
    }
}


function deseleccionarAficiones() {
    const checkboxes = document.querySelectorAll('input[name="aficionesSeleccionadas"]');
    checkboxes.forEach(checkbox => checkbox.checked = false);
}


function seleccionarAficiones() {
    const checkboxes = document.querySelectorAll('input[name="aficionesSeleccionadas"]');
    checkboxes.forEach(checkbox => checkbox.checked = true);
}


function borrarCamposFormulario(formularioId) {
    const formulario = document.getElementById(formularioId);
    formulario.reset();
}


function mostrarClaves() {
    const clave = document.getElementById("clave");
    const confirmarClave = document.getElementById("confirmarClave");
    const tipo = clave.type === "password" ? "text" : "password";
    clave.type = tipo;
    confirmarClave.type = tipo;
}


function confirmarEnvio(formularioId) {
    const mensaje = "Pulsa Aceptar para enviar el formulario. Pulsa Cancelar para abortar esta operación.";
    if (confirm(mensaje)) {
        document.getElementById(formularioId).submit();
    }
}

function confirmarReseteo(formularioId) {
    const mensaje = "Pulsa Aceptar para restablecer los valores del formulario. Pulsa cancelar para abortar esta operación.";
    if (confirm(mensaje)) {
        document.getElementById(formularioId).reset();
    }
}
