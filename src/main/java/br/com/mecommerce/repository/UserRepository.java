package br.com.mecommerce.repository;

import br.com.mecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByLoginAndPassword(String login,String password);
}
