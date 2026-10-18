package org.example;

public class PhrasesSlon {
    private String phrase;
    private String help;
    private String end;

    public PhrasesSlon(){
        this.phrase = "\", а ты купи слона";
        this.help = "Привет! я бот, купи слона или напиши \\q, чтобы закончить. (для повторения инструкции напиши \\help)";
        this.end = "ладно пока";
    }

    public String getHelp() {
        return help;
    }

    public String getQuestion(String s){
        return "все говорят \"" + s + phrase;
    }

    public String getEnd(){
        return end;
    }

}
