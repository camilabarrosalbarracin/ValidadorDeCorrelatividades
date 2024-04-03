package org.validadorDeInscripciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias = new ArrayList<>();

    public boolean aprobada()  {
       // tomar la lista de materias de la inscripcion y por cada materia obtener las correlativas a esta y
        //  convertir esa lista de listas en una sola lista sin elementos repetidos
        // luego por cada materia de la lista de materias aprobadas del alumno, verificar si esta en la lista de correlativas de la materia de la inscripcion
        // si no esta, devolver false implementar todos los comentarios


        Stream<Materia> correlativas = materias.stream().flatMap(materia -> materia.getCorrelativas().stream());
        List<Materia> correlativasSinRepetidos = correlativas.distinct().toList();
        List<Materia> materiasAprobadasAlumno = alumno.getMateriasAprobadas();

        return materiasAprobadasAlumno.containsAll(correlativasSinRepetidos);
    }

}
