package com.company;

import com.company.function.Word;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
//        Word[] word = new Word[3]; 配列数が入る
        ArrayList<Word> words = new ArrayList<>(); //配列数は不要
        String wm[];

        String input;
        while(i < 3) {
            System.out.println("単語と意味をスペース区切りで入力してください。");
            try {
                input = sc.nextLine();

                if(input.equals("end")){
                    break;
                }

            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("入力が不十分です。");
                continue;
            }

            wm = input.split(" ");

            Word word = new Word(wm[0], wm[1]);

            //word[i] = word;
            words.add(word);
            i ++;
        }

        System.out.println(i + "件登録完了しました。");
        for(int r = 0;r < i;r ++) {
            System.out.println(words.get(r).toString());
        }
    }
}