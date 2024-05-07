public class verificarNumero {
    public static void main(String[] args) {
        try {
            verifica(20, 12);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O SEGUNDO número deve ser maior que o PRIMEIRO");
        }
    }

    static void verifica(int n1, int n2) throws ParametrosInvalidosException{
        if (n1>n2) {
            throw new ParametrosInvalidosException();
        }else{
            int resultado = n2-n1;
            System.out.println("Contagem:");
            for(int x = 1; x<=resultado;x++){
                System.out.println(x);
            }
        }
    }
}
