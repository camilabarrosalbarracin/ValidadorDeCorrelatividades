package org.validadorDeInscripciones;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InscripcionTest {

    @Test
    public void testAprobada_TodasCorrelativasAprobadas() {
        Alumno alumno = new Alumno();
        Materia matematicaSuperior = new Materia();
        Materia analisisI = new Materia();
        Materia analisisII = new Materia();

        matematicaSuperior.setCorrelativas(Arrays.asList(analisisI, analisisII));
        analisisI.setCorrelativas(List.of(analisisII));

        alumno.getMateriasAprobadas().add(analisisI);
        alumno.getMateriasAprobadas().add(analisisII);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMaterias(List.of(matematicaSuperior));

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testAprobada_NoTodasCorrelativasAprobadas() {
        Alumno alumno = new Alumno();
        Materia matematicaSuperior = new Materia();
        Materia analisisI = new Materia();
        Materia analisisII = new Materia();

        matematicaSuperior.setCorrelativas(Arrays.asList(analisisI, analisisII));
        analisisI.setCorrelativas(List.of(analisisII));

        alumno.getMateriasAprobadas().add(analisisI);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMaterias(List.of(matematicaSuperior));

        assertFalse(inscripcion.aprobada());
    }
}
