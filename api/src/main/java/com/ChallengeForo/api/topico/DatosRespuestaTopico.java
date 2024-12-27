/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.ChallengeForo.api.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Topico.EstadoTopico status,
        String autor,
        String curso) {

}
