package Simulacro02;

import com.jd.examen.*;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Simulacro01 {
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero("Miguel");
        Cocinero cocinero2 = new Cocinero("Joaquin");

        LibroCocina receta1 = LibroCocina.getLibro("Recetas caseras");
        LibroCocina receta2 = LibroCocina.getLibro("Recetas fáciles");
        LibroCocina receta3 = LibroCocina.getLibro("Comida Rápida");

        Receta polloPatatas = receta1.getReceta("Pollo con patatas");
        Receta ensaladaMixta = receta1.getReceta("Ensalada mixta");
        Receta natillas = receta2.getReceta("Natillas");
        Receta pizza = receta3.getReceta("Pizza");
        Receta helado = receta3.getReceta("Helado");
        Receta tarta = receta3.getReceta("Tarta");
        Receta batido = receta3.getReceta("Batido de frutas");
        Receta champiñones = receta2.getReceta("Champiñones");
        Receta lentejas = receta2.getReceta("Lentejas");

        cocinero1.aprenderReceta(polloPatatas);
        cocinero1.aprenderReceta(ensaladaMixta);
        cocinero2.aprenderReceta(natillas);
        cocinero1.aprenderReceta(tarta);
        cocinero2.aprenderReceta(helado);
        cocinero2.aprenderReceta(lentejas);
        cocinero2.aprenderReceta(pizza);

        TuristaBuilder turistaBuilder = new TuristaBuilder();
        turistaBuilder.setNombre("Oscar");
        turistaBuilder.setTieneGafas(false);
        turistaBuilder.setSexo(Turista.HOMBRE);
        turistaBuilder.setTipoPelo(Turista.PELO_CORTO);
        turistaBuilder.setColorPelo(Color.BLACK);
        Turista turista = turistaBuilder.build();

        System.out.println("Restaurante Hermenegildo: ¿Qué quieres comer?\n1) Ensalada mixta + Pollo con patatas + Natillas\n2) Ensalada mixta + Pizza + Helado\n3) Menú del día");
        int opcion = new Scanner(System.in).nextInt();

        try {
            File file = new File("factura.txt");
            PrintWriter printWriter = new PrintWriter(file);
            LocalDate localDate = LocalDate.now();
            LocalTime localTime = LocalTime.now();
            int hora = localTime.getHour();
            int min = localTime.getMinute();
            printWriter.println("Fecha y hora: " + localDate + " " + hora + ":" + min);

            Plato primerPlato = null;
            Plato segundoPlato = null;
            Plato tercerPlato = null;

            if (opcion == 1) {
                primerPlato = cocinero1.cocinar(ensaladaMixta);
                segundoPlato = cocinero2.cocinar(pizza);
                tercerPlato = cocinero2.cocinar(helado);

                int precioTotal = primerPlato.getPrecio() + segundoPlato.getPrecio() + tercerPlato.getPrecio();

                printWriter.println("- Primer plato: " + primerPlato + "\n- Segundo plato: " + segundoPlato + "\n- Postre: " + tercerPlato + "\n-Precio total: " + precioTotal + "€");
                turista.comer(primerPlato);
                turista.comer(segundoPlato);
                turista.comer(tercerPlato);
                if (turista.pagar(precioTotal)) {
                    System.out.println("Cuesta " + precioTotal + "€ y tienes un total de " + turista.getDinero() + "€ pago realizado te queda " + (turista.getDinero() - precioTotal) + "€");
                } else {
                    System.out.println("Tienes " + turista.getDinero() + "€ y necesitas " + precioTotal + "€\nPor lo tanto vas a pagar " + turista.getDinero() + "€ y lavarnos los platos.");
                    primerPlato.lavar();
                    segundoPlato.lavar();
                    tercerPlato.lavar();
                    if (primerPlato.estaSucio() || segundoPlato.estaSucio() || tercerPlato.estaSucio()) {
                        System.out.println("Vuelve a lavarlos siguen sucios.");
                    } else
                        System.out.println("Platos limpiados.");
                }


            } else if (opcion == 2) {
                primerPlato = cocinero1.cocinar(ensaladaMixta);
                segundoPlato = cocinero2.cocinar(pizza);
                tercerPlato = cocinero2.cocinar(helado);

                int precioTotal = primerPlato.getPrecio() + segundoPlato.getPrecio() + tercerPlato.getPrecio();

                printWriter.println("- Primer plato: " + primerPlato + "\n- Segundo plato: " + segundoPlato + "\n- Postre: " + tercerPlato + "\n-Precio total: " + precioTotal + "€");
                turista.comer(primerPlato);
                turista.comer(segundoPlato);
                turista.comer(tercerPlato);
                if (turista.pagar(precioTotal)) {
                    System.out.println("Cuesta " + precioTotal + "€ y tienes un total de " + turista.getDinero() + "€ pago realizado te queda " + (turista.getDinero() - precioTotal) + "€");
                } else {
                    System.out.println("Tienes " + turista.getDinero() + "€ y necesitas " + precioTotal + "€\nPor lo tanto vas a pagar " + turista.getDinero() + "€ y lavarnos los platos.");
                    primerPlato.lavar();
                    segundoPlato.lavar();
                    tercerPlato.lavar();
                    if (primerPlato.estaSucio() || segundoPlato.estaSucio() || tercerPlato.estaSucio()) {
                        System.out.println("Vuelve a lavarlos siguen sucios.");
                    } else
                        System.out.println("Platos limpiados.");
                }


            } else if (opcion == 3) {
                MenuDelDia menuDelDia = new MenuDelDia();

                Receta primero = menuDelDia.getPrimero();
                Receta segundo = menuDelDia.getSegundo();
                Receta postre = menuDelDia.getPostre();

                if (cocinero1.sabeCocinar(primero.getNombre()))
                    primerPlato = cocinero1.cocinar(primero);
                else if (cocinero2.sabeCocinar(primero.getNombre()))
                    primerPlato = cocinero2.cocinar(primero);

                if (cocinero1.sabeCocinar(segundo.getNombre()))
                    segundoPlato = cocinero1.cocinar(segundo);
                else if (cocinero2.sabeCocinar(segundo.getNombre()))
                    segundoPlato = cocinero2.cocinar(segundo);

                if (cocinero1.sabeCocinar(postre.getNombre()))
                    tercerPlato = cocinero1.cocinar(postre);
                else if (cocinero2.sabeCocinar(postre.getNombre()))
                    tercerPlato = cocinero2.cocinar(postre);

                if (primerPlato == null || segundoPlato == null || tercerPlato == null) {
                    System.out.println("Hoy no hay menú del día, lo sentimos.");
                } else {
                    int precioTotal = primerPlato.getPrecio() + segundoPlato.getPrecio() + tercerPlato.getPrecio();
                    printWriter.println("- Primer plato: " + primerPlato + "\n- Segundo plato: " + segundoPlato + "\n- Postre: " + tercerPlato +"\n-Precio total: " + precioTotal + "€");
                    turista.comer(primerPlato);
                    turista.comer(segundoPlato);
                    turista.comer(tercerPlato);

                    if(turista.pagar(precioTotal)){
                        System.out.println("Cuesta "+ precioTotal + "€ y tienes un total de " + turista.getDinero()+ "€ pago realizado te queda " + (turista.getDinero() - precioTotal) + "€");
                    }else {
                        System.out.println("Tienes " + turista.getDinero() + "€ y necesitas " + precioTotal + "€\nPor lo tanto vas a pagar " + turista.getDinero() + "€ y lavarnos los platos.");
                        primerPlato.lavar();
                        segundoPlato.lavar();
                        tercerPlato.lavar();
                        if(primerPlato.estaSucio() || segundoPlato.estaSucio() || tercerPlato.estaSucio()){
                            System.out.println("Vuelve a lavarlos siguen sucios.");
                        }else
                            System.out.println("Platos limpiados.");
                    }
                }
            }else {
                System.out.println("Opcion incorrecta");
            }
            printWriter.close();
        } catch (RecetaException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
