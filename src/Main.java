package src;

import java.io.*;



public class Main {



    public static void main(String[] args) {

        Player user = new Player("ユーザ");

        Player com = new Player("CPU");



        //入力指示表示

        System.out.println("1.グー");

        System.out.println("2.チョキ");

        System.out.println("3.パー");

        System.out.println("あなたの手を選択してください。>");



        //ユーザ入力

        String input = null;

        try {

            BufferedReader inputuser = new BufferedReader(

                    new InputStreamReader(System.in)

            );

            input = inputuser.readLine();

        } catch (IOException e) {

            System.out.print("システムエラー");

            System.exit(0);

            return;

        }



        if (input == null) {

            System.out.print("1-3の値を入力してください。");

            System.exit(0);

            return;

        }



        //ユーザの入力によりジャンケンの手をセットする

        if (input.equals("1")) {

            user.setHand(new Gu());

        } else if (input.equals("2")) {

            user.setHand(new Choki());

        } else if (input.equals("3")) {

            user.setHand(new Pa());

        } else {

            System.out.print("1-3の値を入力してください。");

            System.exit(0);

            return;

        }


        com.createRandomHand();
        //以降にテストコードを追加して検証を行う
//        System.out.println("ランダムなジャンケンの手をCPUにセットする");
//        System.out.println(com.getHand().getHandName());

        int result = Game.judge(user, com);
    }

}