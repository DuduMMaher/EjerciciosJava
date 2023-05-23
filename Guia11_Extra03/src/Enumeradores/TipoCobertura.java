/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeradores;

/**
 *
 * @author dudum
 */
public enum TipoCobertura {
    RESPONSABILIDAD_CIVIL(3), TERCEROS_SIMPLE(4), TERCEROS_COMPLETO(5), TODO_RIESGO_CON_FRANQUICIA(7), TOTAL(8);

    public static TipoCobertura getRESPONSABILIDAD_CIVIL() {
        return RESPONSABILIDAD_CIVIL;
    }

    public static TipoCobertura getTERCEROS_SIMPLE() {
        return TERCEROS_SIMPLE;
    }

    public static TipoCobertura getTERCEROS_COMPLETO() {
        return TERCEROS_COMPLETO;
    }

    public static TipoCobertura getTODO_RIESGO_CON_FRANQUICIA() {
        return TODO_RIESGO_CON_FRANQUICIA;
    }

    public static TipoCobertura getTOTAL() {
        return TOTAL;
    }
    
    private int value;
    
    TipoCobertura(int value){
        this.value=value;
    }
    
    public int getValue(){
        return value;
    }
    
}

