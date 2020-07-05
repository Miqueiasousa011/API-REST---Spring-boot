package br.com.ms.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;

    @JsonIgnore
    @ManyToMany(mappedBy = "produtos")
    private List<Categoria> categorias = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "id.produto")
    private Set<ItemPedido> itemPedidos = new HashSet<>();

    public List<Pedido> getPedidos() {
        List<Pedido> pedidos = new ArrayList<>();

        itemPedidos.forEach(itemPedido -> {
            pedidos.add(itemPedido.getPedido());
        });

        return pedidos;
    }

}
