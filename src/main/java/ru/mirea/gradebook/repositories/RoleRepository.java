package ru.mirea.gradebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.gradebook.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
