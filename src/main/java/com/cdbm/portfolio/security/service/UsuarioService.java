package com.cdbm.portfolio.security.service;

import com.cdbm.portfolio.security.entity.Usuario;
import com.cdbm.portfolio.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
     @Autowired
    IUsuarioRepository iUsRep;
    
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsRep.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsRep.existsByNombreUsuario(nombreUsuario);
    }
        
    public boolean existsByEmail(String email){
        return iUsRep.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iUsRep.save(usuario);
    }
}
