import javax.swing.*;


public class Panel2 {
    public static void main(String[] args) {
        String cantida = null;
        double cantidad=0;
        boolean continuar=true;
        int otro;


        //String name = JOptionPane.showInputDialog("Type your name please" );
        //JOptionPane.showMessageDialog(null, "Hello " + name);

        ImageIcon icono = new ImageIcon("Img/6473808.png");
        while (continuar){

            Object resp = JOptionPane.showInputDialog(null, "Elige una opción",
                    "Convertidor", JOptionPane.INFORMATION_MESSAGE,
                    icono, new Object[]{"Convertidor de monedas", "Convertidor de Temperatura"},
                    "Elige una opción");

            if (resp == "Convertidor de monedas") {
                cantida = JOptionPane.showInputDialog("Escribe la cantidad a convertir");

                cantidad=Double.parseDouble(cantida);

                resp = JOptionPane.showInputDialog(null, "Elige una opción",
                        "Convertidor de Monedas", JOptionPane.INFORMATION_MESSAGE,
                        icono, new Object[]{"De Peso a Dolar", "De Peso a Euro", "De Peso a Libras", "De Peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libras a Peso", "De Yen a Peso", "De Won Coreano a Peso"},
                        "Elige una opción");

                switch (resp.toString()){
                    case "De Peso a Dolar":JOptionPane.showMessageDialog(null, cantidad +" Pesos es igual a " +String.format("%.2f",(cantidad/17.08))+" Dolares");
                                            break;

                    case "De Peso a Euro":JOptionPane.showMessageDialog(null, cantidad +" Pesos es igual a " +String.format("%.2f",(cantidad/18.27))+" Euros");
                        break;
                    case "De Peso a Libras":JOptionPane.showMessageDialog(null, cantidad +" Pesos es igual a " +String.format("%.2f",(cantidad/21.28))+" Libras");
                        break;
                    case "De Peso a Yen":JOptionPane.showMessageDialog(null, cantidad +" Pesos es igual a " +String.format("%.2f",(cantidad/0.11))+" Yenes");
                        break;
                    case "De Peso a Won Coreano":JOptionPane.showMessageDialog(null, cantidad +" Pesos es igual a " +String.format("%.2f",(cantidad/0.012))+" Wons Coreanos");
                        break;
                    case "De Dolar a Peso":JOptionPane.showMessageDialog(null, cantidad +" Dolares es igual a " +String.format("%.2f",(cantidad*17.08))+" Pesos");
                        break;
                    case "De Euro a Peso":JOptionPane.showMessageDialog(null, cantidad +" Euros es igual a " +String.format("%.2f",(cantidad*18.27))+" Pesos");
                        break;
                    case "De Libras a Peso":JOptionPane.showMessageDialog(null, cantidad +" Libras es igual a " +String.format("%.2f",(cantidad*21.28))+" Pesos");
                        break;
                    case "De Yen a Peso":JOptionPane.showMessageDialog(null, cantidad +" Yenes es igual a " +String.format("%.2f",(cantidad*0.11))+" Pesos");
                        break;
                    case "De Won Coreano a Peso":JOptionPane.showMessageDialog(null, cantidad +" Wons Coreanos es igual a " +String.format("%.2f",(cantidad*0.012))+" Pesos");
                        break;
                }

            } else if (resp=="Convertidor de Temperatura") {
                cantida = JOptionPane.showInputDialog("Escribe la temperatura a convertir");

                cantidad=Double.parseDouble(cantida);

                resp = JOptionPane.showInputDialog(null, "Elige una opción",
                        "Convertidor de Temperatura", JOptionPane.INFORMATION_MESSAGE,
                        icono, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "Celsius a Kelvin", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Faherenheit"},
                        "Elige una opción");

                switch (resp.toString()){
                    case "De Celsius a Fahrenheit":JOptionPane.showMessageDialog(null, cantidad +" grados Celsius es igual a " +String.format("%.2f", ((cantidad * 1.8)+32))+" grados Fahrenheit");
                        break;

                    case "De Fahrenheit a Celsius":JOptionPane.showMessageDialog(null, cantidad +" grados Fahrenheit es igual a " +String.format("%.2f",((cantidad-32)*0.56))+" grados Celsius");
                        break;
                    case "Celsius a Kelvin":JOptionPane.showMessageDialog(null, cantidad +" grados Celsius es igual a " +String.format("%.2f",(cantidad+273.15))+" grados Kelvin");
                    break;
                    case "Fahrenheit a Kelvin": JOptionPane.showMessageDialog(null, cantidad +" grados Fahrenheit es igual a " +String.format("%.2f",(((cantidad-32)*0.56)+273.15))+" grados Kelvin");
                    break;
                    case "Kelvin a Celsius":JOptionPane.showMessageDialog(null, cantidad +" grados Kelvin es igual a " +String.format("%.2f",(cantidad-273.15))+" grados Celsius");
                    break;
                    case "Kelvin a Faherenheit":JOptionPane.showMessageDialog(null, cantidad +" grados Fahrenheit es igual a " +String.format("%.2f",(((cantidad-273.15)*1.8)+32))+" grados Kelvin");
                    break;

                }

            }else {
                JOptionPane.showMessageDialog(null, "No se eligió ninguna opción");
            }
            otro=JOptionPane.showConfirmDialog(null,
                    "Deseas continuar", "Convertidor", JOptionPane.YES_NO_CANCEL_OPTION);
           if (otro!=0){
               continuar=false;
           }


        }
        JOptionPane.showMessageDialog(null, "Programa Terminado!");
    }
}
