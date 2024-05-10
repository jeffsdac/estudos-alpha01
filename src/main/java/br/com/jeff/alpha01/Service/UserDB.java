package br.com.jeff.alpha01.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeff.alpha01.Models.User;

@Repository
public interface UserDB extends JpaRepository<User, Integer>{
    
}
