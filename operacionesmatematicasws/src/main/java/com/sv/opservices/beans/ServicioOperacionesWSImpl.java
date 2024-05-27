package com.sv.opservices.beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author rguzm
 */
@Stateless
@WebService(endpointInterface = "com.sv.opservices.beans.ServicioOperacionesWS")
public class ServicioOperacionesWSImpl implements ServicioOperacionesWS {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return (double) a / b;
    }
}
