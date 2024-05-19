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
            Token tem;
            Token tem2;
            Token temporal;
            Object valor = null;
            Object valor2 = null;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(",");
                if(partes[1].equals("-21") ||
                        partes[1].equals("-22") ||
                        partes[1].equals("-24") ||
                        partes[1].equals("-25") ||
                        partes[1].equals("-26") ){
                    switch (partes[1]){
                        case "-21":
                            tem = pilaControl.pop();
                            tem2 = pilaControl.pop();
                            switch (tem.getToken()){
                                case -51:
                                case -61:
                                    if (tem.getToken() == -51 && tem2.getToken()==-51) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) * Integer.parseInt(""+valor)),-61,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) * Integer.parseInt(tem.getNombre())),-61,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) * Integer.parseInt(""+valor)),-61,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) * Integer.parseInt(tem.getNombre())),-61,0,0));
                                        }
                                    }
                                    break;
                                case -52:
                                case -62:

                                    if (tem.getToken() == -52 && tem2.getToken()==-52) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) * Double.parseDouble(""+valor)),-62,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) * Double.parseDouble(tem.getNombre())),-62,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) * Double.parseDouble(""+valor)),-62,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) * Double.parseDouble(tem.getNombre())),-62,0,0));
                                        }
                                    }
                                    break;
                            }
                            break;
                        case "-22":
                            tem = pilaControl.pop();
                            tem2 = pilaControl.pop();
                            switch (tem.getToken()){
                                case -51:
                                case -61:
                                    if (tem.getToken() == -51 && tem2.getToken()==-51) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) / Integer.parseInt(""+valor)),-61,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) / Integer.parseInt(tem.getNombre())),-61,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) / Integer.parseInt(""+valor)),-61,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) / Integer.parseInt(tem.getNombre())),-61,0,0));
                                        }
                                    }
                                    break;
                                case -52:
                                case -62:

                                    if (tem.getToken() == -52 && tem2.getToken()==-52) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) / Double.parseDouble(""+valor)),-62,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) / Double.parseDouble(tem.getNombre())),-62,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) / Double.parseDouble(""+valor)),-62,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) / Double.parseDouble(tem.getNombre())),-62,0,0));
                                        }
                                    }
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
                                    tablaSimbolos.get(i).setValor((tem.getNombre()));
                                }
                            }
                            //System.out.println(tablaSimbolos.get(0).toString());
                            break;
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
