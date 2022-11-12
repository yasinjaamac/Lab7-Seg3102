package seg3x02.booksrestapi.entities

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OneToOne

import javax.persistence.*

class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var firstName: String = ""
    var lastName: String = ""

    @ManyToMany
    var books: MutableList<Book> = ArrayList()

    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var bio:Bio=Bio()

}