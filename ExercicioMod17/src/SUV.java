class SUV extends Carro {
    public SUV(String modelo) {
        super(modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um SUV " + getModelo());
    }
}
