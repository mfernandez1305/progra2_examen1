
public class Tanque extends Personaje {
private boolean escudo_activado;
Tanque(int vida, int ataque, boolean escudo_activado){
	this.vida=vida;
	this.ataque=ataque;
	this.escudo_activado=escudo_activado;
	personajes_creados=personajes_creados+1;
}

void poder_Especial(){
	escudo_activado=true;
}
}
