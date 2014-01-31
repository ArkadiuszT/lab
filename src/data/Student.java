package data;

/**
 * 
 * @author Arek
 */

public class Student extends Osoba {

	private double sredniaOcen;
	
	public Student(double sredniaOcen) throws MyException{
		setSredniaOcen(sredniaOcen);
	}
	
	@Override
	public String generujMail() {
		return imie + "." + nazwisko + "@student.uczelnia.pl";
	}
	
	public double getSredniaOcen() {
		return sredniaOcen;
	}

	public void setSredniaOcen(double sredniaOcen) throws MyException {
		
		if(sredniaOcen >= 2.0 && sredniaOcen <= 5.0){
			this.sredniaOcen = sredniaOcen;
		} else {
			throw new MyException("Nieprawid³owa œrednia");
		}
	}
}
