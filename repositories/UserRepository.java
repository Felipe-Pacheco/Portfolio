package br.com.felipe.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
