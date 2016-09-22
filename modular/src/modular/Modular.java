/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular;
import java.util.Scanner;
public class Modular {
    
         public static void main(String[] args) {
                  Scanner leer = new Scanner(System.in);
                  //TrigonometricasGeneral();
                  int n = leer.nextInt();
                  Pascal(n);
         }
         /*
         public static int TrigonometricasGeneral(){
                  char denuevo = 's',opc;
                  double res=0,x;
                  Scanner leer = new Scanner(System.in);
                  while(denuevo == 's'){
                           opc = TrigonometricasOpciones();
                           switch(opc){
                                    case 'a':
                                             System.out.println("Ingrese los grados : ");
                                             x = leer.nextDouble();
                                             res = Sen(x);
                                    break;
                           }
                           System.out.println(res);
                  }
                  return 0;
         }
         
         public static double Sen(double x){
                  double r = Radianes(x),res = 0,como=1,impar= 1,cveces= 2;
                  System.out.println(res);
                  while( !( (Math.abs(como)) <= (0.01) )){
                           como = (Math.pow(r, impar)) / (Factorial((int) impar));
                          // System.out.println(como);
                           if(cveces%2 == 0)
                                    como = como;
                           else
                                    como =  -(como);
                           
                          res = res + como;
                           System.out.println(res);
                           impar = impar + 2;
                           cveces++;
                  }
                  return res;
         }
         
         public static char TrigonometricasOpciones(){
                  char opc;
                  Scanner leer = new Scanner(System.in);
                  System.out.println("***Trigonométricas***");
                  System.out.println("Selecciona la función a realizar : ");
                  System.out.println("      a )  sen(x) ");
                  System.out.println("      b )  cos(x) ");
                  System.out.println("      c )  tan(x) ");
                  System.out.println("      d )  cot(x) ");
                  System.out.println("      e )  Salir   ");
                  opc = (leer.next()).charAt(0);
                  
                  return opc;
         }
         */
         public static double Radianes(double a){
                  return (0.0174533*a);
         }
         
         public static int Pascal(int n){
                  for(int i = 0; i <= n; i++){
                           for(int j = 0; j <= i; j++){
                                    if(j==0){
                                            for(int k = 0; k <= (n-i); k++){
                                                      System.out.print("  ");
                                            }
                                    }
                                    String comb;
                                    int co = (Combinaciones(i,j));
                                    comb = Integer.toString(co);
                                    if(comb.length() == 1)
                                             System.out.print("  "+Combinaciones(i,j)+" ");
                                    else{
                                            if(comb.length() == 2)
                                                      System.out.print(" "+Combinaciones(i,j)+" ");
                                            else
                                                      System.out.print(Combinaciones(i,j)+" ");
                                    }
                           } 
                            System.out.println();
                  } 
                  return 0;
         }
         
         public static int Combinaciones(int r, int k){
                  int res=0;
                  res = (Factorial(r))/((Factorial(k))*(Factorial(r-k)));
                  return res;
         }
         
         public static int Amigosn(int n){
                  for(int i = 0; i < n; i++){
                           if(Amigos(n,i) == "Sí"){
                                    System.out.println(i);
                           }
                  }
                  return 0;
         }
         
         public static String Amigos(int a, int b){
                   int sumaa=0,sumab=0;
                  
                   for(int j = 1; j < a; j++){
                                    if(a%j == 0){
                                        sumaa +=j;
                                    }
                  }
                   for(int j = 1; j < b; j++){
                                    if(b%j == 0){
                                        sumab +=j;
                                    }
                  }
                  if(a == sumab && b ==sumaa)
                           return "Sí";
                  else
                           return "No";
         }
         
        public static int SumaDiv(int m, int n){
                  int suma = 0, mayor=0,summayor=0;
                   for(int i =m; i<=n; i++){
                            suma = 0;
                            System.out.print(i+" :  ");
                           for(int j = 1; j <= i ; j++){
                                    if(i%j == 0){
                                        suma +=j;
                                            System.out.print(j+" ");
                                    }
                           }
                            System.out.print(" suma : "+suma);
                            System.out.println();
                            if(suma >= summayor){
                                    mayor = i;
                                    summayor = suma;
                            }
                   }
                   return summayor;
        }
         
         public static int EsPrimo(int a, int b){
                  int exp = 0,c=1,c2=1,c3=0,mcd=1;
                  int max = Math.max(a, b);
                  
                  for(int i=2; i <= max; i++){
                            if((Primo(i) == "Sí") && (b%i == 0 || a%i == 0)){
                                    if(b%i == 0 && a%i == 0){
                                                exp = b/i;
                                                while(exp%i == 0){
                                                        c++;
                                                        exp = exp/i;
                                                }
                                                
                                               
                                                exp = a/i;
                                                while(exp%i == 0){
                                                        c2++;
                                                        exp = exp/i;
                                                }
                                                
                                                if(c <= c2)
                                                      c3 = c;
                                                else 
                                                      c3 = c2;
                                             mcd = (int) (mcd*(Math.pow((double)i, (double)c3)));         
                                    }
                            }
                  }
                   
                  return mcd;
         }
         
         
          public static int McdMod(int an, int bn){
                  int a=Math.max(an, bn),b=Math.min(an, bn),mod = a%b;
                while(mod > 0){
                           a = Math.max(b, mod);
                           b = Math.min(b, mod);
                           mod = a - b;
                  }
                  return b;
         }
         
         public static int McdRestas(int an, int bn){
                  int a=Math.max(an, bn),b=Math.min(an, bn),resta = a -b;
                  while(resta > 0){
                           a = Math.max(b, resta);
                           b = Math.min(b, resta);
                           resta = a - b;
                  }
                  return b;
         }
         
          public static int TodosNPrimos (int n){
              int x2=1,c=0;
                    while(c <= (n-1)){
                           x2++;
                            if(Primo(x2) == "Sí"){
                                    System.out.println(x2);
                                     c++;
                            }
                    }
                  return 0;
          }
         
          public static int Nprimo(int n){
              int x2=1,c=0;
                    while(c <= (n-1)){
                           x2++;
                            if(Primo(x2) == "Sí"){
                                     c++;
                            }
                            
                  }
                  return x2;
          }
         
         public static String Primo(int n){
                  double raizn;
                   int s=0;
                   
                  if(n >= 0){
                        raizn= Math.floor(Math.sqrt(n));}
                  else{
                        raizn= Math.floor(Math.sqrt(-n));}
                  
                    for(int i = 1; i <= raizn;i++){
                       
                            if(n%i == 0){
                                       s = s + 1;
                            }
                  }
                   if(s == 1 || s == 0)
                           return "Sí";
                   else
                       return "No";
          }
         
         public static String Multiplos(int n1,int n2){
                  if(n1%n2 == 0 || n2%n1==0)
                            return "Sí"; 
                  else
                           return "No";
         }
         
         public static int Factorial(int n){
                  int res=1;
                  while(n>0){
                           res = res*n;
                           n = n-1;
                  }
                  return res;
         }
         public static int Fibonacci(int n){
                  int nums=0,num=1,numm1=0;
                  
                  for(int i = 0; i < n;i++){
                            nums=0;
                            nums = num + numm1;
                           numm1= num;
                            num = nums;
                            
                  }
                  return nums;
         }
         
        public static double Media3(int num){
            return num/3;
        }
        public static int Bisuma(int num, int num2, int num3){
            return num+num2+num3;
        }
        public static int Finaldig(int num){
            String n = Integer.toString(num);
            String fin = ""+n.charAt(n.length()-1); 
            return Integer.parseInt(fin);
        }

    
}
