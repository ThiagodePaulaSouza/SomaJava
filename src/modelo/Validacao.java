
package modelo;

public class Validacao
{
    public String num1;
    public String num2;
    public Double numero1;
    public Double numero2;
    public String mensagem;
    public String operacao;
    
    public void validar()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            if(operacao.equals("/"))
                if(numero1.equals(0.0) || numero2.equals(0.0))
                    mensagem = "Impossivel Dividir por zero";
                
        } 
        catch (Exception e)
        {
            mensagem = "erro de conversão";
        }
        
    }
}
