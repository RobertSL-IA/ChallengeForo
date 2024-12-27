/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.ChallengeForo.api.topico;

public record DatosListadoTopico(Long id, String titulo, String autor, String curso, Topico.EstadoTopico status) {

    public DatosListadoTopico(Topico topico) {
        this(
            topico.getId(),
            topico.getTitulo(),
            topico.getAutor(),
            topico.getCurso(),
            topico.getStatus()
        );
    }
}
