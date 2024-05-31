package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.time.LocalDate;


@Entity
@Table(name = "demo")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Demo {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    public int Id;

   @Column(name = "full_name")
    public String name;

   @Column(name = "age")
    public  int age;


}
