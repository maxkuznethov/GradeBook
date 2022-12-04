package ru.mirea.gradebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.gradebook.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
