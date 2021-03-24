package wwi19b4.bubeck.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hersteller implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Fahrrad fahrrad;

    @Column(length = 100)
    @NotNull(message = "Name muss vergeben werden")
    @Size(min=1, max=100)
    private String name = "";

    @Column(length = 100)
    @NotNull(message = "Adresse muss vergeben werden")
    @Size(min=1, max=100)
    private String adresse = "";

    @NotNull(message = "Telefonnummer muss vergeben werden")
    private long telefon = 0;

    private long anzahlMitarbeiter = 0;
}
