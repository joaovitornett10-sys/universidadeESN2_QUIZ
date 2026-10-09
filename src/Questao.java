public class Questao {
    // Atributos da Questão
    private String enunciado;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private String opcaoD;
    private String opcaoE;
    private String respostaCorreta;

    // Construtor para inicializar a questão
    public Questao(String enunciado, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String respostaCorreta) {
        this.enunciado = enunciado;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.respostaCorreta = respostaCorreta;
    }

    // Método para exibir a questão na tela
    public void exibirQuestao() {
        System.out.println("\n" + this.enunciado);
        System.out.println("A) " + this.opcaoA);
        System.out.println("B) " + this.opcaoB);
        System.out.println("C) " + this.opcaoC);
        System.out.println("D) " + this.opcaoD);
        System.out.println("E) " + this.opcaoE);
        System.out.print("Sua resposta: ");
    }

    // Método para validar se a resposta do usuário está correta
    public boolean verificarResposta(String respostaUsuario) {
        // Ignora letras maiúsculas ou minúsculas (a = A)
        return this.respostaCorreta.equalsIgnoreCase(respostaUsuario.trim());
    }
}
