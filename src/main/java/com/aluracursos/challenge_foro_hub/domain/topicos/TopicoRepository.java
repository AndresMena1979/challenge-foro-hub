package com.aluracursos.challenge_foro_hub.domain.topicos;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

   // Page<Topico> findByActivoTrue(Pageable paginacion);

}