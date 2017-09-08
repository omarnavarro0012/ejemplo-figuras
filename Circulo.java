/**
 * esta clase representa objetos circulo con un radio.
 * @author omar navarro 
 * @version 1.0
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    
    @Override
    public void calculaArea()
    {
        area= 3.14f * radio * radio;
    }
}