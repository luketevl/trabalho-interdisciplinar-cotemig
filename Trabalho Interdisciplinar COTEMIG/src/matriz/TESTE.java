package matriz;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.text.NumberFormat;

class Gauss extends Matriz{
	String ik[][];
	int cramer[][];//=new int[getX()][getY()];
	String cramer2;
	int cramerResult;
	int matriz[][];//=new int[getX()][getY()];
	
	void teste(){
//		/*int x;
//		for(x=0;x<20;x++){
//		System.out.println("Numero: "+(int)(999*Math.random()));
//		
//		}
//		System.out.println("oola");
//	
//		
//	double	it,lq,txDia,txMes,n,j,qo,sn;
//	
//	lq=Math.pow((1+1/100),(1/30)-1);
//	
//	txDia=lq*100;
//	//it=txMes/100;
//	
//		sn=Math.pow((1+1),1)*1;
//	
//	System.out.println(sn);
//		int x=2,y=2,n,i,j;
//		int matriz[][];
//		matriz=new int[x][y];
//		for (i = 0; i < x; i++) {
//			for (j = 0; j < y; j++) {
//				System.out.print("a"+(i+1)+""+(j+1)+":  ");
//				n = op.nextInt();
//				matriz[i][j] = n;
//			}
//		}
//		System.out.println(matriz[x-1][y-1] + " FDP " + matriz[x-1][0]);
//		*/
////		JOptionPane.showInputDialog(null," message","rere",JOptionPane.YES_NO_OPTION);
////		int x=0;
////		if(x==0){
////			System.out.println("UI");
////		}
////		else if(x==0 || x==1){
////			System.out.println("OIE");
////		}
//		
//		
////		JOptionPane.showInputDialog(null,"rere","A",JOptionPane.CANCEL_OPTION);
////		JOptionPane.showInputDialog(null,"rere","B",JOptionPane.CLOSED_OPTION);
////		JOptionPane.showInputDialog(null,"rere","C",JOptionPane.DEFAULT_OPTION);
////		JOptionPane.showInputDialog(null,"rere","D",JOptionPane.ERROR_MESSAGE);
////		JOptionPane.showInputDialog(null,"rere","E",JOptionPane.NO_OPTION);
////		JOptionPane.showInputDialog(null,"rere","F",JOptionPane.OK_CANCEL_OPTION);
////		JOptionPane.showInputDialog(null,"rere","G",JOptionPane.OK_OPTION);
////		JOptionPane.showInputDialog(null,"rere","H",JOptionPane.PLAIN_MESSAGE);
////		//JOptionPane.showInputDialog(null,"rere","I",JOptionPane.QUESTION_MESSAGE);
//////		JOptionPane.showInputDialog(null,"rere","",JOptionPane.SELECTION_VALUES_PROPERTY("D"));
////		JOptionPane.showInputDialog(null,"rere","J",JOptionPane.WARNING_MESSAGE);
////		JOptionPane.showInputDialog(null,"rere","K",JOptionPane.YES_NO_CANCEL_OPTION);
////		JOptionPane.showInputDialog(null,"rere","L",JOptionPane.YES_NO_OPTION);
////		JOptionPane.showInputDialog(null,"rere","M",JOptionPane.YES_OPTION);
////		JOptionPane.showInputDialog(null,"rere","N",JOptionPane.ERROR);
////		JOptionPane.showInputDialog(null,"rere","O",JOptionPane.ABORT);
//		double x=0.02,y=2;
//		String nome[][],tst="",exib="";
//		//nome=new String[x][y];
////		for(int ib=0;ib<x;ib++){
////			for(int jb=0;jb<y;jb++){
////				tst=JOptionPane.showInputDialog(null,"Digite","RE",JOptionPane.ERROR_MESSAGE);
////				//tst+=nome[ib][jb];
////				
////				nome[ib][jb]= tst;
////			}
////		}
////		
////		for(int ib=0;ib<x;ib++){
////			for(int jb=0;jb<y;jb++){
////				exib+=nome[ib][jb]+"        ";
////				System.out.print(nome[ib][jb]);
////			}
////			//System.out.println("\n\n\n\n\n\n");
////			exib+="\n";
////			System.out.println(exib);
////		}
////		/*for(int i=0;i<x;i++){
////			tst +="LU";
////			for(int j=0;j<y;j++){
////				tst+= "CAS ";
////			}
////			
////		}*/
////		JOptionPane.showMessageDialog(null,exib,"ui",JOptionPane.INFORMATION_MESSAGE);
////		JOptionPane.showMessageDialog(null,tst,"ui",JOptionPane.INFORMATION_MESSAGE);
////		
////		System.out.println(Math.pow(x,10));
//		
//		
//		System.out.println(NumberFormat.getPercentInstance().format(x));
//		String x="nada";
//		x=JOptionPane.showInputDialog(null,"x");
//		System.out.println(x);
//		if(x.equals("")){
//			System.out.println("Trui");
//		}
		
		//		
//		for(int i=0;i<2;i++){
//			for(int j=0;j<2;j++){
//				System.out.println("Digite:  ");
//				ga.cramer[i][j]=op.next();
//				ga.cramer2=ga.cramer[i][j];
//				ga.removeVariavel(ga.cramer, i, j);
//			}
//			
//		}

		//		
//		Gauss ga=new Gauss();
//		arrayList2.add("Teste");
//		arrayList2.add("Teste2");
//		arrayList2.add("Teste3");
//		arrayList2.add("Teste4");
//		arrayList.add(arrayList2);
//		arrayList.add(arrayList2);
//		

		
//		ArrayList<ArrayList> arrayList=new ArrayList();
//		ArrayList<String> arrayListI=new ArrayList();
//		ArrayList<String> arrayListJ=new ArrayList();
//		
//		
//		ga.ordemMatriz();
//		
//		
//			for(int i=0;i<ga.getX();i++){
//				arrayListI.add(JOptionPane.showInputDialog(null,"A:" ));
//				arrayListJ.add(JOptionPane.showInputDialog(null,"B:" ));
//		}
//		
//
//			for(int j=0;j<arrayListI.size();j++){
//				System.out.println("\n");
//				for(int i=0;i<arrayListI.size();i++){
//				System.out.print(arrayListI.get(i)+" ");
//			
//			}
//			
//			System.out.print(arrayListJ.get(j)+" ");
//		}
		
//		=======================================================================================================
			//ArrayList<ArrayList<String>> listaPrincipal=new ArrayList<ArrayList<String>>();
			//ArrayList<String> lista1=new ArrayList<String>();
			//ArrayList<String> lista2=new ArrayList<String>();
			//for(int i=0;i<10;i++){
			//lista1.add(""+i);
			//}
			//for(int i=11;i<20;i++){
			//lista2.add(""+i);
			//}
			//listaPrincipal.add(lista1);
			//listaPrincipal.add(lista2);
			//
			//// Percorre a lista principal pegando todos as lista
			//for(int i=0;i<listaPrincipal.size();i++){
			//ArrayList<String> aux=listaPrincipal.get(i);
			//for(int j=0;j<aux.size();j++){
			//System.out.println("ListaPrincipal["+i+"]["+j+"] = "+aux.get(j));
			//}
			//System.out.println("================== QUEBRA DE LISTA =============================");
			//}
			//for (String x:lista1){
			//	
//				System.out.println(x);
			//}
//=================================================================================================================
		
	}
		//ok
	void clonaMatriz(){

		matriz=new int [getX()][getY()];
		cramer=new int [getX()][getY()];
		
		for(int i=0;i<getX();i++){
			for(int j=0;j<getY();j++){
				System.out.println("Digite: ");
				int kj=op.nextInt();
				matriz[i][j]=kj;
				cramer[i][j]=matriz[i][j];
			}
		}
	}
	
	void removeVariavel(String cramer[][],int i, int j){
		cramer[i][j]=cramer[i][j].replace('x','a');
	}
	
	void utilizarCramer(){
		
		int cramer=0;
			if(getX()==2 && getY()==3){
				determinanteOrdem2();
				cramer+=determinante;
				System.out.println(cramer);
				System.out.println(determinante);
			}
				else if(getX()==3 && getY()==4){
					utilizarSarrus();	
				
			}
				else if(getX()==4 && getY()==5){
					laplaceOrdem4();
				}
		
		}
		

}


public class TESTE {
	public static void main(String args[]){
		Scanner op = new Scanner(System.in);
		Gauss ga=new Gauss();
		int x=12345;
		String y="-1x+4y+5+6";
//		y=y.replaceAll("^-[a-z]+$","");
//		y=y.replace("+","");
		System.out.println(y);
		}
}