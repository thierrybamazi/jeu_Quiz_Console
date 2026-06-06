//classe joueur
class joueur{

private String nom;
private int score;

public joueur(String nom){
this.nom = nom;
this.score = 0;
}

public void ajouterPoint(){
score++;
}

public int getScore(){
return score;
}

public String getNom(){
return nom;
}
}
