package me.dio.academia.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.dio.academia.digital.entity.Aluno;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
  /**
   *
   * @param dataDeNascimento: data de nascimento dos alunos
   * @return lista com todos os alunos com a data de nascimento passada como parâmetro da função
   */
  List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

  /**
   *
   * @param bairro: bairro dos alunos
   * @return lista com todos os alunos com o bairro passado como parâmetro da função
   */
  List<Aluno> findByBairro(String bairro);
}
