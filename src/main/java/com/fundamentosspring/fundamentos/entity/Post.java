package com.fundamentosspring.fundamentos.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_post", nullable = false, unique = true)
    private Long id;

    @Column(name = "description", length = 255)
    private Long description;

    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(Long description, User user) {
        this.description = description;
        this.user = user;
    }

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description=" + description +
                ", user=" + user +
                '}';
    }
}
