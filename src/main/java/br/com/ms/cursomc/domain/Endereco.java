package br.com.ms.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    @ManyToOne
    @JoinColumn(name = ("cidade_id"))
    private Cidade cidade;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = ("cliente_id"))
    private Cliente cliente;
}
