package br.com.ms.cursomc.domain;

import br.com.ms.cursomc.domain.enums.TipoCliente;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private TipoCliente tipoCliente;

    @ElementCollection
    @CollectionTable(name = ("TELEFONE"))
    private Set<String> telefone = new HashSet<>();
}
