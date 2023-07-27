package student;// pacote ao qual a classe pertence

// Classe = estudante
public class Student {
	
	// Atributos da classe estudante
	private int studentId;
	private String name;
	private String ssn;
	private double gpa; 
	
	//construtor: é o primeiro a ser executado quando criamos um objeto estudante
	public Student(int studentId, String name, String ssn){
		this.studentId = studentId;
		this.name = name;
		this.ssn = ssn;
			
		
	//Métodos Getters e Setters: dão acesso aos atributos, pois eles são privados
	}
	
	public String getName() {
		return this.name;
		
	} 
	
	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	//Mostra todos os atributos da classe
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", ssn=" + ssn + ", gpa=" + gpa + "]";
	}
	

}