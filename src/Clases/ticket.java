package Clases;

import javax.swing.plaf.PanelUI;

public class ticket {
    public int numeroTicket;
    public int asiento;

    public ticket (int numeroTicket, int asiento){
        this.numeroTicket = numeroTicket;
        this.asiento = asiento;
    }
    public ticket(){}

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }


    public void mostrarInformacion(){
        System.out.println("Numero de ticket : " + getNumeroTicket());
        System.out.println("Numero de asiento : " + getAsiento());
    }
    public void calcularCosto(){

    }
}

class normal extends ticket{
    public String maleta;
    public String adiccional;

    public normal(int numeroTicket, int asiento, String maleta, String adicional){
        super(numeroTicket, asiento);
        this.maleta = maleta;
        this.adiccional = adicional;
    }
    public normal(){}

    public String getMaleta() {
        return maleta;
    }

    public void setMaleta(String maleta) {
        this.maleta = maleta;
    }

    public String getAdiccional() {
        return adiccional;
    }

    public void setAdiccional(String adiccional) {
        this.adiccional = adiccional;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Maleta: " + getMaleta());
        System.out.println("Maleta adiccional:" +getAdiccional());
    }
    @Override
    public void calcularCosto(){

    }
}


class UIO_GYE extends normal{
    public double precio;
    public double precioMaleta;
    public double Final;

    public UIO_GYE(int numeroTicket, int asiento, String maleta, String adicional,
                   double precio, double precioMaleta){
        super(numeroTicket, asiento, maleta, adicional);
        this.precio = precio;
        this.precioMaleta = precioMaleta;
    }
    public UIO_GYE(){

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioMaleta() {
        return precioMaleta;
    }

    public void setPrecioMaleta(double precioMaleta) {
        this.precioMaleta = precioMaleta;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Guayaquil");
        super.mostrarInformacion();
        System.out.println("Costo base del viaje: " + getPrecio());
        System.out.println("Costo Maleta adiccional:" +getPrecioMaleta());
        System.out.println("Costo FINAL: " + getFinal());
    }

    @Override
    public void calcularCosto(){
        double f = getPrecio() + getPrecioMaleta();
        setFinal(f);
    }

}

class UIO_TUL extends normal{
    public double precio;
    public double precioMaleta;
    public double Final;
    public UIO_TUL(int numeroTicket, int asiento, String maleta, String adicional,
                   double precio, double precioMaleta){
        super(numeroTicket, asiento, maleta, adicional);
        this.precio = precio;
        this.precioMaleta = precioMaleta;
    }
    public UIO_TUL(){}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioMaleta() {
        return precioMaleta;
    }

    public void setPrecioMaleta(double precioMaleta) {
        this.precioMaleta = precioMaleta;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Tulcan");
        super.mostrarInformacion();
        System.out.println("Costo base del viaje: " + getPrecio());
        System.out.println("Costo Maleta adiccional:" +getPrecioMaleta());
        System.out.println("Costo FINAL: " + getFinal());
    }

    @Override
    public void calcularCosto(){
        double f = getPrecio() + getPrecioMaleta();
        setFinal(f);
    }
}

class UIO_PUY extends normal{
    public double precio;
    public double precioMaleta;
    public double Final;
    public UIO_PUY(int numeroTicket, int asiento, String maleta, String adicional,
                   double precio, double precioMaleta){
        super(numeroTicket, asiento, maleta, adicional);
        this.precio = precio;
        this.precioMaleta = precioMaleta;
    }
    public UIO_PUY(){}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioMaleta() {
        return precioMaleta;
    }

    public void setPrecioMaleta(double precioMaleta) {
        this.precioMaleta = precioMaleta;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Puyo");
        super.mostrarInformacion();
        System.out.println("Costo base del viaje: " + getPrecio());
        System.out.println("Costo Maleta adiccional:" +getPrecioMaleta());
        System.out.println("Costo FINAL: " + getFinal());
    }

    @Override
    public void calcularCosto(){
        double f = getPrecio() + getPrecioMaleta();
        setFinal(f);
    }
}

class UIO_RIO extends normal{
    public double precio;
    public double precioMaleta;
    public double Final;
    public UIO_RIO(int numeroTicket, int asiento, String maleta, String adicional,
                   double precio, double precioMaleta){
        super(numeroTicket, asiento, maleta, adicional);
        this.precio = precio;
        this.precioMaleta = precioMaleta;
    }
    public UIO_RIO(){}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioMaleta() {
        return precioMaleta;
    }

    public void setPrecioMaleta(double precioMaleta) {
        this.precioMaleta = precioMaleta;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Riobamba");
        super.mostrarInformacion();
        System.out.println("Costo base del viaje: " + getPrecio());
        System.out.println("Costo Maleta adiccional:" +getPrecioMaleta());
        System.out.println("Costo FINAL: " + getFinal());
    }

