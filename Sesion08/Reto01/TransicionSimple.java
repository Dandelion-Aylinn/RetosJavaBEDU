class TransicionSimple implements TransaccionHistoria{

    @Override
    public void cambiaEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("Entras por la puerta de la izquierda");
        } else {
            System.out.println("Entras por la puerta de la derecha");
        }
    }
    
}