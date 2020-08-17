package dnm;
import java.util.Random;
public class neudnm {
public static float[] w;
public static float toplamdeger;

public static int[][] ev;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  	  Random ra=new Random();
    //ev1-> kira= 1000 metre=80 nüfus=50 pahalı
  	//ev2-> kira= 1000 metre=200 nüfus=50 uygun
  	//ev3-> kira= 2000 metre=100 nüfus=50 pahalı
// olması gereken 1 olan -1
      ev= new int[15][5];
      w=new float[3];

  	      ev[0][0]=10000;
  	      ev[0][1]=80;
  	      ev[0][2]=50;
  	      ev[0][3]=-1;
  	      
  	      ev[1][0]=500;
	      ev[1][1]=100;
	      ev[1][2]=50;
	      ev[1][3]=1;
	      
  	      ev[2][0]=2000;
	      ev[2][1]=20;
	      ev[2][2]=50;
	      ev[2][3]=-1;
	      
	      ev[3][0]=3000;
	      ev[3][1]=50;
	      ev[3][2]=40;
	      ev[3][3]=-1;
	      
	      ev[4][0]=2000;
	      ev[4][1]=20;
	      ev[4][2]=50;
	      ev[4][3]=-1;
	      
	      ev[5][0]=2000;
	      ev[5][1]=10;
	      ev[5][2]=50;
	      ev[5][3]=-1;
	      
	      ev[6][0]=1000;
	      ev[6][1]=300;
	      ev[6][2]=50;
	      ev[6][3]=1;
	      
	      ev[7][0]=1000;
	      ev[7][1]=300;
	      ev[7][2]=250;
	      ev[7][3]=-1;
	      
	      
	      ev[8][0]=3500;
	      ev[8][1]=20;
	      ev[8][2]=70;
	      ev[8][3]=-1;
	      
	      ev[9][0]=600;
	      ev[9][1]=190;
	      ev[9][2]=50;
	      ev[9][3]=1;
	      
	      
	      ev[10][0]=100;
	      ev[10][1]=100;
	      ev[10][2]=400;
	      ev[10][3]=1;
	      
	      ev[11][0]=4000;
	      ev[11][1]=120;
	      ev[11][2]=20;
	      ev[11][3]=-1;
	      
	      ev[12][0]=400;
	      ev[12][1]=100;
	      ev[12][2]=600;
	      ev[12][3]=1;
	      
	      ev[13][0]=400;
	      ev[13][1]=150;
	      ev[13][2]=500;
	      ev[13][3]=1;
	      
	      ev[14][0]=300;
	      ev[14][1]=100;
	      ev[14][2]=600;
	      ev[14][3]=1;
	      for(int i=0;i<3;i++) {
	    	  	w[i] = (((ra.nextInt(100)+1)-50f)*2)/100f;

	      }
	    
	      for(int p=0;p<1000;p++) {
	    	  
	    
	   System.out.println();
	     
	      egit();
	      }  
testet();
	}
	public static void egit() {
	
	for(int i=0;i<15;i++) {
		
		 toplamdeger=ev[i][0]*w[0]+ev[i][1]*w[1]+ev[i][2]*w[2];
		  if(toplamdeger>0) {
			  
			  ev[i][4]=1;
			  
		  }
		  else { ev[i][4]=-1;}
  		  System.out.println(ev[i][0]+"  "+ev[i][1]+"  "+ev[i][2]+"  "+ev[i][3]+"  "+ev[i][4]+"  "+w[0]+"  "+w[1]+"  "+w[2]+"  "+toplamdeger);

			w[0]+=(ev[i][0]*(ev[i][3]-ev[i][4])*0.1)+(ev[i][3]-ev[i][4])*0.2;
			w[1]+=(ev[i][1]*(ev[i][3]-ev[i][4])*0.1)+(ev[i][3]-ev[i][4])*0.2;
			w[2]+=(ev[i][2]*(ev[i][3]-ev[i][4])*0.1)+(ev[i][3]-ev[i][4])*0.2;
			
	
	}
	}
	

	public static void testet() {
	// test ev -> kira 50 -metre200- nüfus100
	float finaldeger=50*w[0]+200*w[1]+100*w[2];
	if(finaldeger>0) {
		System.out.println("EV UYGUN");
	}
	else {		System.out.println("EV UYGUN DEĞİL");}
		
		
	}


}
