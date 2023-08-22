package aed;

class Funciones {
    int cuadrado(int x) {
        return x*x;
    }

    double distancia(double x, double y) {
        return Math.sqrt(x*x + y*y);
    }

    boolean esPar(int n) {
        return (n % 2 == 0);
    }

    

    boolean esBisiesto(int n) {
        return ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0));
    }

    int factorialIterativo(int n) {
        
        if(n==0){
            return 1;
        }
        
        int factorial = n;

        for(int i = n -1 ; i>0; i--){
          factorial = factorial*(i);
        }

        return factorial;
    }

    int factorialRecursivo(int n) {
        while(n>0){
            return n*factorialRecursivo(n-1);
        }
        return 1;
    }

    boolean esPrimo(int n) {
        if(n <= 1){
            return false;
        }
        int divisor = n-1;
        while(n % divisor != 0 && divisor >= 0){
            divisor--;
        }
        if (divisor > 1){
            return false;
        }
        else{
            return true;
        }
    }

    int sumatoria(int[] numeros) {
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }

        return suma;
    }

    int busqueda(int[] numeros, int buscado) {
        for(int i = 0 ; i < numeros.length; i++){
            if (numeros[i] == buscado){
                return i;
            }
        }
    
        return -1;
    }

    boolean tienePrimo(int[] numeros) {
        int i = 0;
        while(i<numeros.length){
            if(esPrimo(numeros[i])){
                return true;
            }
            i++;
        }

        return false;

    }

    boolean todosPares(int[] numeros) {
        for(int i = 0; i< numeros.length; i++){
            if(numeros[i] % 2 != 0){
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if(s1.length() <= s2.length()){
            int i = 0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
        }
        
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        if(s1.length() <= s2.length()){
            String sufijo = s2.substring(s2.length()-s1.length(),s2.length());

            return s1.equals(sufijo);

        }
        return false;
    }
}
