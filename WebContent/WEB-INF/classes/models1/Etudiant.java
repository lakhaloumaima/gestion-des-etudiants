package models;
public class Etudiant{
	private int id;
	private String nom;
	private String prenon;
	private String classe;
	
	public Etudiant(int id,String nom,String prenom,String classe) {
		this.id=id;
		this.nom=nom;
		this.prenon=prenom;
		this.classe=classe;
		
	}
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenon() {
		return prenon;
	
	}
	public String getClasse() {
		return classe;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenon(String prenon) {
		this.prenon=prenon;
	}
	public void SetClass(String classes) {
		this.classe = classe;
	}
}