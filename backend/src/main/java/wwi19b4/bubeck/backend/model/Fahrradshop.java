package wwi19b4.bubeck.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Entity-Klasse für das Objekt Fahrradshop (vgl. fachliches Datenmodell)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fahrradshop implements Serializable {

    //Konfigurieren der Spaltennamen mit Datentyp und Name
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    @NotNull(message = "Name muss vergeben werden")
    @Size(min=1, max=100)
    private String name = "";

    @Column(length = 100)
    @NotNull(message = "Adresse muss vergeben werden")
    @Size(min=1, max=100)
    private String adresse = "";

    private long anzahlMitarbeiter = 0;

    //1:n Beziehung zu Fahrrad Objekten herstellen
    @OneToMany(mappedBy = "fahrradshop", cascade = {CascadeType.REMOVE})
    List<Fahrrad> fahrräder = new ArrayList<>();

}
