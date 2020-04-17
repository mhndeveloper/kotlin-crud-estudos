package br.com.clueit.crud.service

import br.com.clueit.crud.businessLayer.BusinessLayer
import br.com.clueit.crud.dataModel.ContatoDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1.0/contato")
class ContatoRestService{

    @Autowired
    lateinit var businessLayer: BusinessLayer

    @GetMapping("/pesquisarPorNome/{nome}")
    fun pesquisarPorNome(@PathVariable nome:String) :List<ContatoDTO> = businessLayer.pesquisarPorNome(nome)

    @GetMapping("/pesquisarPorId/{id}")
    fun pesquisarPorId(@PathVariable id:String) :ContatoDTO = businessLayer.pesquisarPorId(Integer(id))

    @PostMapping("/gravarContato")
    fun gravarContato(@RequestBody contatoDTO:ContatoDTO) = businessLayer.gravarContato(contatoDTO)

}