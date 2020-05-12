//Everlan de Souza Oliveira     RA:31821004
package provad1;

/**
 *
 * @author everlan
 */
public class TrianguloEquilatero  extends Triangulo{

    private final float lado;
    private float perimetro,area;
    
    //Construtor
    public TrianguloEquilatero (float lado){
        this.lado = lado;
    }
    
    //Calculos
    public void calcularPerimetro(){
        this.perimetro = this.lado * 3;
    }
    
    /**
     *
     */
    @Override
    public void calcularArea(){
        this.area = (float) (((this.lado * this.lado)* Math.sqrt(3f))/4);
    }
    
    //Impressão
    public String impresãoTrianguloEquilatero(){
        return "Perimetro: " + this.perimetro + 
               "\nArea: " + this.area;
    }
}
