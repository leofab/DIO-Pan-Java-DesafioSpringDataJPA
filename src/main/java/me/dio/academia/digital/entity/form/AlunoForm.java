package me.dio.academia.digital.entity.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preencha o campo corretamente, não pode ser vazio.")
  @Size(min = 3, max = 100, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente, não pode ser vazio.")
  @CPF(message = "'${validateValue}' é inválido")
  private String cpf;

  @NotBlank(message = "Preencha o campo corretamente, não pode ser vazio.")
  @Size(min = 3, max = 100, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;


  @NotBlank(message = "Preencha o campo corretamente, não pode ser vazio.")
  @Past(message = "Data '${validateValue}' é invalido")
  private LocalDate dataDeNascimento;
}
