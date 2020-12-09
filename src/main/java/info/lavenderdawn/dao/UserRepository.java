package info.lavenderdawn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.lavenderdawn.entities.UserName;

@Repository
public interface UserRepository extends JpaRepository<UserName, Long> {
	UserName findByEmail(String email);
}