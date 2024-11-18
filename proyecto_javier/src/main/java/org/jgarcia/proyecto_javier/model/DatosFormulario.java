package org.jgarcia.proyecto_javier.model;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DatosFormulario {
    @NotBlank(message = "{nombre.vacio}")
    private String nombre;

    @Size(min = 6, max = 12, message = "{clave.tamano}")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!#$%&]).+$", message = "{clave.formato}")
    private String clave;

    @NotBlank(message = "{confirmarClave.vacio}")
    private String confirmarClave;

    @NotBlank(message = "{genero.vacio}")
    private String generoSeleccionado;

    @NotBlank(message = "{pais.vacio}")
    private String paisSeleccionado;

    @NotNull(message = "{fechaNacimiento.vacio}")
    private LocalDate fechaNacimiento;

    private Integer edad;
    private Float peso;
    private String prefijoTelefonico;
    private String telefono;
    private String email;
    private String url;
    private List<String> musicasSeleccionadas;
    private List<String> aficionesSeleccionadas;
    private String comentarios;
    private Boolean licencia;
}

