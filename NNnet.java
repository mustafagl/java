package neun;



import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Random;


public class netw {
 
  public static int[][] ev;
   static double error;
  Random r,rr;
    static int dog=0;

  public static double [] inputdgr,hiddengdgr,hiddenkdgr,outputdgr,e_output,d_output,e_hiddenk,e_hiddeng,d_hiddenk,d_hiddeng;
  double toplamo,lr=0.01;
  public static double[][] w_hiddeng,w_hiddenk,w_output,dw_output,dw_hiddeng,dw_hiddenk,degerler;
    public static int input_s,hiddeng_s,hiddenk_s,output_s,orsayisi=164;
    
  double [] wb_output,wb_hiddenk,wb_hiddeng;
  double [] d_wb_hiddeng,d_wb_hiddenk,d_wb_output;


  public netw(int input_s ,int hiddeng_s,int hiddenk_s,int output_s,double[][] degerler){
    
    
    this.degerler=degerler;
    
    
    
   
    
    
    e_output = new double[output_s];
    d_output = new double[output_s];
    e_hiddenk = new double[hiddenk_s];
    d_hiddenk = new double[hiddenk_s];
    e_hiddeng = new double[hiddeng_s];
    d_hiddeng = new double[hiddeng_s];
this.input_s=input_s;
this.hiddeng_s=hiddeng_s;
this.hiddenk_s=hiddenk_s;
this.output_s=output_s;


inputdgr=new double[input_s];
hiddengdgr=new double[hiddeng_s];
hiddenkdgr=new double[hiddenk_s];
outputdgr=new double[output_s];

w_hiddeng = new double[input_s][hiddeng_s];
w_hiddenk = new double[hiddeng_s][hiddenk_s];
w_output = new double[hiddenk_s][output_s];
dw_output = new double[hiddenk_s][output_s];
dw_hiddenk = new double[hiddeng_s][hiddenk_s];
dw_hiddeng = new double[input_s][hiddeng_s];

wb_output = new double[output_s];
wb_hiddenk = new double[hiddenk_s];
wb_hiddeng = new double[hiddeng_s];
d_wb_output = new double[output_s];
d_wb_hiddenk = new double[hiddenk_s];
d_wb_hiddeng = new double[hiddeng_s];


r = new Random();



for(int i = 0; i < hiddeng_s; i++) {
  wb_hiddeng[i] =((r.nextFloat())-0.5f)*2;
  for(int j = 0; j < input_s; j++) {
    w_hiddeng[j][i] =  ((r.nextFloat())-0.5f)*2;
  }
}

for(int i = 0; i < hiddenk_s; i++) {
  wb_hiddenk[i] =  ((r.nextFloat())-0.5f)*2;
  for(int j = 0; j < hiddeng_s; j++) {
    w_hiddenk[j][i] = ((r.nextFloat())-0.5f)*2;
  }
}

for(int i = 0; i < output_s; i++) {
  wb_output[i] = ((r.nextFloat())-0.5f)*2;
  for(int j = 0; j < hiddenk_s; j++) {
    w_output[j][i] = ((r.nextFloat())-0.5f)*2;
  }
}


/*
for(int i = 0; i < input_s; i++) {
  
  for(int j = 0; j < hiddeng_s; j++) {
    w_hiddeng[i][j] = r.nextFloat();

  }
}

for(int i = 0; i < hiddeng_s; i++) {
  for(int j = 0; j < hiddenk_s; j++) {
    w_hiddenk[i][j] = r.nextFloat();

  }
}

for(int i = 0; i < hiddenk_s; i++) {
  for(int j = 0; j < output_s; j++) {
    w_output[i][j] = r.nextFloat();

  }
}
*/




} 
  public void ileriyayilim(int ordeger) {
    
    for(int i = 0;i<input_s;i++) {
      inputdgr[i]=degerler[ordeger][i];
    }

    for(int i = 0;i<hiddeng_s;i++) {
      hiddengdgr[i]=0;

      for(int j = 0;j<input_s;j++) {
        hiddengdgr[i]+=w_hiddeng[j][i]*inputdgr[j];

      }
      hiddengdgr[i] += wb_hiddeng[i];

      hiddengdgr[i]=sigmoud(hiddengdgr[i]);
    }
    
    
    for(int i = 0;i<hiddenk_s;i++) {
      hiddenkdgr[i]=0;

      for(int j = 0;j<hiddeng_s;j++) {
        hiddenkdgr[i]+=w_hiddenk[j][i]* hiddengdgr[j];

      }
      hiddenkdgr[i] += wb_hiddenk[i];

      hiddenkdgr[i]=relu(hiddenkdgr[i]);
    }
    toplamo=0;
    for(int i = 0;i<output_s;i++) {
      outputdgr[i]=0;

      for(int j = 0;j<hiddenk_s;j++) {
        outputdgr[i]+=w_output[j][i]* hiddenkdgr[j];

        
      }
      outputdgr[i] += wb_output[i];

      outputdgr[i]=sigmoud(outputdgr[i]);
        toplamo+= outputdgr[i];
    }
    for(int i = 0;i<output_s;i++) {
      if(outputdgr[i]<0)
      {
    //    outputdgr[i]=0;
      }
      if(toplamo!=0) {
      outputdgr[i]=outputdgr[i]/toplamo;
      }
    }
    
    
  }
  
  
  
