package com.example.newprojectoption.bean;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class NoteEtudiantModule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    @ManyToOne
    private ModuleSemestreOption moduleSemestreOption;
    private BigDecimal note ;
    private BigDecimal noteContinue;
    private BigDecimal noteFinalAvRat;
    private BigDecimal noteFinalApresRat;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private EtatValidation etatValidation;

    public BigDecimal getNoteContinue() {
        return noteContinue;
    }

    public void setNoteContinue(BigDecimal noteContinue) {
        this.noteContinue = noteContinue;
    }

    public BigDecimal getMoyenne() {
        return note;
    }

    public void setMoyenne(BigDecimal moyenne) {
        this.note = moyenne;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Etudiant getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public ModuleSemestreOption getModuleSemestreOption() {
        return moduleSemestreOption;
    }

    public void setModuleSemestreOption(ModuleSemestreOption moduleSemestreOption) {
        this.moduleSemestreOption = moduleSemestreOption;
    }

    public EtatValidation getEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(EtatValidation etatValidation) {
        this.etatValidation = etatValidation;
    }

    public BigDecimal getNote() {
        return note;
    }

    public void setNote(BigDecimal note) {
        this.note = note;
    }

    public BigDecimal getNoteFinalAvRat() {
        return noteFinalAvRat;
    }

    public void setNoteFinalAvRat(BigDecimal noteFinalAvRat) {
        this.noteFinalAvRat = noteFinalAvRat;
    }

    public BigDecimal getNoteFinalApresRat() {
        return noteFinalApresRat;
    }

    public void setNoteFinalApresRat(BigDecimal noteFinalApresRat) {
        this.noteFinalApresRat = noteFinalApresRat;
    }
}

