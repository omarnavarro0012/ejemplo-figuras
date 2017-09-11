/**
 * esta clase representa objetos cuadro con un lado.
 * @author omar navarro 
 * @version 1.0
 */
public class Cuadro extends Figura
{
    private float lado;
    
    public Cuadro(float unlado)
    {
        lado=unlado;
    }
    
    @Override
    public void calculaArea()
    {
        area=lado*lado;
    }
    
    @Override
    public void calculaPeri()
    {
        perimetro=4*lado;
    }
}