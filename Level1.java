package hiragana;

public class Level1 extends Game{

	public void gameStart() {
		System.out.println("がめんに ででる ひらがな と  おなじ ひらがな を うちこんでね ！");
        System.out.println("れべるが あがると だんだん もんだいが むずかしくなるよ！");
        System.out.println();
        this.insert();
        System.out.println("れべる" + this.getLevel() + "から はじまるよ");
        do {
        	Level1 l1 = new Level1();

            setClg(10);
            l1.setNum((int)(Math.random()*(l1.getHiragana().length)));

            System.out.println(this.getHiragana(this.getNum()) + "\n とおなじひらがなを入力してね！");
            System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
            System.out.println(l1.getAbc(l1.getNum()));
            String ans1 = new java.util.Scanner(System.in).nextLine();

            //入力判定
            if(ans1.equals(l1.Hiragana(getNum()))) {
                corect++;
                count = clg-corect;
                System.out.println("だいせいかい。おめでとう！");

                if(count <= 0) {
                    System.out.println("れべるが 1 あがったよ！");
                }else {
                    System.out.println("あと" + count + "せいかいすると れべるがあがるよ");
                }
            }else {
                System.out.println("ざんねん せいかいできるまで ちょうせんしてね");
            }
        }
        while(corect < clg);
        level++;
        clg = 0;


	}

}