    @Override
    public void calcularCosto(){
        double f = getPrecio() + getPrecioMaleta();
        setFinal(f);
    }
}

class vip extends ticket{
    public String adiccionalServicios1;
    public String adiccionalServicios2;
    public String adiccionalMaleta;

    public vip(int numeroTicket, int asiento,String adiccionalServicios1, String adiccionalServicios2,
               String adiccionalMaleta){
        super(numeroTicket, asiento);
        this.adiccionalServicios1 = adiccionalServicios1;
        this.adiccionalServicios2 = adiccionalServicios2;
    }
    public vip(){}

    public String getAdiccionalServicios1() {
        return adiccionalServicios1;
    }

    public void setAdiccionalServicios1(String adiccionalServicios1) {
        this.adiccionalServicios1 = adiccionalServicios1;
    }

    public String getAdiccionalServicios2() {
        return adiccionalServicios2;
    }

    public void setAdiccionalServicios2(String adiccionalServicios2) {
        this.adiccionalServicios2 = adiccionalServicios2;
    }

    public String getAdiccionalMaleta() {
        return adiccionalMaleta;
    }

    public void setAdiccionalMaleta(String adiccionalMaleta) {
        this.adiccionalMaleta = adiccionalMaleta;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Servicio adiccional 1: " + getAdiccionalServicios1());
        System.out.println("Serivicio adicional 2:" + getAdiccionalServicios2());
        System.out.println("Maleta adiccional:" +getAdiccionalMaleta());
    }
    @Override
    public void calcularCosto(){

    }
}

class UIO_GYE_VIP extends vip{
    public double base;
    public double precio1Add;
    public double precio2Add;
    public double AddMaletaPrecio;
    public double Final;
    public UIO_GYE_VIP(){}
    public UIO_GYE_VIP(int numeroTicket, int asiento,String adiccionalServicios1, String adiccionalServicios2,
                       String adiccionalMaleta,double base, double precio1Add, double precio2Add, double AddMaletaPrecio){
        super(numeroTicket, asiento, adiccionalServicios1, adiccionalServicios2, adiccionalMaleta);
        this.base =base;
        this.precio1Add = precio1Add;
        this.precio2Add = precio2Add;
        this.AddMaletaPrecio = AddMaletaPrecio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPrecio1Add() {
        return precio1Add;
    }

    public void setPrecio1Add(double precio1Add) {
        this.precio1Add = precio1Add;
    }

    public double getPrecio2Add() {
        return precio2Add;
    }

    public void setPrecio2Add(double precio2Add) {
        this.precio2Add = precio2Add;
    }

    public double getAddMaletaPrecio() {
        return AddMaletaPrecio;
    }

    public void setAddMaletaPrecio(double addMaletaPrecio) {
        AddMaletaPrecio = addMaletaPrecio;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Guayaquil VIP");
        super.mostrarInformacion();
        System.out.println("Costo base + 30%: " + getBase());
        System.out.println("Costo servicio adicional 1: " + getPrecio1Add());
        System.out.println("Costo serivicio adicional 2:" + getPrecio2Add());
        System.out.println("Costo maleta adiccional:" + getAddMaletaPrecio());
    }

    @Override
    public void calcularCosto(){
        double f = getBase() + (getBase() * 0.30);
        setBase(f);

        double pf = getBase() + getPrecio1Add() +getPrecio2Add() + getAddMaletaPrecio();
        setFinal(pf);
    }
}

class UIO_TUL_VIP extends vip{
    public double base;
    public double precio1Add;
    public double precio2Add;
    public double AddMaletaPrecio;
    public double Final;
    public UIO_TUL_VIP(){}
    public UIO_TUL_VIP(int numeroTicket, int asiento,String adiccionalServicios1, String adiccionalServicios2,
                       String adiccionalMaleta,double base, double precio1Add, double precio2Add, double AddMaletaPrecio){
        super(numeroTicket, asiento, adiccionalServicios1, adiccionalServicios2, adiccionalMaleta);
        this.base =base;
        this.precio1Add = precio1Add;
        this.precio2Add = precio2Add;
        this.AddMaletaPrecio = AddMaletaPrecio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPrecio1Add() {
        return precio1Add;
    }

    public void setPrecio1Add(double precio1Add) {
        this.precio1Add = precio1Add;
    }

    public double getPrecio2Add() {
        return precio2Add;
    }

    public void setPrecio2Add(double precio2Add) {
        this.precio2Add = precio2Add;
    }

    public double getAddMaletaPrecio() {
        return AddMaletaPrecio;
    }

    public void setAddMaletaPrecio(double addMaletaPrecio) {
        AddMaletaPrecio = addMaletaPrecio;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Tulcan VIP");
        super.mostrarInformacion();
        System.out.println("Costo base + 30%: " + getBase());
        System.out.println("Costo servicio adicional 1: " + getPrecio1Add());
        System.out.println("Costo serivicio adicional 2:" + getPrecio2Add());
        System.out.println("Costo maleta adiccional:" + getAddMaletaPrecio());
    }

    @Override
    public void calcularCosto(){
        double f = getBase() + (getBase() * 0.30);
        setBase(f);

        double pf = getBase() + getPrecio1Add() +getPrecio2Add() + getAddMaletaPrecio();
        setFinal(pf);
    }
}

class UIO_PUY_VIP extends vip{
    public double base;
    public double precio1Add;
    public double precio2Add;
    public double AddMaletaPrecio;
    public double Final;

