package AULAB_PADRÃO_PERFEITO_OTIMIZADO_01;
import java.util.Scanner;

public class Z0_MENU_PERFEITO_OTIMIZADO
{
    public static void main ( String args [] )
    {
        String r;
        int cont = 1;
        
        Scanner ent = new Scanner ( System.in );
        PROVA_ENSINO_MÉDIO PEM = new PROVA_ENSINO_MÉDIO();
        PROVA_ENSINO_TÉCNICO PET = new PROVA_ENSINO_TÉCNICO();
        
        System.out.println(" PROGRAMA PROVA " + " \n "  + " POR FAVOR SELECIONE AS OPÇÕES ABAIXO " + " \n ");
        
        System.out.println(" MENU RAIZ " + " \n " + " EXECUTAR PROGRAMA <sim> " + " \n " + " EXECUTAR PROGRAMA <nao> ");
        r = ent.next();
        
        System.out.println();
       
        //////////////////// INÍCIO PROTEÇÃO MENU RAIZ /////////////////////////
        while ( !r.equals ( "sim" ) & !r.equals( "nao" ) )
        {
            System.out.println(" ERRO " + cont ++ + "  TENTE OUTRA VEZ ");
           
            System.out.println(" MENU RAIZ " + " \n " + " EXECUTAR PROGRAMA <sim> " + " \n " + " EXECUTAR PROGRAMA <nao> ");
            r = ent.next();
            
            System.out.println();
        }
        //////////////////// FIM PROTEÇÃO MENU RAIZ ////////////////////////////
        
        while ( r.equals ( "sim" ) )
        {
            System.out.println(" MENU PRINCIPAL " + " \n " + " 1. ENSINO MÉDIO " + " \n " + " 2. ENSINO TÉCNICO  " + " \n " + " 3. SAIR ");
            r = ent.next();
            
            System.out.println();
            
            ///////////////// INÍCIO PROTEÇÃO MENU PRINCIPAL ///////////////////
            while ( !r.equals ( "1" ) & !r.equals( "2" ) &  !r.equals( "3" ) )
            {
                System.out.println(" ERRO " + cont++ + " TENTE OUTRA VEZ ");
               
                System.out.println(" MENU PRINCIPAL " + " \n " + " 1. ENSINO MÉDIO " + " \n " + " 2. ENSINO TÉCNICO  " + " \n " + " 3. SAIR ");
                r = ent.next();
                
                System.out.println();
            }
            ////////////////// FIM PROTEÇÃO MENU PRINCIPAL /////////////////////
            
            if ( r.equals( "1" ) )
            {
                System.out.println(" ALUNO : " + cont ++ );
                PEM.CDP();
                PEM.A();
            }
            
            else
            if ( r.equals( "2" ) )
            {
                System.out.println(" ALUNO : " + cont++);
                PET.CDP();
                PET.A();
            }
            
            else
            if ( r.equals ( "3" ) )
            {
                System.out.println(" OBRIGADO PELA PREFERÊNCIA ");
                System.exit(0);
            }
            
            System.out.println(" DESEJA VOLTAR AO MENU PRINCIPAL ? " + " \n " + " <sim> " + " \n " + " <nao> ");
            r = ent.next();
            
            System.out.println();
            
            ////////////////// INÍCIO PROTEÇÃO VOLTAR MENU PRINCIPAL ///////////
                while ( !r.equals ( "sim" ) & !r.equals ( "nao" ) )
                {
                    System.out.println(" ERRO " + cont ++ + " TENTE OUTRA VEZ ");
                    
                    System.out.println(" DESEJA VOLTAR AO MENU PRINCIPAL ? " + " \n " + " <sim> " + " \n " + " <nao> ");
                    r = ent.next();
                    
                    System.out.println();
                }
                /////////////// FIM PROTEÇÃO VOLTAR MENU PRINCIPAL /////////////
        }    
    }
}