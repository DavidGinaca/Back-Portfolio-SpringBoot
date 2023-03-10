package com.portfolioBackEnd.portfolioBackEnd.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author david
 */
@Getter @Setter
public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    } 
}