  public void geriyayilim(int ordeger) {
  error=0;
  ileriyayilim(ordeger);
    for(int i = 0;i<output_s;i++) {
      e_output[i] = (double) degerler[ordeger][input_s+i] - outputdgr[i];
    }
    for(int i = 0; i < output_s; i++) {
      d_output[i] = e_output[i] * dsigmoid(outputdgr[i]);
    }
    
    for(int i = 0; i < output_s; i++) {
      for(int j = 0; j < hiddenk_s; j++) {
        dw_output[j][i] = (float) (hiddenkdgr[j] * d_output[i]);
      }
      d_wb_output[i] = d_output[i];

    }
    
    
    // Hiddenk için yapýlan iþlemler
    for(int i = 0; i < hiddenk_s; i++) {
      e_hiddenk[i] = 0;
      for(int j = 0; j <output_s; j++) {
        e_hiddenk[i] += d_output[j] * w_output[i][j];
      }
      
    }
    
    for(int i = 0; i < hiddenk_s; i++) {
      d_hiddenk[i] = e_hiddenk[i] * drelu_leaky(hiddenkdgr[i]);
    }
    
    for(int i = 0; i < hiddenk_s; i++) {
      for(int j = 0; j < hiddeng_s; j++) {
        dw_hiddenk[j][i] =  (hiddengdgr[j] * d_hiddenk[i]);
      }
      d_wb_hiddenk[i] = d_hiddenk[i];

    }
    
    for(int i = 0; i < hiddeng_s; i++) {
      e_hiddeng[i] = 0;
      for(int j = 0; j <hiddenk_s; j++) {
        e_hiddeng[i] += d_hiddenk[j] * w_hiddenk[i][j];
      }
    }
    
    for(int i = 0; i < hiddeng_s; i++) {
      d_hiddeng[i] = e_hiddeng[i] * dsigmoid(hiddengdgr[i]);
    }
    
    for(int i = 0; i < hiddeng_s; i++) {
      for(int j = 0; j < input_s; j++) {
        dw_hiddeng[j][i] = (float) (inputdgr[j] * d_hiddeng[i]);
      }
      d_wb_hiddeng[i] = d_hiddeng[i];

    }
    
    
    
    for(int i = 0; i < output_s; i++) {
      for(int j = 0; j < hiddenk_s; j++) {
        w_output[j][i] += dw_output[j][i] * lr;
      }
      wb_output[i] += d_wb_output[i] * lr;

    }
    
    for(int i = 0; i < hiddenk_s; i++) {
      for(int j = 0; j < hiddeng_s; j++) {
        w_hiddenk[j][i] += dw_hiddenk[j][i] * lr;
      }
      wb_hiddenk[i] += d_wb_hiddenk[i] * lr;

    }
    
    for(int i = 0; i < hiddeng_s; i++) {
      for(int j = 0; j < input_s; j++) {
        w_hiddeng[j][i] += dw_hiddeng[j][i] * lr;
      }
      wb_hiddeng[i] += d_wb_hiddeng[i] * lr;

    }
    
    
    
    
    
    
  
    
    
    for(int i = 0;i<output_s;i++) {

      System.out.println(degerler[ordeger][input_s+i]+"  "+outputdgr[i]+"   "+e_output[i]+"     "+w_hiddenk[0][0]);
    }
    System.out.println("         ");

    if(outputdgr[0]>=outputdgr[1]&outputdgr[0]>=outputdgr[2]&outputdgr[0]>outputdgr[3]&degerler[ordeger][1024]==1) {
      
      dog++;
      
    }
    

    if(outputdgr[1]>outputdgr[0]&outputdgr[1]>outputdgr[2]&outputdgr[1]>outputdgr[3]&degerler[ordeger][1025]==1) {
      
      dog++;
      
    }

    if(outputdgr[2]>outputdgr[1]&outputdgr[2]>outputdgr[0]&outputdgr[2]>outputdgr[3]&degerler[ordeger][1026]==1) {
      
      dog++;
      
    }
if(outputdgr[3]>outputdgr[1]&outputdgr[3]>outputdgr[0]&outputdgr[3]>outputdgr[2]&degerler[ordeger][1027]==1) {
      
      dog++;
      
    }
    
    if(ordeger==orsayisi) {
    System.out.println((float)dog/(orsayisi-1)+"vvvvvv");
    dog=0;
    karistir();

    }
    
    
  }
  public void karistir() {
    
    
      rr = new Random();

      for(int i=0;i<90;i++) {
        double[][] c ;
        c=new double [orsayisi+1][input_s+output_s];
      int a= rr.nextInt(orsayisi+1);
      int b= rr.nextInt(orsayisi+1);
for(int k=0;k<input_s+output_s;k++) {
      c[a][k]=degerler[a][k];
      
}
for(int l=0;l<input_s+output_s;l++) {
  degerler[a][l]=degerler[b][l];
  
}
      
for(int m=0;m<input_s+output_s;m++) {
  degerler[b][m]=c[a][m];
  
}
      
      System.out.println("veri karıştırıldı");
      }
    
  }
  
