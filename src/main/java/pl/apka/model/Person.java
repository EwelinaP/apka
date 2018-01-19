package pl.apka.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.util.Objects;


@Entity
public class Person  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imie;
    private String nazwisko;
    private String dataUrodzenia;
    private String dataSmierci;
    private String miejsceUrodzenia;
    private String miejsceSmierci;
    private int rok_obrony;
    private String miejsceObrony;


    public Person()
    {

    }
    public Person(String imie, String nazwisko, String dataUrodzenia, String dataSmierci, String miejsceUrodzenia, String miejsceSmierci, int rok_obrony, String miejsceObrony) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.dataSmierci = dataSmierci;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.miejsceSmierci = miejsceSmierci;
        this.rok_obrony = rok_obrony;
        this.miejsceObrony = miejsceObrony;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getDataSmierci() {
        return dataSmierci;
    }

    public void setDataSmierci(String dataSmierci) {
        this.dataSmierci = dataSmierci;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public String getMiejsceSmierci() {
        return miejsceSmierci;
    }

    public void setMiejsceSmierci(String miejsceSmierci) {
        this.miejsceSmierci = miejsceSmierci;
    }

    public int getRok_obrony() {
        return rok_obrony;
    }

    public void setRok_obrony(int rok_obrony) {
        this.rok_obrony = rok_obrony;
    }

    public String getMiejsceObrony() {
        return miejsceObrony;
    }

    public void setMiejsceObrony(String miejsceObrony) {
        this.miejsceObrony = miejsceObrony;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia='" + dataUrodzenia + '\'' +
                ", dataSmierci='" + dataSmierci + '\'' +
                ", miejsceUrodzenia='" + miejsceUrodzenia + '\'' +
                ", miejsceSmierci='" + miejsceSmierci + '\'' +
                ", rok_obrony=" + rok_obrony +
                ", miejsceObrony='" + miejsceObrony + '\'' +
                '}';
    }
}
