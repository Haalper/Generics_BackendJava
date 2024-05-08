class Sedan extends Carro {
    public Sedan(String modelo) {
        super(modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um Sedan " + getModelo());
    }
}
