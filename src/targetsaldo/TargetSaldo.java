/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk menampilkan perhitungan
 * saldo tabungan dengan ketentuan :
 * saldo awal = Rp.3.500.000
 * Bunga/Bulan(%) = 8
 * Target Saldo = Rp.6.000.000
 * berbasis objek oriented
 */
public class TargetSaldo {
        
    public int saldoAwal;
    public double bunga;
    public int saldoTarget;
    
    
    public void targetSaldo(int parSaldo, double parbunga){
        int i = 0;
        
    DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols RP = new DecimalFormatSymbols();
    RP.setCurrencySymbol("Rp. "); 
    RP.setMonetaryDecimalSeparator(',');
    RP.setGroupingSeparator('.');
    Idr.setDecimalFormatSymbols(RP);
    
        while (saldoAwal <= 6000000) {
            i = i + 1;
            saldoTarget = (int) (bunga * saldoAwal);
            saldoAwal =  saldoAwal + saldoTarget;
            System.out.printf("Saldo di bulan ke-%d %s\n", i, Idr.format((int) saldoAwal).replaceAll(",00", ""));
        }
    }
    
}

