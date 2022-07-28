package hiragana;

public abstract class Game extends Hiragana_list{

    // 配列添え字格納用変数
	private int num;
	public int getNum( ) { return this.num;}
	public void setNum(int num) { this.num = num;}

	//プレイヤーのステータスフィールド
	private int level;
    public int getLevel() { return this.level;}
    public void setLevel(int level) {this.level = level ; }

    private int ans;
	public int getAns() {return this.ans;}
	public void setAns(int ans) { this.ans = ans;}

    private int collect;
    public int getCollect() { return this.collect;}
    public void setCollect(int collect) { this.collect = collect;}

    private int clg;
    public int getClg() { return this.clg ;}
    public void setClg(int clg) { this.clg = clg ;}

    private int count = this.getClg() - this.getCollect();
    public int getCount() {return this.count ;}

    public Game() {
    	this.level = 1;
    	this.collect = 0;
    	this.clg = 10;
    }

	public Game(int level) {
        this();
        this.level = level;
	}


	public void insert() {
		System.out.println("まず にゅうりょくもーどを かくにんするよ！");
        System.out.println("ためしに I ぼたんを おしてみてね！");
        String test = new java.util.Scanner(System.in).nextLine();
        if(test.equals("i")) {
        System.out.println("にゅうりょくもーどが あっていないよ！");
        System.out.println("Aぼたんの ひだりどなりにある CapsLockぼたんを おして\n"
                            + " にゅうりょくもーどを きりかえてね");
        }else {
             System.out.println("げーむを はじめられるよ");
        }
	}

    public void gameStart() {


        if (this.getLevel() <= 1) {
        	this.insert();
        }

        System.out.println("がめんに ででる ひらがな と  おなじ ひらがな を うちこんでね ！");
        System.out.println("れべるが あがると だんだん もんだいが むずかしくなるよ！");
        System.out.println();
        System.out.println("れべる" + this.getLevel() + "から はじまるよ");

        do {
        	Hiragana_list h = new Hiragana_list();
        	num = (int)(Math.random()*(h.getHiragana().length));
            this.setClg(10);


            System.out.println(h.getHiragana(num) + "\n とおなじひらがなを入力してね！");
            System.out.println("がめんに うつってる あるふぁべっとと おなじのを おしてみてね ");
            System.out.println(getAbc(num));
            String ans = new java.util.Scanner(System.in).nextLine();

            //入力判定
            if(ans.equals(hiragana[num1])) {
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
