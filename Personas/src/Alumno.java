class Alumno extends Persona{
    
    public Alumno(String nom, String car){
        
        super(nom);
        carrera=car;
    }
    
    @Override
    public String dameDescripcion(){
        
        return "Este alumno está estudiando la carrera de \"" + carrera + "\"";
        
    }
    
    private String carrera;
}
