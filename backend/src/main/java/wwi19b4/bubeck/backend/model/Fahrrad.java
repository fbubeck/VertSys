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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fahrrad implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Fahrradshop fahrradshop;

    @Column(length = 100)
    @NotNull(message = "Modell muss vergeben werden")
    @Size(min=1, max=100)
    private String modell = "";

    private int größeZoll = 0;

    @Column(length = 100)
    private String typ = "";
}
