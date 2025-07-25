package com.bookStar.bookStar.book.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "authorName")
   private String authorName;

   @Column(name = "pages")
   private int pages;

   @Column(name = "imgUrl")
   private String imgUrl;

   @Column(name = "rating")
   private int rating;

}
