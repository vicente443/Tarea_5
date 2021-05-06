/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_5;

import java.util.Scanner;

/**
 *
 * @author chent
 */
public class Actividad_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println("......................................................" );
        System.out.println("......................................................" );
        System.out.println("2.- Codigo de Star War con el ciclo for" ); 
String[][] sPers; 
sPers = new String[16][3]; 
sPers[0][0] = "Luke Skywalker"; 
sPers[0][1] = "172"; 
sPers[0][2] = "male";  
sPers[1][0] = "R2-D2"; 
sPers[1][1] = "96"; 
sPers[1][2] = "n/a";  
sPers[2][0] = "C-3PO"; 
sPers[2][1] = "167"; 
sPers[2][2] = "n/a";  
sPers[3][0] = "Darth Vader"; 
sPers[3][1] = "202"; 
sPers[3][2] = "male";  
sPers[4][0] = "Leia Organa"; 
sPers[4][1] = "150"; 
sPers[4][2] = "female";  
sPers[5][0] = "Owen Lars"; 
sPers[5][1] = "178"; 
sPers[5][2] = "male";  
sPers[6][0] = "Beru Whitesun lars"; 
sPers[6][1] = "165"; 
sPers[6][2] = "female";  
sPers[7][0] = "R5-D4"; 
sPers[7][1] = "97"; 
sPers[7][2] = "n/a";  
sPers[8][0] = "Biggs Darklighter"; sPers[8][1] = "183"; 
sPers[8][2] = "male";  
sPers[9][0] = "Obi-Wan Kenobi"; 
sPers[9][1] = "182"; 
sPers[9][2] = "male";  
sPers[10][0] = "Yoda"; 
sPers[10][1] = "66"; 
sPers[10][2] = "male";  
sPers[11][0] = "Jek Tono Porkins"; 
sPers[11][1] = "180"; 
sPers[11][2] = "male";  
sPers[12][0] = "Jabba Desilijic Tiure";
sPers[12][1] = "175"; 
sPers[12][2] = "hermaphrodite";  
sPers[13][0] = "Han Solo"; 
sPers[13][1] = "180"; 
sPers[13][2] = "male";  
sPers[14][0] = "Chewbacca"; 
sPers[14][1] = "228"; 
sPers[14][2] = "male";  
sPers[15][0] = "Anakin Skywalker"; 
sPers[15][1] = "188"; 
sPers[15][2] = "male";  
        for (int i = 0; i <16; i++) {
          for (int j = 0; j <3; j++) {
            System.out.println("sPers[i][j]= "+sPers[i][j]);
            
            
    }
        }
        System.out.println("......................................................" );
        System.out.println("......................................................" );
        System.out.println("3.-Arreglo de 2 dimensiones del alfabeto." );
        String sFrase;
        String [][] aCodigo;
        aCodigo = new String  [26][2];
aCodigo[0][0] = "1=A";
aCodigo[1][0] = "2=B";
aCodigo[2][0] = "3=C";
aCodigo[3][0] = "4=D";
aCodigo[4][0] = "5=E";
aCodigo[5][0] = "6=F";
aCodigo[6][0] = "7=G";
aCodigo[7][0] = "8=H";
aCodigo[8][0] = "9=I";
aCodigo[9][0] = "10=J";
aCodigo[10][0] = "11=K";
aCodigo[11][0] = "12=L";
aCodigo[12][0] = "13=M";
aCodigo[13][0] = "14=N";
aCodigo[14][0] = "15=O";
aCodigo[15][0] = "16=P";
aCodigo[16][0] = "17=Q";
aCodigo[17][0] = "18=R";
aCodigo[18][0] = "19=S";
aCodigo[19][0] = "20=T";
aCodigo[20][0] = "21=U";
aCodigo[21][0] = "22=V";
aCodigo[22][0] = "23=W";
aCodigo[23][0] = "24=X";
aCodigo[24][0] = "25=Y";
aCodigo[25][0] = "26=Z";
   for (int i = 0; i <26; i++) {
          for (int j = 0; j <2; j++) {
            System.out.println("aCodigo[i][j]= "+aCodigo[i][j]); 
            System.out.println("------------------------------------------------------" );
            System.out.println("------------------------------------------------------" );
            
        }
         
      }
