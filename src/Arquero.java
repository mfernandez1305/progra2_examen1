
public class Arquero extends Personaje{
private int flechas;
Arquero(int vida, int ataque, int flechas){
	this.vida=vida;
	this.ataque=ataque;
	this.flechas=flechas;
	personajes_creados=personajes_creados+1;
}

void poderEspecial(){
	flechas=flechas+5;
}

}
