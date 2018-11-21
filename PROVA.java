package AULAB_PADRÃO_PERFEITO_OTIMIZADO_01;
import java.util.Random;
import java.util.Scanner;

public class PROVA
{
    // Atributos Globais //
    
    String r;
    String [] nome_disciplina = new String [5];
    String [] nome_aluno = new String [5];
    String [] turma = new String [5];
    String [] situação = new String [5];
    String [] imp = new String [5];
    double [] nota_1 = new double [5];
    double [] nota_2 = new double [5];
    double [] média = new double [5];
    int [] código_prova = new int [5];
    int i;
    int qtd;
    int cont = 1;
    
    Scanner ent = new Scanner ( System.in );
    Random rd = new Random();
    
    // Método //
   
    void CDP()
    {
        System.out.println(" --- CADASTRO DOS DADOS DA PROVA --- " + " \n ");
        
        System.out.println(" DESEJA CADASTRAR QUANTOS ALUNOS ? ");
        this.qtd = ent.nextInt();
        
        System.out.println();

        ///////////////// INÍCIO PROTEÇÃO QUANTIDADE DE ARRAY //////////////////
        while ( this.qtd < 0 || this.qtd > 5 )
        {
            System.out.println(" ERRO " + this.cont ++ + " TENTE OUTRA VEZ ");
            
            System.out.println(" DESEJA CADASTRAR QUANTOS ALUNOS ? ");
            this.qtd = ent.nextInt();
                    
            System.out.println();
        }
        ////////////////// FIM PROTEÇÃO QUANTIDADE DE ARRAY ////////////////////
        
        for ( i = 1 ; i <= this.qtd ; i ++ )
        {
            System.out.println(" ALUNO : " + i );
            
            System.out.println(" CÓDIGO DA PROVA SERÁ GERADO: AGUARDE ... ");
            this.código_prova[i] = rd.nextInt(55555);
            System.out.println();
            
            System.out.println(" DIGITE O NOME DA DISCIPLINA : ");
            this.nome_disciplina[i] = ent.next();
            System.out.println();
            
            System.out.println(" DIGITE O NOME DO ALUNO : ");
            this.nome_aluno[i] = ent.next();
            System.out.println();
            
            System.out.println(" DIGITE A TURMA DO ALUNO : ");
            this.turma[i] = ent.next();
            System.out.println();
        }  
    }
}