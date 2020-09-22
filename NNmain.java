package neun;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class neun {
static int random0,random1,veri1sayisi=81,veri2sayisi=27,veri3sayisi=26,veri4sayisi=31,orsayisi=veri3sayisi+veri2sayisi+veri1sayisi+veri4sayisi;
public static float gray;

public static double[][] degerler,testdegerler;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		testdegerler=new double[30000][32*32+3];

		degerler=new double[orsayisi+4][32*32+4];

		File file = null;
		for (int d=0;d<orsayisi;d++) {
		if(d<veri1sayisi) {
		  file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\goz"+d+".jpg");

		}
		if(d>=veri1sayisi & d<veri1sayisi+veri2sayisi) {
			int a=d-veri1sayisi;
			  file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\arb"+a+".jpg");

			}
		if(d>=veri1sayisi+veri2sayisi & d<veri1sayisi+veri2sayisi+veri3sayisi) {
			int a=d-(veri1sayisi+veri2sayisi);
			  file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\skl"+a+".jpg");

			}
		if(d>=veri1sayisi+veri2sayisi+veri3sayisi & d<veri1sayisi+veri2sayisi+veri3sayisi+veri4sayisi) {
			int a=d-(veri1sayisi+veri2sayisi+veri3sayisi);
			  file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\other"+a+".jpg");

			}
	        BufferedImage image =null;
            try {
				image = ImageIO.read(file);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
int sira=0;
for (int i=0;i<image.getWidth();i++) {
	for (int j=0;j<image.getHeight();j++) {
           Color mycolor = new Color(image.getRGB(i, j));
           float gry;
           gry=(mycolor.getRed()*0.3f)+(mycolor.getGreen()*0.59f)+(mycolor.getBlue()*0.11f);
           if(d<veri1sayisi) {
        	   degerler[d][sira]=gry;
               degerler[d][1024]=1;
               degerler[d][1025]=0;
               degerler[d][1026]=0;
               degerler[d][1027]=0;

           }
           
           if(d>=veri1sayisi & d<veri1sayisi+veri2sayisi) {
   		
        	   degerler[d][sira]=gry;
               degerler[d][1024]=0;
               degerler[d][1025]=1;
               degerler[d][1026]=0;
               degerler[d][1027]=0;

   			}
           
           if(d>=veri1sayisi+veri2sayisi & d<veri1sayisi+veri2sayisi+veri3sayisi) {
        	   degerler[d][sira]=gry;
               degerler[d][1024]=0;
               degerler[d][1025]=0;
               degerler[d][1026]=1;
               degerler[d][1027]=0;

   			}
           
           
           if(d>=veri1sayisi+veri2sayisi+veri3sayisi & d<veri1sayisi+veri2sayisi+veri3sayisi+veri4sayisi) {
   			
        	   
        	   degerler[d][sira]=gry;
               degerler[d][1024]=0;
               degerler[d][1025]=0;
               degerler[d][1026]=0;
               degerler[d][1027]=1;
        	   
        	   
   			}
           
           
           
           
           
           
           
           
           
           
           
		   sira++;
	                                   }
                            } 




		}
		
		 file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\testgoz.jpg");
		 
		 
		 
		 
		 
	     BufferedImage image =null;
	     try {
				image = ImageIO.read(file);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	int sira=0;
	for (int i=0;i<image.getWidth();i++) {
	for (int j=0;j<image.getHeight();j++) {
	    Color mycolor = new Color(image.getRGB(i, j));
	    float gry;
	    gry=(mycolor.getRed()*0.3f)+(mycolor.getGreen()*0.59f)+(mycolor.getBlue()*0.11f);
	 	   degerler[orsayisi][sira]=gry;
	        degerler[orsayisi][1024]=1;
	        degerler[orsayisi][1025]=0;
	        degerler[orsayisi][1026]=0;
	        degerler[orsayisi][1027]=0;

		 
		 sira++;
		 
	}
	}


	
	 file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\testaraba.jpg");
	 
	 
	 
	 
	 
      image =null;
     try {
			image = ImageIO.read(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 sira=0;
for (int i=0;i<image.getWidth();i++) {
for (int j=0;j<image.getHeight();j++) {
    Color mycolor = new Color(image.getRGB(i, j));
    float gry;
    gry=(mycolor.getRed()*0.3f)+(mycolor.getGreen()*0.59f)+(mycolor.getBlue()*0.11f);
 	   degerler[orsayisi+1][sira]=gry;
        degerler[orsayisi+1][1024]=0;
        degerler[orsayisi+1][1025]=1;
        degerler[orsayisi+1][1026]=0;
        degerler[orsayisi+1][1027]=0;

	 
	 sira++;
	 
}
}
	
	
	
	
	
	
	
file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\datar\\testsakal.jpg");





image =null;
try {
		image = ImageIO.read(file);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
sira=0;
for (int i=0;i<image.getWidth();i++) {
for (int j=0;j<image.getHeight();j++) {
Color mycolor = new Color(image.getRGB(i, j));
float gry;
gry=(mycolor.getRed()*0.3f)+(mycolor.getGreen()*0.59f)+(mycolor.getBlue()*0.11f);
  degerler[orsayisi+2][sira]=gry;
  degerler[orsayisi+2][1024]=0;
  degerler[orsayisi+2][1025]=0;
  degerler[orsayisi+2][1026]=1;
  degerler[orsayisi+2][1027]=0;


sira++;

}
}

netw N= new netw(1024,256,5,4,degerler);
for(int k=0;k<600;k++) {
	for(int i=0;i<orsayisi;i++) {

		N.geriyayilim(i);

		System.out.println(k+1);
	}
}


N.lr=0;



file = new File("C:\\Users\\muchi\\OneDrive\\Masaüstü\\data\\yuz0.jpg");





image =null;
try {
		image = ImageIO.read(file);

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
for(int g=0;g<500;g++)
{
Random rn0 = new Random();

random0 = rn0.nextInt(image.getWidth()-128);
	
Random rn1 = new Random();

random1 = rn1.nextInt(image.getHeight()-128);
System.out.println(random0+"   "+random1);
for(int i=0;i<128;i++) {
Color myWhite = new Color(0, 0, 0); // Color black
int rgb = myWhite.getRGB();
image.setRGB(random0+i, random1+i, rgb);
}
sira=0;
for(int i=0;i<128;i+=4) {
	
	for(int j=0;j<128;j+=4) {
		
		gray=0;
		
		for(int k=0;k<4;k++) {
			for(int l=0;l<4;l++) {
				

				Color mycolor = new Color(image.getRGB(random0+i+k, random1+j+l));
				gray+=(mycolor.getRed()*0.3f)+(mycolor.getGreen()*0.59f)+(mycolor.getBlue()*0.11f);
			}
		}
		
		  testdegerler[g][sira]=(double)gray/16f;

		sira++;
		
		
	}
}
N.test(testdegerler, g,random0,random1,image);
}
System.out.println( "aaaaaaaaaaa"+testdegerler[39][1024]);

	
show s= new show(image);

	

	 
	 
System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
N.geriyayilim(orsayisi);

System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
N.geriyayilim(orsayisi+1);
	 
System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
N.geriyayilim(orsayisi+2);	 
	 
	 
	 
	}

}
