package br.com.clueit.crud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCrudEstudosApplication

fun main(args: Array<String>) {
    runApplication<KotlinCrudEstudosApplication>(*args)
    print("******************************************************\n")
    print("Acesse a documentacao pelo endereco /swagger-ui.html\n")
    print("******************************************************\n")
}
