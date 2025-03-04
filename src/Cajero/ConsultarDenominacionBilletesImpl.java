package cajero;

public class ConsultarDenominacionBilletesImpl implements IConsultarDenominacionBilletes {

    @Override
    public Billetes consultarDenominacionBilletes(int montoRetiro, Billetes billetes) {

            if (montoRetiro >= 100000) {
                int cantidadBilletesCienRequeridos = montoRetiro / 100000;
                if (billetes.getCienMil() >= cantidadBilletesCienRequeridos) {
                    billetes.setCienMil(billetes.getCienMil() - cantidadBilletesCienRequeridos);
                    montoRetiro = montoRetiro - (100000 * cantidadBilletesCienRequeridos);
                    System.out.println("Monto con descuento de denominación 100.000: " + montoRetiro);
                }
            }

            if (montoRetiro >= 50000) {
                int cantidadBilletesCincuentaRequeridos = montoRetiro / 50000;
                if (billetes.getCicuentaMil() >= cantidadBilletesCincuentaRequeridos) {
                    billetes.setCicuentaMil(billetes.getCicuentaMil() - cantidadBilletesCincuentaRequeridos);
                    montoRetiro = montoRetiro - (50000 * cantidadBilletesCincuentaRequeridos);
                    System.out.println("Monto con descuento de denominación 50.000: " + montoRetiro);
                }
            }

            if (montoRetiro >= 20000) {
                int cantidadBilletesVeinteRequeridos = montoRetiro / 20000;
                if (billetes.getVeinteMil() >= cantidadBilletesVeinteRequeridos) {
                    billetes.setVeinteMil(billetes.getVeinteMil() - cantidadBilletesVeinteRequeridos);
                    montoRetiro = montoRetiro - (20000 * cantidadBilletesVeinteRequeridos);
                    System.out.println("Monto con descuento de denominación 20.000: " + montoRetiro);
                }
            }

            if (montoRetiro >= 10000) {
                int cantidadBilletesDiezRequeridos = montoRetiro / 10000;
                if (billetes.getDiezMil() >= cantidadBilletesDiezRequeridos) {
                    billetes.setDiezMil(billetes.getDiezMil() - cantidadBilletesDiezRequeridos);
                    montoRetiro = montoRetiro - (10000 * cantidadBilletesDiezRequeridos);
                    System.out.println("Monto con descuento de denominación 10.000: " + montoRetiro);
                }
            }

            if (montoRetiro >= 5000) {
                int cantidadBilletesCincoRequeridos = montoRetiro / 5000;
                if (billetes.getCincoMil() >= cantidadBilletesCincoRequeridos) {
                    billetes.setCincoMil(billetes.getCincoMil() - cantidadBilletesCincoRequeridos);
                    montoRetiro = montoRetiro - (5000 * cantidadBilletesCincoRequeridos);
                    System.out.println("Monto con descuento de denominación 5.000: " + montoRetiro);
                }
            }

            return billetes;
        }
    }
