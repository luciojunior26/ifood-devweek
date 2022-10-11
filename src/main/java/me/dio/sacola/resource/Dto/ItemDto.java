package me.dio.sacola.resource.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Data
@Embeddable
@NoArgsConstructor

public class ItemDto {
    private Long ProdutoId;
    private int quantidade;
    private Long SacolaId;

}
