/**
 * esta clase representa objetos triangulo con base y altura.
 * @author omar navarro 
 * @version 1.0
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    
    public Triangulo(float unaBase,float unaAltura)
    {
        base=unaBase;
        altura=unaAltura;
    }
    
    @Override
    public void calculaArea()
    {
        area=(base*altura)/2;
    }
    
    
    public void calculaPeri(float cateOP,float cateAD,float hipo)
    {
        perimetro=cateOP+cateAD+hipo;
    }
}