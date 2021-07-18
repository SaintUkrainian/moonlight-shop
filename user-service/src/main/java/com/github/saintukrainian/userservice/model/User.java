package com.github.saintukrainian.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @Column(name = "first_name")
  String firstName;

  @Column(name = "last_name")
  String lastName;

  @Column(name = "phone_number")
  String phoneNumber;
}
