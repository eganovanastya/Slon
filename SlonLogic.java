package org.example;

public class SlonLogic {
    private boolean flag = true;
    private PhrasesSlon logic = new PhrasesSlon();

    public String start(){
        return logic.getHelp();
    }

    public boolean bool(){
        return flag;
    }

    public String ifelse(String s){
        if(s.equals("\\q")) {
            flag = false;
            return logic.getEnd();
        }else if(s.equals("\\help")){
            return logic.getHelp();
        }else{
            return logic.getQuestion(s);
        }
    }
}
