package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 1;
    
    int[] vectore;
    int len = 0; 

    public VectorDeInts() {
        vectore = new int[0];
    }

    
    public VectorDeInts(VectorDeInts vector){
        int[] vectorNuevo = new int[vector.vectore.length];
        for(int i = 0; i< vector.vectore.length; i++){
            vectorNuevo[i] = vector.vectore[i];
        }
        vectore = vectorNuevo;
        }
    

    public int longitud(){
        return vectore.length;
    }

    public void agregarAtras(int i) {
        int[] nuevovectore = new int[vectore.length + 1];
        for(int k = 0; k < vectore.length; k++){
             nuevovectore[k] = vectore[k];
        }
        nuevovectore[vectore.length] = i;
        vectore = nuevovectore;
    }

    public int obtener(int i) {
        return vectore[i];
    }

    public void quitarAtras() {
        int[] nuevovectore = new int[vectore.length -1];
        for(int i = 0; i < vectore.length-1;i++){
            nuevovectore[i] = vectore[i];
        }
        vectore = nuevovectore;
    }

    public void modificarPosicion(int indice, int valor) {
       for(int i=0; i < vectore.length; i++){
            if(i==indice){
                vectore[i] = valor;
            }
       }
    }

    public VectorDeInts copiar(){
        VectorDeInts copia = new VectorDeInts();
        copia.vectore = new int[vectore.length];
        copia.len = vectore.length;
        for(int i = 0; i< vectore.length; i++){
            copia.vectore[i] = vectore[i];
        }
        return copia;
    }


    
}
