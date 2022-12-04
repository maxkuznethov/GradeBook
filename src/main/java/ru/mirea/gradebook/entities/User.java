package ru.mirea.gradebook.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Data
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String number;
    private String password;
    private String studyGroup;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Exam> exams;

    public User(String name, String email, String number, String password, String studyGroup, Collection<Role> roles) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.password = password;
        this.studyGroup = studyGroup;
        this.roles = roles;
    }

    public User() {

    }
}
