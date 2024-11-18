public  class Carro extends Vehiculo{
    public Carro(String marca, String modelo, double precio){
        super(marca, modelo, precio);
    }
    public String getTipo(){
        return "Carro";
    }
}
