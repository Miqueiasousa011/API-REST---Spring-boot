package br.com.ms.cursomc.domain;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class ItemPedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Double desconto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido(Produto produto, Pedido pedido, Double desconto, Integer quantidade, Double preco) {
        this.id.setProduto(produto);
        this.id.setPedido(pedido);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Pedido getPedido() {
        return id.getPedido();
    }

    public Produto getProduto() {
        return id.getProduto();
    }
}
