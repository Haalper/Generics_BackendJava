class Hatch extends Carro {
    public Hatch(String modelo) {
        super(modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um Hatch " + getModelo());
    }
}
