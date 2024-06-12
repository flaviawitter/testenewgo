public class Senha{

    private String conteudo;
    private String novaSenha;

    public Conteudo (String conteudo){
        this.conteudo = conteudo;
    }

    public String getConteudo(){
        return conteudo;
    }

    public void setConteudo(String conteudo){
        if (validarSenha(conteudo)){
            this.conteudo = conteudo;
        }
        else{
            System.out.println("A senha não atende as especificações.");
        }
    }

    private void tamanhoSenha (String conteudo){
        int n;
        if (conteudo.length() >= 10 && conteudo.length() <=30){
            return n=1;
        } 
        else{
            return n=0;
        }
    }

    private void caracteresSenha (String conteudo){
        int maiuscula = 0, minuscula = 0, numero = 0, simbolo =0;
        for (i=0; i< conteudo.length(); i++){
        char c = conteudo.charAt(i)
        if (Character.isUpperCase(c)){
            maiuscula++;
        }
        else if (Character.isLowerCase(c)){
            minuscula++
        }
        else if (Character.isDigit(c)) {
            numero++            
        }
        else{
            simbolo++
        }
        }
    }

    private boolean validarSenha (String conetudo){
        if (maiuscula != 0 && minuscula != 0 && numero != 0 && simbolo != 0 && n==1){
            return 1;
        }
        else{
            return 0;
        }
    }

    public void alterarSenha(String conteudo){
        if (validarSenha(novaSenha)){
            setConteudo(novaSenha);
        }
        else {
            System.out.println("A nova senha não atende as especificações.");
        }

    }
}