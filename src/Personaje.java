
public class Personaje {
	protected int vida;
	protected int ataque;
public static int personajes_creados;
	Personaje(){
		
	}
Personaje(int vida, int ataque){
	this.vida=vida;
	this.ataque=ataque;

}
int getVida(){
	return vida;
}
int getAtaque(){
	return ataque;
}
void setVida(int vida){
	this.vida=vida;
}
void setAtaque(int ataque){
	this.ataque=ataque;
}
void poder_Especial(){
	
}

}
