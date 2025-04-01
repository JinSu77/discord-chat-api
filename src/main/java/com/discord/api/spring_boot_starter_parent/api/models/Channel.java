package com.discord.api.spring_boot_starter_parent.api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "channels")
@Getter
@Setter
public class Channel extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Size(min = 2, max = 50)
    private String name;

    @OneToMany(mappedBy = "channel")
    private List<Message> messages;

    public List<Message> messages() {
        return messages;
    }
}
