
public class Guerrero extends Personaje{
	
Guerrero(int vida, int ataque){
	super(vida, ataque);

	personajes_creados=personajes_creados+1;
}
void poder_Especial(){
	vida=vida/2;
	ataque=ataque*2;
}

}
