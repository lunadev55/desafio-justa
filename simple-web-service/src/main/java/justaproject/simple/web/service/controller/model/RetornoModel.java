package justaproject.simple.web.service.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Classe que simula objeto de retorno com os 2 parametros esperados como resposta (response)
 */
public class RetornoModel {

    // propriedades a serem retornadas no json
    @JsonProperty("unit_name")
    private String unit_name;

    @JsonProperty("multiplication_factor")
    private BigDecimal multiplication_factor;

    // construtor
    public RetornoModel(String unit_name, BigDecimal multiplication_factor) {
        this.unit_name = unit_name;
        this.multiplication_factor = multiplication_factor;
    }

    // pega os dois campos com os valores para unit_name e multiplication_factor e cria um objeto
    // a ser retornado como json (response)
    public static RetornoModel toObject(BigDecimal result, String unitName) {
        RetornoModel retorno = new RetornoModel(unitName, result);
        return retorno;
    }
}
