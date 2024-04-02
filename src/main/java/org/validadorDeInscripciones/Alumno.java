package org.validadorDeInscripciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Materia> materiasAprobadas = new ArrayList<>();
}
