//Everlan de Souza Oliveira     RA:31821004
package provad1;

/**
 *
 * @author everlan
 */
public class TesteTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Triangulo Exercicio 1
        Triangulo t = new Triangulo();
        
        //Entrada de dados triangulo
        t.setAltura(10);
        t.setBase(10);
        
        //calculo
        t.calcularArea();
        
        //Impressão do resultados
        System.out.println(t.toString());
        
        //TriaguloEquilatero Exercicio 2
        //Entrada de dados
        TrianguloEquilatero te = new TrianguloEquilatero(10);
        
        //calculos
        te.calcularPerimetro();
        te.calcularArea();
        
        //Impressão
        System.out.println(te.impresãoTrianguloEquilatero());
    }
    
}
