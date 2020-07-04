package br.com.ms.cursomc.domain.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum EstadoPagamento {
    CANCELADO(1, "Cancelado"),
    PENDENTE(2, "Pendente"),
    QUITADO(3, "Quitado");

    private Integer codigo;
    private String descricao;

    public static EstadoPagamento toEnum(Integer codigo) {
        if (codigo == null)
            return null;

        for (var estado : EstadoPagamento.values()) {
            if (codigo.equals(estado.getCodigo()))
                return estado;
        }
        throw new IllegalArgumentException("Codigo de cliente inválido" + codigo);
    }
}
