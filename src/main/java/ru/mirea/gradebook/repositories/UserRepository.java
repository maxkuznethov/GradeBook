package ru.mirea.gradebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.gradebook.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
