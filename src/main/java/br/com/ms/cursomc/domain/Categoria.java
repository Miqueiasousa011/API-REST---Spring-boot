package br.com.ms.cursomc.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @ManyToMany
    @JoinTable(
            name = ("CATEGORIA_PRODUTO"),
            joinColumns = @JoinColumn(name = ("categoria_id")),
            inverseJoinColumns = @JoinColumn(name = (("produto_id")))
    )
    private List<Produto> produtos = new ArrayList<>();
}
