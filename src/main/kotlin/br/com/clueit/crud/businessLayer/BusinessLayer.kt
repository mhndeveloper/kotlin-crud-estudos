package br.com.clueit.crud.businessLayer

import br.com.clueit.crud.dataModel.*
import br.com.clueit.crud.dataPersistance.ContatoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service(value = "businessLayer")
class BusinessLayer{

    @Autowired
    lateinit var repository: ContatoRepository

    fun gravarContato(contatoDTO: ContatoDTO):ContatoDTO = repository.saveAndFlush(contatoDTO.toModel()).toDTO()
    fun pesquisarPorNome(nome:String):List<ContatoDTO> = repository.findByNome(nome).toDTOList()
    fun pesquisarPorId(id:Integer):ContatoDTO = repository.findByCodigo(id).toDTO()
}