  public void test(double[][] testdegerler,int testdeger,int ran0,int ran1,BufferedImage img) {
    
    

    
    for(int i = 0;i<input_s;i++) {
      inputdgr[i]=testdegerler[testdeger][i];
    }

    for(int i = 0;i<hiddeng_s;i++) {
      hiddengdgr[i]=0;

      for(int j = 0;j<input_s;j++) {
        hiddengdgr[i]+=w_hiddeng[j][i]*inputdgr[j];

      }
      hiddengdgr[i] += wb_hiddeng[i];

      hiddengdgr[i]=sigmoud(hiddengdgr[i]);
    }
    
    
    for(int i = 0;i<hiddenk_s;i++) {
      hiddenkdgr[i]=0;

      for(int j = 0;j<hiddeng_s;j++) {
        hiddenkdgr[i]+=w_hiddenk[j][i]* hiddengdgr[j];

      }
      hiddenkdgr[i] += wb_hiddenk[i];

      hiddenkdgr[i]=relu(hiddenkdgr[i]);
    }
    toplamo=0;
    for(int i = 0;i<output_s;i++) {
      outputdgr[i]=0;

      for(int j = 0;j<hiddenk_s;j++) {
        outputdgr[i]+=w_output[j][i]* hiddenkdgr[j];

        
      }
      outputdgr[i] += wb_output[i];

      outputdgr[i]=sigmoud(outputdgr[i]);
        toplamo+= outputdgr[i];
    }
    for(int i = 0;i<output_s;i++) {
      if(outputdgr[i]<0)
      {
    //    outputdgr[i]=0;
      }
      if(toplamo!=0) {
      outputdgr[i]=outputdgr[i]/toplamo;
      }
      System.out.println(outputdgr[i]);
    }
if(outputdgr[0]>0.95f) {
      
  for(int i=0;i<64;i++) {
    Color myWhite = new Color(0, 255, 0); 
    int rgb = myWhite.getRGB();
    img.setRGB(ran0+i, ran1+i, rgb);
    }     
    }
    
  
    
  }
  
  public double drelu_leaky(double x) {
    return (x > 0)?1:0.3;
  }
  
  
  
  
  public double sigmoud(double x) {
    return  (1 / (1 + Math.exp(-x)));
  }
  public double relu(double x) {
    return Math.max(0, x);
  }
  public double dsigmoid(double x) {
    return x * (1-x);
  }
}
