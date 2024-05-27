package com.sv.opservices.beans;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author rguzm
 */
@WebService
public interface ServicioOperacionesWS {
    @WebMethod
    int sumar(int a, int b);
    
    @WebMethod
    int restar(int a, int b);
    
    @WebMethod
    int multiplicar(int a, int b);
    
    @WebMethod
    double dividir(int a, int b);
}
