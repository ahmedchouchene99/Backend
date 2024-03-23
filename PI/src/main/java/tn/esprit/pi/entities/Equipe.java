package tn.esprit.pi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int EquipeID;
    String nomEquipe;
    int classement;
}
