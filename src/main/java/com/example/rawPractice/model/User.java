package com.example.rawPractice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @id (GeneratedValue= GenerationType.AUTO)
    private Long id;

    private String Name;
    private String Email;
    private String password;
    private String address;
    private String role;


}
