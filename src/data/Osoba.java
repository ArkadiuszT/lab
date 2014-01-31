/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Arek
 */
public abstract class Osoba {

    protected String imie;
    protected String nazwisko;
    protected String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    @Override 
   public String toString(){

        return "Osoba{" + "imie:" + imie + "nazwisko:" + nazwisko + "e-mail:" + email + '}'; 
    }

    public abstract  String  generujMail();
     
    
}