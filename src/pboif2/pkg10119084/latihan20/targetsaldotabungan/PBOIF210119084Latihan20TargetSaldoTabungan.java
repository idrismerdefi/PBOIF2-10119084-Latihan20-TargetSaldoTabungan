/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboif2.pkg10119084.latihan20.targetsaldotabungan;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Program Target saldo tabungan
 **/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class PBOIF210119084Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        
       //Format number
        DecimalFormat kursIndonesia = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        
        int lama,i = 0;
        float bunga;
        double saldoAwal, saldoTarget,saldoTotal;
        
        System.out.print("Saldo Awal      : Rp. ");
        saldoAwal=input.nextDouble();
        System.out.print("Bunga/bulan(%): ");
        bunga=input.nextFloat();
        System.out.print("Saldo Target : Rp. ");
        saldoTarget=input.nextDouble();
        
        bunga = (float) (bunga/100);
        
        
        while(i < saldoTarget){
            saldoTotal = (saldoAwal * 0.08) + saldoAwal;
            System.out.println("Saldo dibulan ke-" + i + "%s %n"+kursIndonesia.format(saldoTotal));
            saldoAwal  = saldoTotal;
            if (saldoAwal >= saldoTarget){
                break;
            }i++;
        
        }
        
        System.out.println("===============================================");
        System.out.println("Developed by Muhammad Idris Merdefi");
    }
    
    }
