package gameai;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Desktop.Action;



public class RedBall extends JFrame  {
public static int carx,ilerisensorx,sagsensorx,solsensorx,tespitedilenilerimesafe,tespitedilensagmesafe,tespitedilensolmesafe;
 public static int cary,ilerisensory,sagsensory,solsensory,soncary,reset,sýra=0,maxcary=500;
 public static float[]  w;
 public static float toplamdeger,wb;
 
 


    public RedBall()
    {
    	setTitle("redball");
    	setSize(500,500);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
 
    	ActionListener listener = (ActionListener) new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
          
  
            
            	Random r= new Random();
            	wb=(((r.nextInt(100)+1)-50f)*2)/100f;
            	
            	toplamdeger=tespitedilenilerimesafe*w[0]+tespitedilensagmesafe*w[1]+tespitedilensolmesafe*w[2];
            	if (toplamdeger>40) {carx--;}
            	if(0<toplamdeger&toplamdeger<40) {
            cary--;            		
            	}

            	
            	if(toplamdeger<0) {
            		
            		carx++;
            	}
            	
            	
            	
  	if(cary==soncary) {
            	reset++;
            	System.out.println(reset);
            	if(reset>100) {
            		if(cary<maxcary) {
                		maxcary=cary;
                		sýra=0;
                	}
            		carx=250;
            				cary=440;
            				reset=0;
            				 if(sýra%2 == 1){
            					 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
            					 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
            					 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

            					 sýra++;
            			        }else{
            			       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
            					 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
            					 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

            			   		 sýra++;
            			        }
            				 
            	}
            		
            	}
  	else {reset=0;}
  	
  	
  	
  
	
  	
  	
soncary=cary;
for(int i=1;i<101;i++) {
		

	
	
	 if(cary==500-i & carx==200) {
		 
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		
		 
			carx=250;
	    	cary=440;	     }
	 
	 if(cary==500-i & carx==300) {
	  	   
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		 
			carx=250;
	    	cary=440;	     }
	
	
	 if(cary==400-i & carx==300-i) {
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		 
		 
			carx=250;
	    	cary=440;     }
	 if(cary==400-i & carx==200-i) {
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		 
		 
			carx=250;
	    	cary=440;	     }
	 if(cary==300-i & carx==100+i) {
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
			carx=250;
	    	cary=440;	     }
	 if(cary==300-i & carx==200+i) {
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		 
			carx=250;
	    	cary=440;	     }
	 if(cary==200-i & carx==200) {
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		 
			carx=250;
	    	cary=440;	     }
	 if(cary==200-i & carx==300) {
	  	   
		 if(cary<maxcary) {
     		maxcary=cary;
     		sýra=0;
     	}
		 
		 if(sýra%2 == 1){
			 w[0]+=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]+=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]+=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

			 sýra++;
	        }else{
	       	w[0]-=tespitedilenilerimesafe*sýra/100+tespitedilenilerimesafe/100+wb/100*sýra;
			 w[1]-=tespitedilensagmesafe*sýra/100+tespitedilensagmesafe/100+wb/100*sýra;
			 w[2]-=tespitedilensolmesafe*sýra/100+tespitedilensolmesafe/100+wb/100*sýra;

	   		 sýra++;
	        }
		 
		 
		 
			carx=250;
	    	cary=440;	     }
	 
	 
	
}




               repaint();
               
               
            }
        };
        Timer timer = new Timer(3, listener);
        timer.start();
    }
    public void paint(Graphics g) {
		super.paint(g);

         g.drawLine(200, 500, 200, 400);
         g.drawLine(300, 500, 300, 400);
         g.drawLine(200, 400, 100, 300);
         g.drawLine(300, 400, 200, 300);
         g.drawLine(200, 300, 300, 200);
         g.drawLine(100, 300, 200, 200);
         g.drawLine(200, 200, 200, 100);
         g.drawLine(300, 200, 300, 100);

         
         
         
    	g.setColor(Color.RED);
    	g.fillOval(carx, cary, 20, 20);
    	g.setColor(Color.BLACK);

    	
    	

    	 ilerisensorx=carx;

    	 for(int i=1;i<101;i++) {
    	 	

    		 for(int j=1;j<51;j++) {
    		   	 ilerisensory=cary-j;


    	 	 if(ilerisensory==500-i & ilerisensorx==200) {
    	 	  	   
    	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	 	     }
    	 	 if(ilerisensory==500-i & ilerisensorx==300) {
  	 		   tespitedilenilerimesafe=cary-ilerisensory;

    	 	     }
    	 	 if(ilerisensory==400-i & ilerisensorx==300-i) {

  	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	     }
    	 	 if(ilerisensory==400-i & ilerisensorx==200-i) {

  	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	 	     }
    	 	 if(ilerisensory==300-i & ilerisensorx==100+i) {

  	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	 	     }
    	 	 if(ilerisensory==300-i & ilerisensorx==200+i) {

  	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	 	     }
    	 	 if(ilerisensory==200-i & ilerisensorx==200) {

  	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	 	     }
    	 	 if(ilerisensory==200-i & ilerisensorx==300) {

  	 		   tespitedilenilerimesafe=cary-ilerisensory;
    	 	     }
    	 	 
    	     	g.fillOval(carx,ilerisensory, 10, 10);

    		 }
    		 
    		 
    	 }


    	 sagsensory=cary;

    	 for(int i=1;i<101;i++) {
    	 	

    		 for(int j=1;j<51;j++) {
    		   	 sagsensorx=carx+j;


    	 	 if(sagsensory==500-i & sagsensorx==200) {
    	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 if(sagsensory==500-i & sagsensorx==300) {
    	 	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 if(sagsensory==400-i & sagsensorx==300-i) {
    	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	     }
    	 	 if(sagsensory==400-i & sagsensorx==200-i) {
    	 	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 if(sagsensory==300-i & sagsensorx==100+i) {
    	 	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 if(sagsensory==300-i & sagsensorx==200+i) {
    	 	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 if(sagsensory==200-i & sagsensorx==200) {
    	 	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 if(sagsensory==200-i & sagsensorx==300) {
    	 	  	   
  	 	  	   tespitedilensagmesafe=sagsensorx-carx;
    	 	     }
    	 	 
    	     	g.fillOval(sagsensorx,cary, 10, 10);

    		 }
    		 
    		 
    	 }
    	 
    	 
    	
    	 
    	 
    	 

    	 solsensory=cary;

    	 for(int i=1;i<101;i++) {
    	 	

    		 for(int j=1;j<51;j++) {
    		   	 solsensorx=carx-j;


    	 	 if(solsensory==500-i & solsensorx==200) {
    	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 if(solsensory==500-i & solsensorx==300) {
    	 	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 if(solsensory==400-i & solsensorx==300-i) {
    	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	     }
    	 	 if(solsensory==400-i & solsensorx==200-i) {
    	 	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 if(solsensory==300-i & solsensorx==100+i) {
    	 	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 if(solsensory==300-i & solsensorx==200+i) {
    	 	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 if(solsensory==200-i & solsensorx==200) {
    	 	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 if(solsensory==200-i & solsensorx==300) {
    	 	  	   
  	 	  	   tespitedilensolmesafe=carx-solsensorx;
    	 	     }
    	 	 
    	     	g.fillOval(solsensorx,cary, 10, 10);

    		 }
    		 
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
    	 System.out.println(tespitedilenilerimesafe+"  "+tespitedilensagmesafe+"  "+tespitedilensolmesafe+"  "+w[0]+"  "+w[1]+"  "+w[2]+"  "+toplamdeger+"  "+sýra);
    	 
    	 
    }


    public static void main(String[] args) {
        w=new float[3];

    	for(int i=0;i<3;i++) {
    		Random ra =new Random();
    	  	w[i] = (((ra.nextInt(100)+1)-50f)*2)/100f;

      }

    	tespitedilenilerimesafe=51;
    	tespitedilensagmesafe=51;
    	tespitedilensolmesafe=51;
    	carx=250;
    	cary=440;
    	
        RedBall r = new RedBall();




    	
    
    }
}
