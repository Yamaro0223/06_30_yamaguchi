package com.company.function;

public class Word {
    public String word;
    public String meaning;

    public Word(){ }

    public Word(String w,String m){
        this.word = w;
        this.meaning = m;
    }

    public String toString(){
        return "単語は " + this.word + " 意味は " + this.meaning;
    }

}