System.out.println("Dada la lista anterior:" );
int cod=0;
Scanner entrada = new Scanner(System.in);
System.out.println("Ingrese un número del 1 al 26 que corresponda a una letra del alfabeto: ");
cod = entrada.nextInt();

String codMorse = "";

switch (cod){
case 1:
codMorse = "A; .-";
break;
case 2:
codMorse = "B; -...";
break;
case 3:
codMorse = "C; -.-.";
break;
case 4:
codMorse = "D; -..";
break;
case 5:
codMorse = "E; .";
break;
case 6:
codMorse = "F; ..-.";
break;
case 7:
codMorse = "G; --.";
break;
case 8:
codMorse = "H; ...";
break;
case 9:
codMorse = "I; ..";
break;
case 10:
codMorse = "J; .---";
break;
case 11:
codMorse = "K; -.-";
break;
case 12:
codMorse = "L; .-..";
break;
case 13:
codMorse=  "M; --";
break;
case 14:
codMorse = "N; -.";
break;
case 15:
codMorse = "0; ---";
break;
case 16:
codMorse = "P; .--.";
break;
case 17:
codMorse = "Q; --.-";
break;
case 18:
codMorse = "R; .-.";
break;
case 19:
codMorse = "S; ...";
break;
case 20:
codMorse = "T; -";
break;
case 21:
codMorse = "U; ..-";
break;
case 22:
codMorse = "V; ...-";
break;
case 23:
codMorse = "W; .--";
break;
case 24:
codMorse = "X; -..-";
break;
case 25:
codMorse = "Y; -.--";
break;
case 26:
codMorse = "Z; --..";
break;
default:
codMorse = "Variable no determinada :(";

}
System.out.println("codMorse: " + codMorse);


System.out.println("------------------------------------------------------" );
            System.out.println("------------------------------------------------------" );
    
    String aFrase;
    String [][] bCodigo;
    bCodigo = new String  [26][2];
        bCodigo[0][1] = ".-";
        bCodigo[1][1] = "-...";
        bCodigo[2][1] = "-.-.";
        bCodigo[3][1] = "-..";
        bCodigo[4][1] = ".";
        bCodigo[5][1] = "..-.";
        bCodigo[6][1] = "--.";
        bCodigo[7][1] = "...";
        bCodigo[8][1] = "..";
        bCodigo[9][1] = ".---";
        bCodigo[10][1] = "-.-";
        bCodigo[11][1] = ".-..";
        bCodigo[12][1] = "--";
        bCodigo[13][1] = "-.";
        bCodigo[14][1] = "---";
        bCodigo[15][1] = ".--.";
        bCodigo[16][1] = "--.-";
        bCodigo[17][1] = ".-.";
        bCodigo[18][1] = "...";
        bCodigo[19][1] = "-";
        bCodigo[20][1] = "..-";
        bCodigo[21][1] = "...-";
        bCodigo[22][1] = ".--";
        bCodigo[23][1] = "-..-";
        bCodigo[24][1] = "-.--";
        bCodigo[25][1] = "--..";
   
        for (int i = 0; i <26; i++) {
          for (int j = 0; j <2; j++) {
            System.out.println("bCodigo[i][j]= "+bCodigo[i][j]);
      
      }
    }
 System.out.println("------------------------------------------------------" );
            System.out.println("------------------------------------------------------" );
 System.out.println("4.- Codigo sobre el codigo ASCII." );
 System.out.println("Ingresa una palabra y te dire el costo a pagar :)" );
 
     String palabra = entrada.next();
        int Tpagar = 10;
        int asciiValue;
        char cChar;
        int x=0;
        
        char [] aChar = palabra.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            cChar = aChar[i];
            asciiValue= (int) cChar;
            x = i;  
            switch (asciiValue) {
                case 65: System.out.println("A:"+aCodigo[65-65][1]);
                    break;
                case 66: System.out.println("B:"+aCodigo[66-65][1]);
                    break;
                case 67: System.out.println("C:"+aCodigo[67-65][1]);
                    break;
                case 68: System.out.println("D:"+aCodigo[68-65][1]);
                    break;
                case 69: System.out.println("E:"+aCodigo[68-65][1]);
                    break;
                case 70: System.out.println("F:"+aCodigo[69-65][1]);
                    break;
                case 71: System.out.println("G:"+aCodigo[70-65][1]);
                    break;
                case 72: System.out.println("H:"+aCodigo[71-65][1]);
                    break;
                case 73: System.out.println("I:"+aCodigo[72-65][1]);
                    break;
                case 74: System.out.println("J:"+aCodigo[73-65][1]);
                    break;
                case 75: System.out.println("K:"+aCodigo[74-65][1]);
                    break;
                case 76: System.out.println("L:"+aCodigo[75-65][1]);
                     break;
                case 77: System.out.println("M:"+aCodigo[76-65][1]);
                     break;
                case 78: System.out.println("N:"+aCodigo[77-65][1]);
                     break;
                case 79: System.out.println("O:"+aCodigo[78-65][1]);
                    break;
                case 80: System.out.println("P:"+aCodigo[79-65][1]);
                    break;
                case 81: System.out.println("Q:"+aCodigo[80-65][1]);
                    break;
                case 82: System.out.println("R:"+aCodigo[81-65][1]);
                    break;
                case 83: System.out.println("S:"+aCodigo[82-65][1]);
                    break;
                case 84: System.out.println("T:"+aCodigo[83-65][1]);
                    break;
                case 85: System.out.println("U:"+aCodigo[84-65][1]);
                    break;
                case 86:  System.out.println("V:"+aCodigo[85-65][1]);
                    break;
                case 87: System.out.println("W:"+aCodigo[86-65][1]);
                    break;
                case 88: System.out.println("X:"+aCodigo[87-65][1]);
                    break;
                case 89: System.out.println("Y:"+aCodigo[88-65][1]);
                    break;
                case 90: System.out.println("Z:"+aCodigo[89-65][1]);
                    break;
            }
        }
        if (x<=aChar.length) {
                if (x<=4) {
                    System.out.println("total a pagar ="+ Tpagar);
                }
                else{
                    int extra = x-4;
                    for (int j = 0; j < extra; j++) {
                        Tpagar = Tpagar +3;
                    }
                    System.out.println("total a pagar mas el extra ="+ Tpagar);
      }
    }
