package com.company;

import com.company.function.Word;

import java.util.Scanner;

public class ColLesson03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Word[] words = new Word[3];
        String wm[];

        String input;
        while(true) {
            System.out.println("単語と意味をスペース区切りで入力してください。");
            try {
                input = sc.nextLine();

                if(input.equals("end")){
                    break;
                }

                wm = input.split(" ");

                Word word = new Word(wm[0], wm[1]);

                words[i] = word;
                i ++;

            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("登録上限に達しました。");
                break;
            }
        }

        System.out.println(i + "件登録完了しました。");
        for(int r = 0;r < i;r ++) {
            System.out.println(words[r].toString());
        }
    }
}