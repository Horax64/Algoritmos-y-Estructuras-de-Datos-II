package aed;

public class Fecha {
    int díaAgenda;
    int mesAgenda;
    public Fecha(int dia, int mes) {
        díaAgenda = dia;
        mesAgenda = mes;
    }

    public Fecha(Fecha fecha) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public Integer dia() {
        return díaAgenda;
    }

    public Integer mes() {
        return mesAgenda;
    }

    public String toString(){
        return díaAgenda + "/" + mesAgenda;
    }

    @Override
    public boolean equals(Object otra) {
        if( );
    }

    public void incrementarDia() {
        if(díaAgenda == diasEnMes(mesAgenda)){
            díaAgenda = 1;
        }
        else{
            díaAgenda+=1;
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
