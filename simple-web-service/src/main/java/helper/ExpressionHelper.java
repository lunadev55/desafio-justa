package helper;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Vector;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * Classe que possui algumas operações para ajudar no manipulamento das expressoes
 */
public class ExpressionHelper {
    // faz uso da biblioteca exp4j para fazer o calculo da expressao
    public static double EvaluateExpression(String exp) {
        Expression expression = new ExpressionBuilder(exp).build();
        double result = expression.evaluate();

        return result;
    }

    // metodo para arredondar um valor double para ter 14 digitos significativos
    public static BigDecimal RoundsValueTo14SignificantDigits(double value) {
        String expStringResult = value+"";

        BigDecimal helper = new BigDecimal(expStringResult);
        helper = helper.round(new MathContext(14));
        double rounded = helper.doubleValue();

        BigDecimal finalValue = new BigDecimal(rounded+"");

        return finalValue;
    }

    // recebe o parametro vindo da url e transforma na expressao
    // exemplo (degree/minute) = ((pi/3.14...)/60)
    // tambem faz a criação do unit_name exemplo (rad/s)
    public static Vector<String> FormatsExpressionAndGetUnitName(String exp) {
        Double pi = Math.PI;
        String unitName = exp;

        Vector<String> fields = new Vector<String>();

        if (exp.contains(Unidades.minute.toString())) {
            exp = exp.replace(Unidades.minute.toString(), "60");
            unitName = unitName.replace(Unidades.minute.toString(), "s");
        }
        if (exp.contains(Unidades.hour.toString())) {
            exp = exp.replace(Unidades.hour.toString(), "3600");
            unitName = unitName.replace(Unidades.hour.toString(), "s");
        }
        if (exp.contains(Unidades.day.toString())) {
            exp = exp.replace(Unidades.day.toString(), "86400s");
            unitName = unitName.replace(Unidades.day.toString(), "s");
        }
        if (exp.contains(Unidades.degree.toString())){
            exp = exp.replace(Unidades.degree.toString(), ("(" + pi.toString() + "/180)"));
            unitName = unitName.replace(Unidades.degree.toString(), "rad");
        }
        if (exp.contains(Unidades.arcminute.toString())){
            exp = exp.replace(Unidades.arcminute.toString(), ("(" + pi.toString() + "/10800)"));
            unitName = unitName.replace(Unidades.arcminute.toString(), "rad");
        }
        if (exp.contains(Unidades.arcsecond.toString())){
            exp = exp.replace(Unidades.arcsecond.toString(), ("(" + pi.toString() + "/180)"));
            unitName = unitName.replace(Unidades.arcsecond.toString(), "rad");
        }
        if (exp.contains(Unidades.hectare.toString())) {
            exp = exp.replace(Unidades.hectare.toString(), "10000");
            unitName = unitName.replace(Unidades.hectare.toString(), "m²");
        }
        if (exp.contains(Unidades.litre.toString())) {
            exp = exp.replace(Unidades.litre.toString(), "0.001");
            unitName = unitName.replace(Unidades.litre.toString(), "m³");
        }
        if (exp.contains(Unidades.tonne.toString())) {
            exp = exp.replace(Unidades.tonne.toString(), "kg");
            unitName = unitName.replace(Unidades.tonne.toString(), "rad");
        }

        fields.add(exp);
        fields.add(unitName);

        return fields;
    }
}
