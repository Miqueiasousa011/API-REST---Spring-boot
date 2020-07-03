package br.com.ms.cursomc.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date instante;

    @ManyToOne
    @JoinColumn(name = ("enderecoEntrega_id"))
    private Endereco enderecoDeEntrega;

    @ManyToOne
    @JoinColumn(name = ("cliente_id"))
    private Cliente cliente;
}
