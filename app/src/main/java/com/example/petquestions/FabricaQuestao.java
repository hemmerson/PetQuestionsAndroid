package com.example.petquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FabricaQuestao {
    public static List<Questao> criaQuestoes01(){

        List<Questao> questions = new ArrayList<>();
        // Criação das questões
        String opcaoA = "Possui uma pelagem grossa e longa.";
        String opcaoB = "Suas patas não possuem membranas interdigitais.";
        String opcaoC = "Tem hábitos predominantemente diurnos.";
        String opcaoD = "Sua cauda pode chegar a um terço do comprimento do seu corpo.";
        List<String> options1 = Arrays.asList(opcaoA,opcaoB,opcaoC,opcaoD);
        questions.add(new Questao("Qual das seguintes características descreve corretamente a lontra?", options1, 3));

        opcaoA = "Diurno";
        opcaoB = "Noturno";
        opcaoC = "Crepuscular";
        opcaoD = "Matutino";
        List<String> options2 = Arrays.asList(opcaoA,opcaoB,opcaoC,opcaoD);
        questions.add(new Questao("Qual é o hábito predominante da lontra em relação ao seu comportamento?", options2, 1));

        opcaoA = "Grandes e pontiagudas";
        opcaoB = "Longas e peludas";
        opcaoC = "Pequenas e arredondadas";
        opcaoD = "Curtas e triangulares";
        List<String> options3 = Arrays.asList(opcaoA,opcaoB,opcaoC,opcaoD);
        questions.add(new Questao("Como são as orelhas da lontra?", options3, 2));

        // Adicione mais questões conforme necessário

        return questions;
    }

    public static List<Questao> criaQuestoes02(){

        List<Questao> questions = new ArrayList<>();
        // Criação das questões
        String opcaoA = "Possuem sangue azul";
        String opcaoB = "São capazes de caminhar sobre líquidos";
        String opcaoC = "Praticam a reciclagem de suas teias";
        String opcaoD = "Têm veneno extremamente potente";
        List<String> options1 = Arrays.asList(opcaoA,opcaoB,opcaoC,opcaoD);
        questions.add(new Questao("Qual característica das aranhas é compartilhada com as lagostas e os caracóis?", options1, 0));

        opcaoA = "Duas vezes mais fortes";
        opcaoB = "Três vezes mais fortes";
        opcaoC = "Cinco vezes mais fortes";
        opcaoD = "Dez vezes mais fortes";
        List<String> options2 = Arrays.asList(opcaoA,opcaoB,opcaoC,opcaoD);
        questions.add(new Questao("Qual é a proporção de força das teias de aranha em comparação com o aço?", options2, 2));

        opcaoA = "Nenhuma";
        opcaoB = "Apenas uma";
        opcaoC = "Cerca de 5%";
        opcaoD = "Cerca de 10%";
        List<String> options3 = Arrays.asList(opcaoA,opcaoB,opcaoC,opcaoD);
        questions.add(new Questao("Quantas espécies de aranhas são herbívoras entre todas as espécies descobertas até o momento?", options3, 1));

        // Adicione mais questões conforme necessário

        return questions;
    }




}
