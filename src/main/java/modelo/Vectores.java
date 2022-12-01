package modelo;
public class Vectores {

    public static void main(String[] args) {
        Maletas vec[]=new Maletas[5];
        vec[0]=new Maletas("MT0","Aviator",124.9,63.5,30.9,29.2);
        vec[1]=new Maletas("MT1","Century",174.9,75.0,28.5,30.0);
        vec[2]=new Maletas("MT2","Benneton",159.9,65.2,31.2,29.4);
        vec[3]=new Maletas("MT3","Lucas",99.9,45.0,70.0,25.0);
        vec[4]=new Maletas("MT4","Samsonite",84.9,50.2,60.4,25.0);
        
        //Listado de maletas en vista para consola
        System.out.println("Código \t Modelo \tPrecio\t Ancho \t Alto \t Fondo");
        System.out.println("-------------------------------------------------------");
        for(Maletas x:vec){
            System.out.println(x.getCodigo()+" \t "+x.getModelo()+" \t "+x.getPrecio()
                    + "\t "+x.getAncho()+" \t "+x.getAlto()+" \t "+x.getFondo());
        }
    }
}
