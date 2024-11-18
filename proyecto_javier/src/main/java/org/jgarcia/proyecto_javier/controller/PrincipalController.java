package org.jgarcia.proyecto_javier.controller;

import org.jgarcia.proyecto_javier.model.Colecciones;
import org.jgarcia.proyecto_javier.model.DatosFormulario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/formulario")
@SessionAttributes("iteraciones")
public class PrincipalController {

    @ModelAttribute("iteraciones")
    public Integer setIteraciones() {
        return 1;
    }

    @GetMapping("/devuelve-formulario")
    public String devuelveFormulario(Model model, @ModelAttribute("iteraciones") Integer iteraciones) {
        model.addAttribute("datosFormulario", new DatosFormulario());
        agregarColecciones(model);
        model.addAttribute("iteraciones", iteraciones);
        model.addAttribute("mensajeCabecera", "Bienvenido al formulario");
        return "formulario";
    }

    @PostMapping("/recibe-parametros")
    public String recibeParametrosYRepinta(
            @Valid @ModelAttribute DatosFormulario datosFormulario,
            BindingResult result,
            Model model,
            @ModelAttribute("iteraciones") Integer iteraciones) {

        iteraciones++;
        model.addAttribute("iteraciones", iteraciones);

        if (result.hasErrors()) {
            model.addAttribute("mensajeCabecera", "ALERTA: Formulario con errores");
            agregarColecciones(model);
            return "formulario";
        }

        if (!datosFormulario.getClave().equals(datosFormulario.getConfirmarClave())) {
            result.rejectValue("clave", "error.clave", "Las claves no coinciden");
            result.rejectValue("confirmarClave", "error.confirmarClave", "Las claves no coinciden");
            model.addAttribute("mensajeCabecera", "ALERTA: Formulario con errores");
            agregarColecciones(model);
            return "formulario";
        }

        model.addAttribute("mensajeCabecera", "ALELUYA: Formulario sin errores");
        return "formulario";
    }

    private void agregarColecciones(Model model) {
        model.addAttribute("listaGeneros", Colecciones.getListaGeneros());
        model.addAttribute("listaPaises", Colecciones.getListaPaises());
        model.addAttribute("listaMusicas", Colecciones.getListaMusicas());
        model.addAttribute("listaAficiones", Colecciones.getListaAficiones());
    }
}
