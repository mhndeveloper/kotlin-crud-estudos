package br.com.clueit.crud.dataPersistance

import br.com.clueit.crud.dataModel.Contato
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ContatoRepository: JpaRepository<Contato, Integer> {
    @Query("select c from Contato c where c.nome like %:nome%")
    fun findByNome(@Param("nome") nome:String):List<Contato>

    @Query("from Contato c where c.id = :id")
    fun findByCodigo(@Param("id") id:Integer):Contato

}