package com.example.cliente.app.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Cliente")
@Getter
@Setter
@ToString
@Table(schema = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(nullable = false, length = 10)
    private String codigoCliente;
    @Column(name = "nombres", nullable = false, length = 20)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 30)
    private String apellidos;
    private LocalDate fechaNacimiento;
}
