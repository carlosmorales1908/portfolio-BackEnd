package com.cdbm.portfolio.security.dto;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NuevoUsuario {
    private String nombre;
    private String email;
    private String nombreUsuario;
    private String password;
    private Set<String> roles = new HashSet<>();
}
