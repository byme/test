/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lcdscreen;

import java.util.Scanner;

/**
 *
 * @author oli
 */
public class main {

    public static void main(String args[]) {
        String inputComma[];
        char[] numbers;
        int size;
        String input = "";
        Scanner read;
        while (true) {
            read = new Scanner(System.in);
            input = read.nextLine();
            inputComma=input.split(",");
           
            if (input.equals("0,0")) {
                break;
            }
            
            numbers = inputComma[1].toCharArray();
            size=Integer.parseInt(inputComma[0]);
            printInput(numbers, size);
        }

      
    }

    public static void printInput(char numbers[], int size) {
        String line = "";
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case '0':
                    line = line + cero('t', size) + " ";
                    break;
                case '1':
                    line = line + uno('t', size) + " ";
                    break;
                case '2':
                    line = line + dos('t', size) + " ";
                    break;
                case '3':

                    line = line + tres('t', size) + " ";
                    break;
                case '4':
                    line = line + cuatro('t', size) + " ";
                    break;
                case '5':
                    line = line + cinco('t', size) + " ";
                    break;
                case '6':
                    line = line + seis('t', size) + " ";
                    break;
                case '7':
                    line = line + siete('t', size) + " ";
                    break;
                case '8':
                    line = line + ocho('t', size) + " ";
                    break;
                case '9':
                    line = line + nueve('t', size) + " ";
                    break;
            }

        }
        System.out.println(line);
        line = "";
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case '0':
                    line = line + cero('b', size) + " ";
                    break;
                case '1':
                    line = line + uno('b', size) + " ";
                    break;
                case '2':
                    line = line + dos('b', size) + " ";
                    break;
                case '3':

                    line = line + tres('b', size) + " ";
                    break;
                case '4':
                    line = line + cuatro('b', size) + " ";
                    break;
                case '5':
                    line = line + cinco('b', size) + " ";
                    break;
                case '6':
                    line = line + seis('b', size) + " ";
                    break;
                case '7':
                    line = line + siete('b', size) + " ";
                    break;
                case '8':
                    line = line + ocho('b', size) + " ";
                    break;
                case '9':
                    line = line + nueve('b', size) + " ";
                    break;
            }

        }
        for (int i = 0; i < size; i++) {
            System.out.println(line);

        }
        line = "";
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case '0':
                    line = line + cero('m', size) + " ";
                    break;
                case '1':
                    line = line + uno('m', size) + " ";
                    break;
                case '2':
                    line = line + dos('m', size) + " ";
                    break;
                case '3':

                    line = line + tres('m', size) + " ";
                    break;
                case '4':
                    line = line + cuatro('m', size) + " ";
                    break;
                case '5':
                    line = line + cinco('m', size) + " ";
                    break;
                case '6':
                    line = line + seis('m', size) + " ";
                    break;
                case '7':
                    line = line + siete('m', size) + " ";
                    break;
                case '8':
                    line = line + ocho('m', size) + " ";
                    break;
                case '9':
                    line = line + nueve('m', size) + " ";
                    break;
            }

        }
        System.out.println(line);
        line = "";
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case '0':
                    line = line + cero('v', size) + " ";
                    break;
                case '1':
                    line = line + uno('v', size) + " ";
                    break;
                case '2':
                    line = line + dos('v', size) + " ";
                    break;
                case '3':

                    line = line + tres('v', size) + " ";
                    break;
                case '4':
                    line = line + cuatro('v', size) + " ";
                    break;
                case '5':
                    line = line + cinco('v', size) + " ";
                    break;
                case '6':
                    line = line + seis('v', size) + " ";
                    break;
                case '7':
                    line = line + siete('v', size) + " ";
                    break;
                case '8':
                    line = line + ocho('v', size) + " ";
                    break;
                case '9':
                    line = line + nueve('v', size) + " ";
                    break;
            }

        }
        for (int i = 0; i < size; i++) {
            System.out.println(line);

        }
        line = "";
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case '0':
                    line = line + cero('d', size) + " ";
                    break;
                case '1':
                    line = line + uno('d', size) + " ";
                    break;
                case '2':
                    line = line + dos('d', size) + " ";
                    break;
                case '3':

                    line = line + tres('d', size) + " ";
                    break;
                case '4':
                    line = line + cuatro('d', size) + " ";
                    break;
                case '5':
                    line = line + cinco('d', size) + " ";
                    break;
                case '6':
                    line = line + seis('d', size) + " ";
                    break;
                case '7':
                    line = line + siete('d', size) + " ";
                    break;
                case '8':
                    line = line + ocho('d', size) + " ";
                    break;
                case '9':
                    line = line + nueve('d', size) + " ";
                    break;
            }

        }
        System.out.println(line);
        line = "";
        System.out.println("");
        System.out.println("");
    }

    public static String empty(int size) {
        String retorno = "";
        for (int i = 0; i < size; i++) {
            retorno = retorno + " ";
        }
        retorno = " " + retorno + " ";

        return retorno;
    }

    public static String full(int size) {
        String retorno = "";
        for (int i = 0; i < size; i++) {
            retorno = retorno + "-";
        }
        retorno = " " + retorno + " ";

        return retorno;
    }

    public static String right(int size) {
        String retorno = "";
        for (int i = 0; i < size; i++) {
            retorno = retorno + " ";
        }
        retorno = " " + retorno + "|";

        return retorno;
    }

    public static String left(int size) {
        String retorno = "";
        for (int i = 0; i < size; i++) {
            retorno = retorno + " ";
        }
        retorno = "|" + retorno + " ";

        return retorno;
    }

    public static String both(int size) {
        String retorno = "";
        for (int i = 0; i < size; i++) {
            retorno = retorno + " ";
        }
        retorno = "|" + retorno + "|";

        return retorno;
    }

    public static String uno(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = empty(size);
                break;
            case 'b':
                retorno = right(size);
                break;
            case 'm':
                retorno = empty(size);
                break;
            case 'v':

                retorno = right(size);
                break;
            case 'd':
                retorno = empty(size);
                break;
        }

        return retorno;
    }

    public static String dos(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = right(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = left(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

    public static String tres(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = right(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = right(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

    public static String cuatro(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = empty(size);
                break;
            case 'b':
                retorno = both(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = right(size);
                break;
            case 'd':
                retorno = empty(size);
                break;
        }

        return retorno;
    }

    public static String cinco(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = left(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = right(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

    public static String seis(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = left(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = both(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

    public static String siete(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = right(size);
                break;
            case 'm':
                retorno = empty(size);
                break;
            case 'v':
                retorno = right(size);
                break;
            case 'd':
                retorno = empty(size);
                break;
        }

        return retorno;
    }

    public static String ocho(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = both(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = both(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

    public static String nueve(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = both(size);
                break;
            case 'm':
                retorno = full(size);
                break;
            case 'v':
                retorno = right(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

    public static String cero(char letra, int size) {
        String retorno = "";

        switch (letra) {
            case 't':
                retorno = full(size);
                break;
            case 'b':
                retorno = both(size);
                break;
            case 'm':
                retorno = empty(size);
                break;
            case 'v':
                retorno = both(size);
                break;
            case 'd':
                retorno = full(size);
                break;
        }

        return retorno;
    }

}
