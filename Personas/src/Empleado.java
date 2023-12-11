import java.util.Date;
import java.util.GregorianCalendar;

class Empleado extends Persona{
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes,dia);
        altaContrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;
    }
    
    @Override
    public String dameDescripcion(){
        
        return "Este empleado tiene un Id=" + Id + " con un sueldo=" + sueldo;
    }
    
    public double dameSueldo(){
        
        return sueldo;
    }
    
    public Date dameFechaContrato(){
        
        return altaContrato;
        
    }
    public void subeSueldo(double porcentaje){
        
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
        
    }
    
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;
}