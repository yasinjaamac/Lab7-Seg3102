package seg3x02.booksrestapi.entities

import javax.persistence.*

@Entity
class Bio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
    var biodata: String = ""

}