package com.example.calculadoradeboda;

public class DatosPareja {

    private int edad;
    private float altura;







    public DatosPareja() {
    }

    public DatosPareja(int edad, float altura) {
        this.edad = edad;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "DatosPareja{" +
                "edad=" + edad +
                ", altura=" + altura +
                '}';
    }
}
