package com.example.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class EnfermedadExperto {

    public List<String> getBrands(String enfermedad) {

        List enfermedades = new ArrayList<>();
        switch (enfermedad) {
            case "Diabetes":
                enfermedades.add("glucosa en la sangre");
                enfermedades.add("agudeza visual");
                break;
            case "Hipertension":
                enfermedades.add("presion arteria");
                break;
            case "Insuficiencia cardiaca":
                enfermedades.add("frecuencia cardiaca");
                break;
        }
return enfermedades;
    }


}
