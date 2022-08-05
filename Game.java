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

    abstract public void gameStart();

    public void gameEnd() {
    	System.out.println("れべるが" + this.getLevel() + "になりました！");
        System.out.println("まだ げーむを つづける？ つづけるなら y を おわりたいなら n をおしてね！" );
        System.out.println("はい ： y  / いいえ ： n");
        String ctn = new java.util.Scanner(System.in).nextLine();
    	if(ctn.equals("y")){
            System.out.println("げーむを つづけてくれて ありがとう！");
            System.out.println("れべる" + level + "からは ひらがなに【゜】が つく もんだいだよ！");
            System.out.println("がんばってね！");

    	}else {
            System.out.println("あそんでくれてありがとう！またきてね");
            System.exit(0);
        }

    }

}
