import java.time.LocalDate;

public class Pessoa { 
    private String nome;
    private int anoNasci; //EX Tipagem Forte 
    private double altura;
    private double peso;

    public Pessoa(){
    this.nome = "";
    this.anoNasci = 0;
    this.altura = 0.0;
    this.peso = 0.0;
    }

public Pessoa(String nome, int anoNasci, double altura, double peso){
    this.nome = nome;
    this.anoNasci = anoNasci;
    this.altura = altura;
    this.peso = peso;
} 
public double calculoIMC(){ //Tipagem Estática 
    return this.peso / (this.altura * this.altura);
}

public double calculoAgua(){
    return this.peso * 0.035;
}

public int calculoIdade(){
int idadeHoje = LocalDate.now().getYear();
return idadeHoje - this.anoNasci;
}


public String classificacaoIMC(){
    double imc = calculoIMC();
    if (imc < 18.5) {
        return "Abaixo do peso";
    } else if (imc >= 18.5 && imc <= 24.9) {
        return "Peso normal";
    } else if (imc >= 25 && imc <= 29.9) {
        return "Sobrepeso";
    } else {
        return "Obesidade";
    }
}
    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + calculoIdade() + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("IMC: " + String.format("%.2f",calculoIMC()));
        System.out.println("Classificação IMC: " + classificacaoIMC());
        System.out.println("Água necessária por dia: " + String.format("%.2f", calculoAgua()) + " litros");
}
}

