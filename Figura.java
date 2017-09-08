/**
 * Esta clase es un super clase para representar las caracteristicas
 * comunes de muchas figuras.
 * 
 * @author Omar navarro.
 * @version 1.0 
 */
public class Figura
{
    protected float area;//area de cada figura.
    
    /**
     * constrcutor de la clase figura.
     */
    public Figura()
    {
        area=0;
    }
    
    /**
     * Calcula el area de cada figura.
     */
    public void calculaArea()
    {
        System.out.println("no se puede calcular area por que no se de que figura es");
    }
    
    /**
     * 
     */
    public void imprimirArea()
    {
        System.out.println("el area de la figura es: "+area);
    }
}