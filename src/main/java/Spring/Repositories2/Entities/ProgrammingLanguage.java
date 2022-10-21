package Spring.Repositories2.Entities;

import javax.persistence.*;
import java.time.Year;

@Entity
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    private Year firstAppearance;

    @Column(nullable = false)
    private String inventor;
}

