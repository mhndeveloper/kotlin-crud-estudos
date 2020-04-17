package br.com.clueit.crud.dataModel

import javax.persistence.*

@Entity
@Table(name = "contato")
class Contato(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Integer,
    @Column(name = "nome")
    val nome :String,
    @Column(name = "email")
    val email :String,
    @Column(name = "telefone")
    val telefone: String
)

data class ContatoDTO(
    val id :Integer,
    val nome: String,
    val email :String,
    val telefone :String

)

fun Contato.toDTO(): ContatoDTO = ContatoDTO(id, nome, email, telefone)

fun ContatoDTO.toModel() : Contato = Contato(id,nome, email,telefone)

fun List<Contato>.toDTOList():List<ContatoDTO> = this.map { it.toDTO() }
