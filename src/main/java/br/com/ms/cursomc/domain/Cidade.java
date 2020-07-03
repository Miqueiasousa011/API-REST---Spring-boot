package br.com.ms.cursomc.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = ("estado_id"))
    private Estado estado;
}
