package modelo;

public class Controle
{
    private Double numero1;
    private Double numero2;
    public String resultado;
    public String num1;
    public String num2;
    public String mensagem;
    
    public void calcularSoma()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            resultado = String.valueOf(numero1 + numero2);
        } 
        catch (Exception e)
        {
            mensagem = "erro de conversão";
        }
    }
    public void calcularSubtracao()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            resultado = String.valueOf(numero1 - numero2);
        } 
        catch (Exception e)
        {
            mensagem = "erro de conversão";
        }
    }
    public void calcularMultiplicacao()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            resultado = String.valueOf(numero1 * numero2);
        } 
        catch (Exception e)
        {
            mensagem = "erro de conversão";
        }
    }
    public void calcularDivisao()
    {
        mensagem = "";
        try
        {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            resultado = String.valueOf(numero1 / numero2);
            
            if (num1.equals("0"))
            {
                mensagem = "impossivel dividir por zero";
            } 
            if (num2.equals("0"))
            {
                mensagem = "impossivel dividir por zero";
            }
        } 
        catch (Exception e)
        {
            mensagem = "erro de conversão";
        }
    }
}
