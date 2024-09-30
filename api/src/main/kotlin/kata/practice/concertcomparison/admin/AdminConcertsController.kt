package kata.practice.concertcomparison.admin

import kata.practice.concertcomparison.admin.AdminConcertsController.Companion.ENDPOINT
import kata.practice.concertcomparison.application.ConcertApplication
import kata.practice.concertcomparison.application.command.AddConcert
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(ENDPOINT)
class AdminConcertsController(
    private val concertApplication: ConcertApplication
){


    @PostMapping
    fun add(@RequestBody command: AddConcert): ResponseEntity<Void>{
        concertApplication.handle(command)
        return ResponseEntity.ok().build()
    }

    companion object{
        internal const val ENDPOINT = "admin/concerts"
    }
}