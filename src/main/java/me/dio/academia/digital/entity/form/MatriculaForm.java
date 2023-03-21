package me.dio.academia.digital.entity.form;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long alunoId;

}
