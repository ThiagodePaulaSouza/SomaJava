
package modelo;

public class Validacao extends absPropriedades
{
     

    public Validacao(String num1, String num2, String operacao)
    {
        this.num1 = num1.replaceAll(",", ".");
        this.num2 = num2.replaceAll(",", ".");
        this.operacao = operacao;
        this.validar();
    }
    
    
    
    
    private void validar()
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
