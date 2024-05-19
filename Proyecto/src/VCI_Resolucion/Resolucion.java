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
                        partes[1].equals("-26") ||
                        partes[1].equals("-31") ||
                        partes[1].equals("-32") ||
                        partes[1].equals("-33") ||
                        partes[1].equals("-34") ||
                        partes[1].equals("-35") ||
                        partes[1].equals("-36") ||
                        partes[1].equals("-41") ){
                    switch (partes[1]){
                        // caso *
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
                            // caso /
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
                            // caso +
                        case "-24":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) + Integer.parseInt(""+valor)),-61,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) + Integer.parseInt(tem.getNombre())),-61,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) + Integer.parseInt(""+valor)),-61,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) + Integer.parseInt(tem.getNombre())),-61,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) + Double.parseDouble(""+valor)),-62,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) + Double.parseDouble(tem.getNombre())),-62,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) + Double.parseDouble(""+valor)),-62,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) + Double.parseDouble(tem.getNombre())),-62,0,0));
                                        }
                                    }
                                    break;
                                case -53:
                                case -63:

                                    if (tem.getToken() == -53 && tem2.getToken()==-53) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token( (""+valor2) + (""+valor),-63,0,0));

                                    }else if(tem.getToken() == -63 && tem2.getToken()==-63){

                                        pilaControl.add(new Token(((tem2.getNombre()) + (tem.getNombre())),-62,0,0));

                                    } else{
                                        if(tem.getToken() == -53){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(((tem2.getNombre()) + (""+valor)),-63,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(((""+valor2) + (tem.getNombre())),-62,0,0));
                                        }
                                    }

                                    break;
                            }
                            break;
                            // caso-
                        case "-25":
                            tem = pilaControl.pop();
                            tem2 = pilaControl.pop();
                            switch (tem.getToken()) {
                                case -51:
                                case -61:
                                    if (tem.getToken() == -51 && tem2.getToken() == -51) {

                                        for (int i = 0; i < tablaSimbolos.size(); i++) {
                                            if (tem.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if (tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token("" + (Integer.parseInt("" + valor2) - Integer.parseInt("" + valor)), -61, 0, 0));

                                    } else if (tem.getToken() == -61 && tem2.getToken() == -61) {

                                        pilaControl.add(new Token("" + (Integer.parseInt(tem2.getNombre()) - Integer.parseInt(tem.getNombre())), -61, 0, 0));

                                    } else {
                                        if (tem.getToken() == -51) {
                                            for (int i = 0; i < tablaSimbolos.size(); i++) {
                                                if (tem.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token("" + (Integer.parseInt(tem2.getNombre()) - Integer.parseInt("" + valor)), -61, 0, 0));

                                        } else {
                                            for (int i = 0; i < tablaSimbolos.size(); i++) {
                                                if (tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token("" + (Integer.parseInt("" + valor2) - Integer.parseInt(tem.getNombre())), -61, 0, 0));
                                        }
                                    }
                                    break;
                                case -52:
                                case -62:

                                    if (tem.getToken() == -52 && tem2.getToken() == -52) {

                                        for (int i = 0; i < tablaSimbolos.size(); i++) {
                                            if (tem.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if (tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token("" + (Double.parseDouble("" + valor2) - Double.parseDouble("" + valor)), -62, 0, 0));

                                    } else if (tem.getToken() == -62 && tem2.getToken() == -62) {

                                        pilaControl.add(new Token("" + (Double.parseDouble(tem2.getNombre()) - Double.parseDouble(tem.getNombre())), -62, 0, 0));

                                    } else {
                                        if (tem.getToken() == -52) {
                                            for (int i = 0; i < tablaSimbolos.size(); i++) {
                                                if (tem.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token("" + (Double.parseDouble(tem2.getNombre()) - Double.parseDouble("" + valor)), -62, 0, 0));

                                        } else {
                                            for (int i = 0; i < tablaSimbolos.size(); i++) {
                                                if (tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())) {
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token("" + (Double.parseDouble("" + valor2) - Double.parseDouble(tem.getNombre())), -62, 0, 0));
                                        }
                                    }
                                    break;
                            }
                            break;
                            // caso =
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
                        case "-31":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) < Integer.parseInt(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) < Integer.parseInt(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) < Integer.parseInt(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) < Integer.parseInt(tem.getNombre())),-64,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) < Double.parseDouble(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) < Double.parseDouble(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) < Double.parseDouble(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) < Double.parseDouble(tem.getNombre())),-64,0,0));
                                        }
                                    }
                                    break;
                            }
                            break;
                            // <=
                        case "-32":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) <= Integer.parseInt(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) <= Integer.parseInt(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) <= Integer.parseInt(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) <= Integer.parseInt(tem.getNombre())),-64,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) <= Double.parseDouble(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) <= Double.parseDouble(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) <= Double.parseDouble(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) <= Double.parseDouble(tem.getNombre())),-64,0,0));
                                        }
                                    }
                                    break;
                            }
                            break;
                            // >
                        case "-33":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) > Integer.parseInt(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) > Integer.parseInt(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) > Integer.parseInt(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) > Integer.parseInt(tem.getNombre())),-64,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) > Double.parseDouble(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) > Double.parseDouble(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) > Double.parseDouble(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) > Double.parseDouble(tem.getNombre())),-64,0,0));
                                        }
                                    }
                                    break;
                            }
                            break;
                            // >=
                        case "-34":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) >= Integer.parseInt(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) >= Integer.parseInt(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) >= Integer.parseInt(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) >= Integer.parseInt(tem.getNombre())),-64,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) >= Double.parseDouble(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) >= Double.parseDouble(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) >= Double.parseDouble(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) >= Double.parseDouble(tem.getNombre())),-64,0,0));
                                        }
                                    }
                                    break;
                            }
                            break;
                            // ==
                        case "-35":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) == Integer.parseInt(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) == Integer.parseInt(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) == Integer.parseInt(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) == Integer.parseInt(tem.getNombre())),-64,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) == Double.parseDouble(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) == Double.parseDouble(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) == Double.parseDouble(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) == Double.parseDouble(tem.getNombre())),-64,0,0));
                                        }
                                    }
                                    break;
                                case -54:
                                case -64:

                                    if (tem.getToken() == -54 && tem2.getToken()==-54) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token(""+(valor2.equals(valor)),-64,0,0));

                                    }else if(tem.getToken() == -64 && tem2.getToken()==-64){

                                        pilaControl.add(new Token(""+((tem2.getNombre().equals(tem.getNombre()))),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -54){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+((tem2.getNombre().equals(valor))),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(valor2.equals(tem.getNombre())),-64,0,0));
                                        }
                                    }

                                    break;
                            }
                            break;
                            // !=
                        case "-36":
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
                                        pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) != Integer.parseInt(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -61 && tem2.getToken()==-61){

                                        pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) != Integer.parseInt(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -51){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(tem2.getNombre()) != Integer.parseInt(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Integer.parseInt(""+valor2) != Integer.parseInt(tem.getNombre())),-64,0,0));
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
                                        pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) != Double.parseDouble(""+valor)),-64,0,0));

                                    }else if(tem.getToken() == -62 && tem2.getToken()==-62){

                                        pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) != Double.parseDouble(tem.getNombre())),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -52){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(tem2.getNombre()) != Double.parseDouble(""+valor)),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(Double.parseDouble(""+valor2) != Double.parseDouble(tem.getNombre())),-64,0,0));
                                        }
                                    }
                                    break;
                                case -54:
                                case -64:

                                    if (tem.getToken() == -54 && tem2.getToken()==-54) {

                                        for(int i=0;i< tablaSimbolos.size();i++){
                                            if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor = tablaSimbolos.get(i).getValor();
                                            }
                                            if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                valor2 = tablaSimbolos.get(i).getValor();
                                            }
                                        }
                                        pilaControl.add(new Token(""+(!valor2.equals(valor)),-64,0,0));

                                    }else if(tem.getToken() == -64 && tem2.getToken()==-64){

                                        pilaControl.add(new Token(""+(!(tem2.getNombre().equals(tem.getNombre()))),-64,0,0));

                                    } else{
                                        if(tem.getToken() == -54){
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(!(tem2.getNombre().equals(valor))),-64,0,0));

                                        }else {
                                            for(int i=0;i< tablaSimbolos.size();i++){
                                                if(tem2.getNombre().equals(tablaSimbolos.get(i).getNombre())){
                                                    valor2 = tablaSimbolos.get(i).getValor();
                                                }
                                            }
                                            pilaControl.add(new Token(""+(!valor2.equals(tem.getNombre())),-64,0,0));
                                        }
                                    }

                                    break;
                            }
                            break;
                            // caso &&
                        case "-41":
                            break;
                        case "-42":
                            break;
                        case "-43":
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
                arreglo.add(new Tokensimbolo(partes[0], Integer.parseInt(partes[1]),partes[2]));
            }
        } catch (IOException e) {
            System.out.println("error de lectura");
        }
        return arreglo;
    }
}
