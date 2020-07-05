package br.com.ms.cursomc.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Embeddable
//Classe auxiliar que representa a chave composta do ItemPedido
public class ItemPedidoPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = ("produto_id"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = ("pedido_id"))
    private Pedido pedido;
}
