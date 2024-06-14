package Clases;

public class Mian {
    public static void main(String[] args){
        System.out.println("------------------------------");
        System.out.println("Nulo y seteados");
        UIO_GYE t1 = new UIO_GYE();
        UIO_RIO t2 = new UIO_RIO();
        UIO_GYE_VIP t3 = new UIO_GYE_VIP();
        UIO_PUY_VIP t4 = new UIO_PUY_VIP();
        UIO_PUY t5 = new UIO_PUY();

        informacionPajaero i1 = new informacionPajaero(123344,"Juan Perez", 30,"qwe@asd.com");


        t1.setNumeroTicket(123);
        t1.setAsiento(2);
        t1.setMaleta("MANO");
        t1.setAdiccional("SI");
        t1.setPrecio(20);
        t1.setPrecioMaleta(5);
        i1.info();
        t1.calcularCosto();
        t1.mostrarInformacion();

        t2.setNumeroTicket(123);
        t2.setAsiento(2);
        t2.setMaleta("MANO");
        t2.setAdiccional("NO");
        t2.setPrecio(17.50);
        t2.setPrecioMaleta(0);
        i1.info();
        t2.calcularCosto();
        t2.mostrarInformacion();

        t3.setNumeroTicket(123);
        t3.setAsiento(2);
        t3.setAdiccionalServicios1("SI");
        t3.setAdiccionalServicios2("NO");
        t3.setAdiccionalMaleta("SI");
        t3.setBase(20);
        t3.setPrecio1Add(3);
        t3.setPrecio2Add(0);
        t3.setAddMaletaPrecio(5);
        i1.info();
        t3.calcularCosto();
        t3.mostrarInformacion();

        t4.setNumeroTicket(123);
        t4.setAsiento(2);
        t4.setAdiccionalServicios1("NO");
        t4.setAdiccionalServicios2("NO");
        t4.setAdiccionalMaleta("SI");
        t3.setBase(15);
        t4.setPrecio1Add(0);
        t4.setPrecio2Add(0);
        t4.setAddMaletaPrecio(5);
        i1.info();
        t4.calcularCosto();
        t4.mostrarInformacion();

        t5.setNumeroTicket(123);
        t5.setAsiento(2);
        t5.setMaleta("MANO");
        t5.setAdiccional("NO");
        t5.setPrecio(15);
        t5.setPrecioMaleta(0);
        i1.info();
        t5.calcularCosto();
        t5.mostrarInformacion();


        System.out.println("------------------------------");
        System.out.println("Quemados");
        UIO_GYE t6 = new UIO_GYE(123, 2, "MANO","NO", 20, 0 );
        UIO_PUY t7 = new UIO_PUY(124,4,"MANO","SI",15, 5);
        UIO_RIO_VIP t8 = new UIO_RIO_VIP(125, 5,"SI", "SI", "NO", 17.50, 2, 1, 0);
        UIO_PUY_VIP t9 = new UIO_PUY_VIP(123, 5,"SI", "SI", "NO", 15, 2, 1, 0);
        UIO_TUL t10  = new UIO_TUL(124,6,"MANO", "NO", 17.50, 5 );

        i1.info();
        t6.calcularCosto();
        t6.mostrarInformacion();
        i1.info();
        t7.calcularCosto();
        t7.mostrarInformacion();
        i1.info();
        t8.calcularCosto();
        t8.mostrarInformacion();
        i1.info();
        t9.calcularCosto();
        t9.mostrarInformacion();
        i1.info();
        t10.calcularCosto();
        t10.mostrarInformacion();


    }
}
