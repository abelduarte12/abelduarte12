
package modelo;

public class Maletas {

    private String codigo;
    private String modelo;
    private double precio;
    private double ancho;
    private double alto;
    private double fondo;
    String contador;
    public Maletas() {
    }

    public Maletas(String codigo, String modelo, double precio, double ancho, double alto, double fondo) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.precio = precio;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }
    public Maletas(String contador){
        this.contador=contador;
    }
    

    public double getFondo() {
        return fondo;
    }
    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    // Datos mínimos del primer modelo
    public  String codigo0 = "MT0";
    public  String modelo0 = "Aviator";
    public  double precio0 = 124.9;
    public static double ancho0 = 63.5;
    public static double alto0 = 30.9;
    public static double fondo0 = 29.2;
    
    // Datos mínimos del segundo modelo
    public  String codigo1 = "MT1";
    public  String modelo1 = "Century";
    public  double precio1 = 174.9;
    public static double ancho1 = 75.0;
    public static double alto1 = 28.5;
    public static double fondo1 = 30.0;
    
    // Datos mínimos del tercer modelo
    public  String codigo2 = "MT2";
    public  String modelo2 = "Benneton";
    public  double precio2 = 159.9;
    public static double ancho2 = 65.2;
    public static double alto2 = 31.2;
    public static double fondo2 = 29.4;
    
    // Datos mínimos del cuarto modelo
    public  String codigo3 = "MT3";
    public  String modelo3 = "Lucas";
    public  double precio3 = 99.9;
    public static double ancho3 = 45.0;
    public static double alto3 = 70.0;
    public static double fondo3 = 25.0;
    
    // Datos mínimos del quinto modelo
    public  String codigo4 = "MT4";
    public  String modelo4 = "Samsonite";
    public  double precio4 = 84.9;
    public static double ancho4 = 50.2;
    public static double alto4 = 60.4;
    public static double fondo4 = 25.0;
    
    // Porcentajes de descuento
    public static double porcentaje1 = 4.0;
    public static double porcentaje2 = 5.5;
    public static double porcentaje3 = 7.0;
    public static double porcentaje4 = 8.5;
    
    // Cantidad óptima de maletas vendidas
    public static int cantidadOptima = 50;
    
    // Cantidad mínima de maletas adquiridas para obtener el obsequio
    public static int cantidadMinima = 20;
    
    // Obsequio
    public  String obsequio = "USB";
    
    // Número de cliente que recibe el premio sorpresa
    public static int numeroClientePremiado = 5;
    
    // Premio sorpresa
    public  String premioSorpresa = "Una agenda";
    
    public double preciopromedio(){
        double suma=precio0+precio1+precio2+precio3+precio4;
        double respuesta=suma/5;
        return respuesta;
    }
    public double anchopromedio(){
        double suma=ancho0+ancho1+ancho2+ancho3+ancho4;
        double respuesta=suma/5;
        return respuesta;
    }
    public double altoPromedio(){
        double suma=alto0+alto1+alto2+alto3+alto4;
        double respuesta=suma/5;
        return respuesta;
    }
    public double fondoPromedio(){
        double suma=fondo0+fondo1+fondo2+fondo3+fondo4;
        double respuesta=suma/5;
        return respuesta;
    }
    public double precioMaximo(){
        double maximo=0;
        if(precio0>precio1 &&precio0>precio2 && precio0>precio3 && precio0>precio4){
            maximo=precio0;
        }
        else if(precio1>precio0 &&precio1>precio2 && precio1>precio3   &&precio1>precio4){
            maximo = precio1;
        }
        else if(precio2>precio0 && precio2>precio1 && precio2>precio3 && precio2>precio4 ){
            maximo=precio2;
        }
        else if(precio4>precio0 && precio4>precio1 && precio4>precio2 && precio4>precio3){
            maximo=precio4;
        }
        return maximo;
    }
    public double precioMinimo(){
        double minimo=0;
        if(precio0<precio1 &&precio0<precio2 && precio0<precio3 && precio0<precio4){
            minimo=precio0;
        }
        else if(precio1<precio0 &&precio1<precio2 && precio1<precio3   &&precio1<precio4){
            minimo = precio1;
        }
        else if(precio2<precio0 && precio2<precio1 && precio2<precio3 && precio2<precio4 ){
            minimo=precio2;
        }
        else if(precio4<precio0 && precio4<precio1 && precio4<precio2 && precio4<precio3){
            minimo=precio4;
        }
        return minimo;
        
    }
    public double anchoMaximo(){
        double maximo=0;
        if(ancho0>ancho1 && ancho0>ancho2 && ancho0>ancho3 && ancho0>ancho4){
            maximo=ancho0;
        }
        else if(ancho1>ancho0 && ancho1>ancho2 && ancho1>ancho3 && ancho1>ancho4){
            maximo=ancho1;
        }
        else if(ancho2>ancho0 && ancho2>ancho1 && ancho2>ancho3 && ancho2>ancho4){
            maximo=ancho2;
        }
        else if(ancho3>ancho0 && ancho3>ancho1 && ancho3>ancho2 && ancho3>ancho4){
            maximo=ancho3;
        }
        else if(ancho4>ancho0 && ancho4>ancho1 && ancho4>ancho2 && ancho4>ancho3){
            maximo=ancho4;
        }
        return maximo;
    }
    public double anchoMinimo(){
        double minimo=0;
        
        if(ancho0<ancho1 && ancho0<ancho2 && ancho0<ancho3 && ancho0<ancho4){
            minimo=ancho0;
        }
        else if(ancho1<ancho0 && ancho1<ancho2 && ancho1<ancho3 && ancho1<ancho4){
            minimo=ancho1;
        }
        else if(ancho2<ancho0 && ancho2<ancho1 && ancho2<ancho3 && ancho2<ancho4){
            minimo=ancho2;
        }
        else if(ancho3<ancho0 && ancho3<ancho1 && ancho3<ancho2 && ancho3<ancho4){
            minimo=ancho3;
        }
        else if(ancho4<ancho0 && ancho4<ancho1 && ancho4<ancho2 && ancho4<ancho3){
            minimo=ancho4;
        }
        return minimo;
    }
    public double altoMaximo(){
        double maximo=0;
        if(alto0>alto1 && alto0>alto2 && alto0>alto3 && alto0>alto4){
            maximo=alto0;
        }
        else if(alto1>alto0 && alto1>alto2 && alto1>alto3 && alto1>alto4){
            maximo=alto1;
        }
        else if(alto2>alto0 &&alto2>alto1 &&alto2>alto3 &&alto2>alto4){
            maximo=alto2;
        }
        else if(alto3>alto0&&alto3>alto1&&alto3>alto2 && alto3>alto4){
            maximo=alto3;
        }
        else if(alto4>alto0 && alto4>alto1 && alto4>alto2 && alto4>alto3){
            maximo=alto4;
        }
        return maximo;
    }
    public double altoMinimo(){
        double minimo=0;
        if(alto0<alto1 && alto0<alto2 && alto0<alto3 && alto0<alto4){
            minimo=alto0;
        }
        else if(alto1<alto0 && alto1<alto2 && alto1<alto3 && alto1<alto4){
            minimo=alto1;
        }
        else if(alto2<alto0 &&alto2<alto1 &&alto2<alto3 &&alto2<alto4){
            minimo=alto2;
        }
        else if(alto3<alto0&&alto3<alto1&&alto3<alto2 && alto3<alto4){
            minimo=alto3;
        }
        else if(alto4<alto0 && alto4<alto1 && alto4<alto2 && alto4<alto3){
            minimo=alto4;
        }
        return minimo;
    }
    
    
    public double fondoMaximo(){
        double maximo=0;
        if(fondo0>fondo1 &&fondo0>fondo2 &&fondo0>fondo3 &&fondo0>fondo4){
            maximo=fondo0;
        }
        else if(fondo1>fondo0&&fondo1>fondo2&&fondo1>fondo3&&fondo1>fondo4){
            maximo=fondo1;
        }
        else if(fondo2>fondo0 && fondo2>fondo1 &&fondo2>fondo3 && fondo2>fondo4){
            maximo=fondo2;
        }
        else if(fondo3>fondo0 && fondo3>fondo1 && fondo3>fondo2 && fondo3>fondo4){
            maximo=fondo3;
        }
        else if(fondo4>fondo0 && fondo4>fondo1 && fondo4>fondo2 && fondo4>fondo3){
            maximo=fondo4;
        }
        return maximo;
    }
    public double fondoMinimo(){
        double minimo=25;
        if(fondo0<fondo1 &&fondo0<fondo2 &&fondo0<fondo3 &&fondo0<fondo4){
            minimo=fondo0;
        }
        else if(fondo1<fondo0&&fondo1<fondo2&&fondo1<fondo3&&fondo1<fondo4){
            minimo=fondo1;
        }
        else if(fondo2<fondo0 && fondo2<fondo1 &&fondo2<fondo3 && fondo2<fondo4){
            minimo=fondo2;
        }
        else if(fondo3<fondo0 && fondo3<fondo1 && fondo3<fondo2 && fondo3<fondo4){
            minimo=fondo3;
        }
        else if(fondo4<fondo0 && fondo4<fondo1 && fondo4<fondo2 && fondo4<fondo3){
            minimo=fondo4;
        }
        return minimo;
    }
    
    public double PrecioMayorPromedio(){
        double mayor=0;
        if(precio0>preciopromedio()){
            mayor=precio0;
        }else if(precio1>preciopromedio()){
            mayor=precio1;
        }else if(precio2>preciopromedio()){
            mayor=precio2;
        }else if(precio3>preciopromedio()){
            mayor=precio3;
        }else if(precio4>preciopromedio()){
            mayor=precio4;
        }
        return mayor;
    }
    
    public double PrecioMayorPromedio2(){
        double mayor=0;
        if(precio0>preciopromedio()){
            mayor=precio0;
        }else if(precio2>preciopromedio()){
            mayor=precio2;
        }else if(precio3>preciopromedio()){
            mayor=precio3;
        }else if(precio4>preciopromedio()){
            mayor=precio4;
        }
        return mayor;
    }
    public double PrecioMenorPromedio(){
        double menor=0;
        if(precio0<preciopromedio()){
            menor=precio0;
        }else if(precio1<preciopromedio()){
            menor=precio1;
        }else if(precio2<preciopromedio()){
            menor=precio2;
        }else if(precio3<preciopromedio()){
            menor=precio3;
        }else if(precio4<preciopromedio()){
            menor=precio4;
        }
        return menor;
    }
    
    public double PrecioMenorPromedio2(){
        double menor=0;
        if(precio0<PrecioMenorPromedio()){
            menor=precio0;
        }else if(precio2<PrecioMenorPromedio()){
            menor=precio2;
        }else if(precio3<PrecioMenorPromedio()){
            menor=precio3;
        }else if(precio4<PrecioMenorPromedio()){
            menor=precio4;
        }
        return menor;
    }
    public double PrecioMenorPromedio3(){
        double menor=0;
        if(precio0<PrecioMenorPromedio2()){
            menor=precio0;
        }else if(precio2<PrecioMenorPromedio2()){
            menor=precio2;
        }else if(precio3<PrecioMenorPromedio2()){
            menor=precio3;
        }else if(precio4<PrecioMenorPromedio2()){
            menor=precio4;
        }
        return menor;
    }
    
}




