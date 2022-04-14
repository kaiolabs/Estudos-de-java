package aulas.aula05;

import java.util.*;

public class aula05 {
    public static void main(String[] args){

        Pessoa [] pessoas = new Pessoa[5];

        for (int i = 0; i < pessoas.length; i++) {
            Pessoa p = new Pessoa();
            p.setNome("Nome " + (i + 1));
            p.setIdade(i+30);
            p.setCidade("SCS");

            pessoas[i] = p;
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getCidade());
        }

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].getNome() + " " + pessoas[i].getIdade() + " " + pessoas[i].getCidade());
        }



        Pessoa [] [] mat = new Pessoa[3][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                Pessoa p = new Pessoa();
                p.setNome("Nome " + (i + 1) + " " + (j + 1));
                p.setIdade(i+30);
                p.setCidade("SCS");

                mat[i][j] = p;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j].getNome() + " " + mat[i][j].getIdade() + " " + mat[i][j].getCidade());
            }
        }


        Pessoa [] [] [] [] mat3 = new Pessoa[3] [3] [3] [3];

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                for (int k = 0; k < mat3[i][j].length; k++) {
                    for (int l = 0; l < mat3[i][j][k].length; l++) {
                        Pessoa p = new Pessoa();
                        p.setNome("Nome " + (i + 1) + " " + (j + 1) + " " + (k + 1) + " " + (l + 1));
                        p.setIdade(i+30);
                        p.setCidade("SCS");

                        mat3[i][j][k][l] = p;
                    }
                }
            }
        }

        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                for (int k = 0; k < mat3[i][j].length; k++) {
                    for (int l = 0; l < mat3[i][j][k].length; l++) {
                        System.out.println(mat3[i][j][k][l].getNome() + " " + mat3[i][j][k][l].getIdade() + " " + mat3[i][j][k][l].getCidade());
                    }
                }
            }
        }



        List<Pessoa> lista = new ArrayList<Pessoa>();

        for (int i = 0; i < lista.size(); i++) {
            Pessoa p = new Pessoa();
            p.setNome("Nome " + (i + 1));
            p.setIdade(i+30);
            p.setCidade("SCS");

        }

        Map<String, Pessoa> map = new HashMap<String, Pessoa>();
        int valor = 10;
        map.put("chave", new Pessoa());
        map.put("chave2", new Pessoa());
        map.put("chave3", new Pessoa());

        for (Map.Entry<String, Pessoa> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getNome());
        }

        
    }

}


