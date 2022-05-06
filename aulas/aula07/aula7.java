package aulas.aula07;

import aulas.aula07.FaseLua.FaseDaLua;

public class aula7 {
    public static void main(String[] args) {
        // FaseDaLua a = FaseDaLua.valueOf("CHEIA");
        // String x = a.toString();
        // System.out.println(x);

        // FaseDaLua b = FaseDaLua.values()[3];
        // System.out.println(b);

        // int i = a.ordinal();
        // System.out.println(i);

        // System.out.println(MesesDoAno.Meses.FEVEREIRO.getNumber());

        // System.out.println(MesesDoAnoV2.Meses.FEVEREIRO.getNumber());

        // System.out.println(MesesDoAnoV2.Meses.FEVEREIRO.getFerias());

        
        Gerente g = new Gerente();
        g.setSalario(1000);

        System.out.println(g.autentica());
        System.out.println(g.getSalario());
        System.out.println(g.getBonificacao());
        System.out.println(g.getHorasTrabalhadas());
        
    }
    
}
