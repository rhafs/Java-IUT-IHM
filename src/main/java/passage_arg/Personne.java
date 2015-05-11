package passage_arg;

/**
 * Created on 11/05/15.
 *
 * @author gaugendre
 */
public class Personne {
    private String nom;
    private String sport;

    /**
     * @param nom Comprend le prénom.
     * @param sport Le sport pratiqué.
     */
    public Personne(String nom, String sport) {
        this.nom = nom;
        this.sport = sport;
    }

    public String getNom() {
        return nom;
    }

    /**
     * @param nom Comprend le prénom.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSport() {
        return sport;
    }
    public void setSport(String sport) {
        this.sport = sport;
    }
}
