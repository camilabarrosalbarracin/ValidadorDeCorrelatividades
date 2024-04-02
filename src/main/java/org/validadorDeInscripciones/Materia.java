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
public class Materia {
    private String nombre;
    private List<Materia> correlativas = new ArrayList<>();
}
