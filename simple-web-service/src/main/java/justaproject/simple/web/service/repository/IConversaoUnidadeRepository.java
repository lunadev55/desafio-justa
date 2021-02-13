package justaproject.simple.web.service.repository;

import java.util.Vector;

// interface que havia criado para manipulacao dos dados da tabela de unidades
public interface IConversaoUnidadeRepository {

    public static Vector<Vector<String>> CreateTable() {
        Vector<Vector<String>> tabelaUnidades = new Vector<Vector<String>>();

        Vector<String> headers = new Vector<String>();
        headers.add("Name");
        headers.add("Symbol");
        headers.add("Quantity");
        headers.add("SI Conversion");

        Vector<String> minute = new Vector<String>();
        minute.add("minute");
        minute.add("min");
        minute.add("time");
        minute.add("60");
        minute.add("s");

        Vector<String> hour = new Vector<String>();
        hour.add("hour");
        hour.add("h");
        hour.add("time");
        hour.add("3600");
        hour.add("s");

        Vector<String> day = new Vector<String>();
        day.add("day");
        day.add("d");
        day.add("time");
        day.add("86400");
        day.add("s");

        Vector<String> degree = new Vector<String>();
        degree.add("degree");
        degree.add("º");
        degree.add("unitless/plane angle");
        degree.add("(n/180)");
        degree.add("rad");

        Vector<String> arcminute = new Vector<String>();
        arcminute.add("arcminute");
        arcminute.add("'");
        arcminute.add("unitless/plane angle");
        arcminute.add("(n/10800)");
        arcminute.add("rad");

        Vector<String> arcsecond = new Vector<String>();
        arcsecond.add("arcminute");
        arcsecond.add("test");
        arcsecond.add("unitless/plane angle");
        arcsecond.add("(n/648000)");
        arcsecond.add("rad");

        Vector<String> hectare = new Vector<String>();
        hectare.add("hectare");
        hectare.add("ha");
        hectare.add("area");
        hectare.add("10000");
        hectare.add("m²");

        Vector<String> litre = new Vector<String>();
        litre.add("litre");
        litre.add("L");
        litre.add("volume");
        litre.add("0.001");
        litre.add("m³");

        Vector<String> tonne = new Vector<String>();
        tonne.add("tonne");
        tonne.add("t");
        tonne.add("mass");
        tonne.add("1000");
        tonne.add("kg");


        tabelaUnidades.add(headers);
        tabelaUnidades.add(hour);
        tabelaUnidades.add(day);
        tabelaUnidades.add(degree);
        tabelaUnidades.add(arcminute);
        tabelaUnidades.add(arcsecond);
        tabelaUnidades.add(hectare);
        tabelaUnidades.add(litre);
        tabelaUnidades.add(tonne);

        return tabelaUnidades;
    }

}
