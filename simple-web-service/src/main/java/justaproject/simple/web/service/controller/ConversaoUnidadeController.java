package justaproject.simple.web.service.controller;

import helper.ExpressionHelper;
import justaproject.simple.web.service.controller.model.RetornoModel;
import org.springframework.web.bind.annotation.*;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.Vector;

// data annotation para classe que é um Rest Controller
@RestController
public class ConversaoUnidadeController {

    /**
     * Unico metodo a ser executado na chamada do endpoint
     *
     * @param units
     * @return
     * @throws ScriptException
     */
    @GetMapping(path = "/units/si")
    @ResponseBody
    public RetornoModel ConvertUnits(@RequestParam String units) throws ScriptException {

        // pega a expressao e o unit_name do parametro vindo da requisicao
        Vector<String> updatedExpressionAndUnitName = ExpressionHelper.FormatsExpressionAndGetUnitName(units.toLowerCase());

        // usa a biblioteca exp4j para calcular expressao
        double result = ExpressionHelper.EvaluateExpression(updatedExpressionAndUnitName.elementAt(0));

        // arredonda multiplication_factor para 14 digitos significantes
        BigDecimal multiplication_factor = ExpressionHelper.RoundsValueTo14SignificantDigits(result);

        // cria um objeto de retorno com os campos multiplication_factor e unit_name para serem retornados;
        RetornoModel retorno = RetornoModel.toObject(multiplication_factor, updatedExpressionAndUnitName.elementAt(1));

        return retorno;
    }
}
