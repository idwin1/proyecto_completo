package VCI_Resolucion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Resolucion {
    public static void main(String[] args) {
        String archivoVariables = "Proyecto/src/VCI_Resolucion/TS.txt"; // Nombre del archivo TXT de variables
        String archivoOperaciones = "Proyecto/src/VCI_Resolucion/CV.txt"; // Nombre del archivo TXT de operaciones
        Stack<Token> pilaControl = new Stack<>();
        ArrayList<Tokensimbolo> tablaSimbolos= new ArrayList<>();
        tablaSimbolos=lecturaDeSimbolos(archivoVariables);

        try {
            String linea;
            BufferedReader lector = new BufferedReader(new FileReader(archivoOperaciones));
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                if(partes[1].equals("-21") ||
                        partes[1].equals("-22") ||
                        partes[1].equals("-24") ||
                        partes[1].equals("-25") ||
                        partes[1].equals("-26") ){
                    switch (partes[1]){
                        case "-21":
                            Token tem = pilaControl.pop();
                            switch (tem.getToken()){
                                case -51:
                                case -61:
                                    pilaControl.add(new Token(""+(Integer.parseInt(tem.getNombre()) * Integer.parseInt(pilaControl.pop().getNombre())),0,0,0));
                                    break;
                                case -52:
                                case -62:
                                    pilaControl.add(new Token(""+(Double.parseDouble(tem.getNombre()) * Double.parseDouble(pilaControl.pop().getNombre())),0,0,0));
                                    break;
                            }
                            break;
                        case "-22":
                            tem = pilaControl.pop();
                            Token temp1 = pilaControl.pop();
                            boolean esVariable = false;
                            Object valor = null;
                            switch (tem.getToken()){
                                case -51:
                                case -61:
                                    for(int i=0;i< tablaSimbolos.size();i++){
                                        if(temp1.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                            esVariable = true;
                                             valor = tablaSimbolos.get(i).getValor();
                                        }
                                    }
                                    if (esVariable == true){
                                        pilaControl.add(new Token(""+(Integer.parseInt( ""+valor) / Integer.parseInt(tem.getNombre())),-51,0,0));
                                    }else
                                        pilaControl.add(new Token(""+(Integer.parseInt(pilaControl.pop().getNombre()) / Integer.parseInt(pilaControl.pop().getNombre())),0,0,0));
                                    break;
                                case -52:
                                case -62:
                                    pilaControl.add(new Token(""+(Double.parseDouble(pilaControl.pop().getNombre()) / Double.parseDouble(pilaControl.pop().getNombre())),0,0,0));
                                    break;
                            }
                            break;
                        case "-24":
                            tem = pilaControl.pop();
                            switch (tem.getToken()){
                                case -51:
                                case -61:
                                    pilaControl.add(new Token(""+(Integer.parseInt(tem.getNombre()) + Integer.parseInt(pilaControl.pop().getNombre())),0,0,0));
                                    break;
                                case -52:
                                case -62:
                                    pilaControl.add(new Token(""+(Double.parseDouble(pilaControl.pop().getNombre()) + Double.parseDouble(pilaControl.pop().getNombre())),0,0,0));
                                    break;
                            }
                            break;
                        case "-26":
                            tem = pilaControl.pop();
                            Token guardar = pilaControl.pop();
                            for(int i=0;i< tablaSimbolos.size();i++){
                                if(guardar.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                    tablaSimbolos.get(i).setValor(Integer.parseInt(tem.getNombre()));
                                }
                            }
                    }

                }else {
                    pilaControl.add(new Token(partes[0], Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
                }
            }
        }catch (IOException e){
            System.out.println("error");
        }


        for(int i=0; i < tablaSimbolos.size();i++){
            System.out.println(tablaSimbolos.get(i).toString());
        }
    }

    public static ArrayList<Tokensimbolo> lecturaDeSimbolos(String tbSimbolos) {
        ArrayList<Tokensimbolo> arreglo = new ArrayList<>();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(tbSimbolos));
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                arreglo.add(new Tokensimbolo(partes[0], Integer.parseInt(partes[1]),Integer.parseInt(partes[2])));
            }
        } catch (IOException e) {
            System.out.println("error de lectura");
        }
        return arreglo;
    }
}