    public UIO_PUY_VIP(int numeroTicket, int asiento,String adiccionalServicios1, String adiccionalServicios2,
                       String adiccionalMaleta,double base, double precio1Add, double precio2Add, double AddMaletaPrecio){
        super(numeroTicket, asiento, adiccionalServicios1, adiccionalServicios2, adiccionalMaleta);
        this.base =base;
        this.precio1Add = precio1Add;
        this.precio2Add = precio2Add;
        this.AddMaletaPrecio = AddMaletaPrecio;
    }
    public UIO_PUY_VIP(){}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPrecio1Add() {
        return precio1Add;
    }

    public void setPrecio1Add(double precio1Add) {
        this.precio1Add = precio1Add;
    }

    public double getPrecio2Add() {
        return precio2Add;
    }

    public void setPrecio2Add(double precio2Add) {
        this.precio2Add = precio2Add;
    }

    public double getAddMaletaPrecio() {
        return AddMaletaPrecio;
    }

    public void setAddMaletaPrecio(double addMaletaPrecio) {
        AddMaletaPrecio = addMaletaPrecio;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Puyo VIP");
        super.mostrarInformacion();
        System.out.println("Costo base + 30%: " + getBase());
        System.out.println("Costo servicio adicional 1: " + getPrecio1Add());
        System.out.println("Costo serivicio adicional 2:" + getPrecio2Add());
        System.out.println("Costo maleta adiccional:" + getAddMaletaPrecio());
    }

    @Override
    public void calcularCosto(){
        double f = getBase() + (getBase() * 0.30);
        setBase(f);

        double pf = getBase() + getPrecio1Add() +getPrecio2Add() + getAddMaletaPrecio();
        setFinal(pf);
    }
}

class UIO_RIO_VIP extends vip{
    public double base;
    public double precio1Add;
    public double precio2Add;
    public double AddMaletaPrecio;
    public double Final;

    public UIO_RIO_VIP(int numeroTicket, int asiento,String adiccionalServicios1, String adiccionalServicios2,
                       String adiccionalMaleta,double base, double precio1Add, double precio2Add, double AddMaletaPrecio){
        super(numeroTicket, asiento, adiccionalServicios1, adiccionalServicios2, adiccionalMaleta);
        this.base =base;
        this.precio1Add = precio1Add;
        this.precio2Add = precio2Add;
        this.AddMaletaPrecio = AddMaletaPrecio;
    }
    public UIO_RIO_VIP(){}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPrecio1Add() {
        return precio1Add;
    }

    public void setPrecio1Add(double precio1Add) {
        this.precio1Add = precio1Add;
    }

    public double getPrecio2Add() {
        return precio2Add;
    }

    public void setPrecio2Add(double precio2Add) {
        this.precio2Add = precio2Add;
    }

    public double getAddMaletaPrecio() {
        return AddMaletaPrecio;
    }

    public void setAddMaletaPrecio(double addMaletaPrecio) {
        AddMaletaPrecio = addMaletaPrecio;
    }

    public double getFinal() {
        return Final;
    }

    public void setFinal(double aFinal) {
        Final = aFinal;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Viajer de Quito a Riobamba VIP");
        super.mostrarInformacion();
        System.out.println("Costo base + 30%: " + getBase());
        System.out.println("Costo servicio adicional 1: " + getPrecio1Add());
        System.out.println("Costo serivicio adicional 2:" + getPrecio2Add());
        System.out.println("Costo maleta adiccional:" + getAddMaletaPrecio());
    }

    @Override
    public void calcularCosto(){
        double f = getBase() + (getBase() * 0.30);
        setBase(f);

        double pf = getBase() + getPrecio1Add() +getPrecio2Add() + getAddMaletaPrecio();
        setFinal(pf);
    }
}


class informacionPajaero{
    public int cedula;
    public String nombre;;
    public int edad;
    public String correo;
    public informacionPajaero(int cedula, String nombre, int edad, String correo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void info(){
        System.out.println("Cedula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Correo: " + getCorreo());
    }

}