System.out.println("------------------------------------------------------" );
            System.out.println("------------------------------------------------------" );
 System.out.println("6.- Sexo de los personajes del arreglo de Star Wars" );
 System.out.println("Ingresa un tipo de sexo:");
        Scanner leer = new Scanner(System.in);
        String sTar[][] = new String[3][10];
        sTar[0][0]="Darth Vader";
        sTar[1][0]="2,03 m";
        sTar[2][0]="male";
        
        sTar[0][1]="Luke Skywalker";
        sTar[1][1]="1.72 m";
        sTar[2][1]="male";
        
        sTar[0][2]="Han solo";
        sTar[1][2]="1.8 m";
        sTar[2][2]="male";
        
        sTar[0][3]="Lea Organa";
        sTar[1][3]="2,03 m";
        sTar[2][3]="female";
        
        sTar[0][4]="Asoka Tano";
        sTar[1][4]="1.88 m";
        sTar[2][4]="female";
        
        sTar[0][5]="Rey Skywalker";
        sTar[1][5]="1.7 m";
        sTar[2][5]="female";
        
        sTar[0][6]="Jabba el Hutt";
        sTar[1][6]="3,9 m";
        sTar[2][6]="hermafrodita";
        
        sTar[0][7]="Zorba Desilijic";
        sTar[1][7]="3,03 m";
        sTar[2][7]="hermafrodita";
        
        sTar[0][8]="R2-D2";
        sTar[1][8]="2,03 m";
        sTar[2][8]="programming";
        
        sTar[0][9]="C-3PO";
        sTar[1][9]="2,03 m";
        sTar[2][9]="programming";
        String nomStar = leer.next();
        switch(nomStar){
            case "MALE": 
                for (int i = 0; i < 3; i++) {
                    System.out.println(sTar[0][i]);
                }
                break;
            case "FEMELE":
                for (int i = 3; i < 5; i++) {
                    System.out.println(sTar[0][i]);
                }
                break;
            case "HERMAFRODITA":
                for (int i = 5; i < 7; i++) {
                    System.out.println(sTar[0][i]);
                }
                break;
            case "PROGRAMING":
                for (int i = 7; i < 9; i++) {
                    System.out.println(sTar[0][i]);
                }
                break;
  }
 }
}
