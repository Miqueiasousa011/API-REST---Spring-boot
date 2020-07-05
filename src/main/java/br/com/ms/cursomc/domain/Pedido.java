package br.com.ms.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss")
    private Date instante;

    @ManyToOne
    @JoinColumn(name = ("enderecoEntrega_id"))
    private Endereco enderecoDeEntrega;

    @ManyToOne
    @JoinColumn(name = ("cliente_id"))
    private Cliente cliente;

    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Pagamento pagamento;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido> itemPedidos = new HashSet<>();

}
