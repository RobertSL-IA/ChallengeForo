

package com.ChallengeForo.api.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    
    @Column(columnDefinition = "TEXT")
    private String mensaje;
    
    private LocalDateTime fechaCreacion;
    
    @Enumerated(EnumType.STRING)
    private EstadoTopico status;  // Enum para representar el estado del tópico (activo, cerrado, etc.)
    
    private String autor;
    
    private String curso;

    public Topico(String titulo, String mensaje, String autor, String curso) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaCreacion = LocalDateTime.now();
        this.status = EstadoTopico.ACTIVO;  // Por defecto el tópico está activo
        this.autor = autor;
        this.curso = curso;
    }

    public void actualizarStatus(EstadoTopico nuevoStatus) {
        this.status = nuevoStatus;
    }
    
    public void actualizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }

    public enum EstadoTopico {
        ACTIVO,
        CERRADO,
        EN_REVISION
    }
}
