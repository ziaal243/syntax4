import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.OutputStream;

enum Enginetypes{
    Diesel,
    Petrol,
    Electric,
    Hybrid,
    Gas,
    Hydrogin,
    Other
}
public class Lager1 {
    String Brand;
    String Model;
    int Year;
    Enginetypes Engine;
    
    public Lager1(String b, String m, int y, Enginetypes e){
        this.Brand = b;
        this.Model = m;
        this.Year = y;
        this.Engine = e;
    }

    private String Out(){
        return (this.Brand + "\t" + this.Model + "\t" + this.Year + "\t" + this.Engine +  "\n");
   }

   public static void AddingCars(ArrayList<Lager1> Lager){
        Lager.add(new Lager1("Volvo", "V90", 2020, Enginetypes.Diesel));
        Lager.add(new Lager1("MB", "CLA", 2020, Enginetypes.Hybrid));
        Lager.add(new Lager1("Volvo", "XC60", 2018, Enginetypes.Diesel));
        Lager.add(new Lager1("MB", "GLB", 2020, Enginetypes.Hybrid));
        Lager.add(new Lager1("Volvo", "XC90", 2019, Enginetypes.Petrol));
        Lager.add(new Lager1("MB", "E220", 2022, Enginetypes.Hybrid));
        Lager.add(new Lager1("Volvo", "C40", 2023, Enginetypes.Electric));   
    }

    public static void PrintOutStream(ArrayList<Lager1> Lager){
        for (Lager1 cars : Lager) {
            System.out.print((Lager.indexOf(cars)+1) + " " +cars.Out());
        }
    }

    public static void OutStream(ArrayList<Lager1> Lager, String LagerName){
        if (Lager.size() > 0){
            try {
                OutputStream out = new FileOutputStream(LagerName);
                for (Lager1 cars : Lager){
                    out.write(cars.Out().getBytes());   
                }    
                out.close();
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }  
    }

    public static void main(String[] args) {
        String FileName = "Lager3.txt";
        ArrayList<Lager1> Lager1 = new ArrayList<>();
        AddingCars(Lager1);
        OutStream(Lager1, FileName); 
    }
   
}


