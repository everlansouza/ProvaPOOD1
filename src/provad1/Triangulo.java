//Everlan de Souza Oliveira     RA:31821004
package provad1;

/**
 *
 * @author everlan
 */
public class Triangulo {

    private float base, altura, area;
    
    //Calculos
    public void calcularArea(){
        area = (base * altura) /2;
    }
    
    //Entrada de dados
    public void setBase(float base){
        this.base = base;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    //Saida de dados
    public float getBase(){
        return this.base;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Base: " + this.base +
               "\nAltura: " + this.altura +
               "\nArea do triangulo:" + this.area;
    }
}
