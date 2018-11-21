package AULAB_PADRÃO_PERFEITO_OTIMIZADO_01;

public class PROVA_ENSINO_MÉDIO extends PROVA
{
    // Métodos //
    void A()
    {
        System.out.println(" --- CADASTRO DAS NOTAS E MÉDIA DO ALUNO --- " + " \n ");
        
        System.out.println(" DESEJA REGISTRAR QUANTAS NOTAS ? ");
        this.qtd = ent.nextInt();
        
        ////////////// INÍCIO PROTEÇÃO QUANTIDADE DE ARRAY /////////////////////
        while ( qtd < 0 || qtd > 6 )
        {
            System.out.println(" ERRO " + this.cont ++ + " TENTE OUTRA VEZ ");
            
            System.out.println(" DESEJA REGISTRAR QUANTAS NOTAS ? ");
            this.qtd = ent.nextInt();
                    
            System.out.println();
        }
        ////////////// FIM PROTEÇÃO QUANTIDADE DE ARRAY ////////////////////////
        
        for ( i = 1; i <= qtd ; i ++ )
        {
            System.out.println(" DIGITE A NOTA 1 DO ALUNO " + this.nome_aluno[i]+ " : ");
            this.nota_1[i] = ent.nextDouble();
            
            System.out.println();
            
            //////////////////// INÍCIO PROTEÇÃO DA NOTA 1 /////////////////////
            while ( this.nota_1[i] < 0 || this.nota_2[i] > 11 )
            {
                System.out.println(" ERRO " + this.cont ++ + " TENTE OUTRA VEZ " );
                
                System.out.println(" DIGITE A NOTA 1 DO ALUNO " + this.nome_aluno[i] + " : ");
                this.nota_1[i] = ent.nextDouble();
                
                System.out.println();
            }
            //////////////////// FIM PROTEÇÃO DA NOTA 1 ////////////////////////
            
            System.out.println(" DIGITE A NOTA 2 DO ALUNO " + this.nome_aluno[i] + " : ");
            this.nota_2[i] = ent.nextDouble();
            
            System.out.println();
            
            ////////////////// INÍCIO PROTEÇÃO DA NOTA 2 ///////////////////////
            while ( this.nota_2[i] < 0 || this.nota_2[i] > 10 )
            {
                System.out.println(" ERRO " + cont++ + " TENTE OUTRA VEZ " );
                
                System.out.println(" DIGITE A NOTA 2 DO ALUNO " +this.nome_aluno[i] + " : ");
                this.nota_2[i] = ent.nextDouble();
                
                System.out.println();
            }
            ///////////////////// FIM PROTEÇÃO DA NOTA 2 ///////////////////////
            
            // CÁLCULO DA MÉDIA //
            
            this.média[i] = CM();

            if ( this.média[i] >= 6 )
            {
                this.situação[i] = " APROVADO ";
            }
            
            else
            if ( this.média[i] < 6 & this.média[i] >= 4 )
            {
                this.situação[i] = " RECUPERAÇÃO ";
            }
            
            else
            if ( this.média[i] < 4 )
            {
                this.situação[i] = " REPROVADO ";
            }
            
            System.out.println(" DESEJA IMPRIMIR RELATÓRIO ?  " + " \n " + " <sim> " + " <nao> ");
            r = ent.next();
            
            System.out.println();
            
            ////////////////// INÍCIO PROTEÇÃO DO RELATÓRIO ////////////////////
            while ( !r.equals ( "sim" ) & !r.equals ( "nao" ) )
            {
                System.out.println(" DESEJA IMPRIMIR RELATÓRIO ?  " + " \n " + " <sim> " + " <nao> ");
                r = ent.next();
                
                System.out.println();
            }
            ///////////////////// FIM PROTEÇÃO DO RELATÓRIO ////////////////////

            if ( r.equals ( "sim" ) )
            {
                this.imp[i] = IR();
            }
            
            else
            if ( r.equals ( "nao" ) )
            {
                System.out.println(" COMO DESEJAR ");
            }
        }
    }
    
////////////////////////////// SEÇÃO RETORNO////////////////////////////////////
    
    double CM()
    {
        this.média[i] = ( this.nota_1[i] + this.nota_2[i] ) / 2;
        
        return ( this.média[i] );
    }
    
    String IR()
    {
        System.out.println();
        System.out.println(" -------------- RELATÓRIO ---------------- ");
        System.out.println(" CÓDIGO DA PROVA " + this.código_prova[i] );
        System.out.println(" NOME DA DISCIPLINA : " + this.nome_disciplina[i] );
        System.out.println(" NOME DO ALUNO : " + this.nome_aluno[i] );
        System.out.println(" TURMA DO ALUNO : " + this.turma[i] );
        System.out.println(" NOTA 1 : " + this.nota_1[i] );
        System.out.println(" NOTA 2 : "+ this.nota_2[i] );
        System.out.println(" MÉDIA : " + this.média[i] );
        System.out.println(" SITUAÇÃO : " + this.situação[i] );
        System.out.println(" ---------------------FIM------------------ " + " \n ");

        return( this.imp[i] );
    }
}