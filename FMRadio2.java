import java.util.Scanner; 
public class FMRadio2
{
private boolean powerison;
   public void on()
   {
   powerison=true;
   }
   private boolean powerisoff;
   public void off()
   {
   powerison=false;
   }
   public int vol;
   public void volume()  
   {
	   vol = 0;
   }
   public void add()
   {
	   vol++;
   }
   public void reset()
   {
	   vol = 0;
   }
   public int sayvol()
   {
	   return vol;
   }    public double fre;
   public void frequency()  
   {
	   fre = 0;
   }
   public void addf()
   {
	   fre= fre + .1;
   }
   public void resetf()
   {
	   fre = 0;
   }
   public double sayfre()
   {
	   return fre;
   }
   public String toString()
   {
	   if(powerison==true)
      return ("The radio is on, the volume is " + vol + ", and the frequency is " + fre);
      else 
      return ("Radio Off.");
   }
   }
   
	 
	   
	   