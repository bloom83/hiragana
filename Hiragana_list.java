package hiragana;

public abstract class Hiragana_list {



	// ヒント用ひらがな
    private final String[] hiragana = {
            "あ","い","う","え","お",
            "か","き","く","け","こ",
            "さ","し","す","せ","そ",
            "た","ち","つ","て","と",
            "な","に","ぬ","ね","の",
            "は","ひ","ふ","へ","ほ",
            "ま","み","む","め","も",
            "や","ゆ","よ",
            "ら","り","る","れ","ろ",
            "わ","を","ん",
            "きゃ","きゅ","きょ",
            "しゃ","しゅ","しぇ","しょ",
            "ちゃ","ちゅ","ちぇ","ちょ",
            "にゃ","にゅ","にょ",
            "ひゃ","ひゅ","ひょ",
            "みゃ","みゅ","みょ",
            "りゃ","りゅ","りょ",
            "てぃ","っ",
            "ぁ","ぃ","ぅ","ぇ","ぉ",
            "ゃ","ゅ","ょ"
            };

    // ヒント用ひらがな 濁音
    private final String[] dakuon = {
            "が","ぎ","ぐ","げ","ご",
            "ざ","じ","ず","ぜ","ぞ",
            "だ","ぢ","づ","で","ど",
            "ば","び","ぶ","べ","ぼ",
            "ぎゃ","ぎゅ","ぎょ",
            "じゃ","じゅ","じょ",
            "ぢゃ","ぢゅ","ぢょ",
            "びゃ","びゅ","びょ",
            "でぃ"
            };
    // ヒント用ひらがな 半濁音
    private final String[] hanDaku = {
            "ぱ","ぴ","ぷ","ぺ","ぽ",
            "ぴゃ","ぴゅ","ぴょ"
            };

    // 最終問題用 ひらがな全部
    private final String[] alHira = {
            "あ","い","う","え","お",
            "か","き","く","け","こ",
            "さ","し","す","せ","そ",
            "た","ち","つ","て","と",
            "な","に","ぬ","ね","の",
            "は","ひ","ふ","へ","ほ",
            "ま","み","む","め","も",
            "や","ゆ","よ",
            "ら","り","る","れ","ろ",
            "わ","を","ん",
            "きゃ","きゅ","きょ",
            "しゃ","しゅ","しぇ","しょ",
            "ちゃ","ちゅ","ちぇ","ちょ",
            "にゃ","にゅ","にょ",
            "ひゃ","ひゅ","ひょ",
            "みゃ","みゅ","みょ",
            "りゃ","りゅ","りょ",
            "てぃ","っ",
            "ぁ","ぃ","ぅ","ぇ","ぉ",
            "ゃ","ゅ","ょ",
            "が","ぎ","ぐ","げ","ご",
            "ざ","じ","ず","ぜ","ぞ",
            "だ","ぢ","づ","で","ど",
            "ば","び","ぶ","べ","ぼ",
            "ぎゃ","ぎゅ","ぎょ",
            "じゃ","じゅ","じょ",
            "ぢゃ","ぢゅ","ぢょ",
            "びゃ","びゅ","びょ",
            "でぃ",
            "ぱ","ぴ","ぷ","ぺ","ぽ",
            "ぴゃ","ぴゅ","ぴょ"
           };

    // ヒント用アルファベット
    private final String[] abc = {
            "a","i","u","e","o",
            "ka","ki","ku","ke","ko",
            "sa","si","su","se","so",
            "ta", "ti","tu","te","to",
            "na","ni","nu","ne","no",
            "ha","hi","hu","he","ho",
            "ma","mi","mu","me","mo",
            "ya","yu","yo",
            "ra","ri","ru","re","ro",
            "wa","wo","nn",
            "kya","kyu","kyo",
            "sya","syu","sye","syo",
            "tya","tyu","tye","tyo",
            "nya","nyu","nyo",
            "hya","hyu","hyo",
            "mya","myu","myo",
            "rya","ryu","ryo",
            "thi","ltu",
            "la","li","lu","le","lo",
            "lya","lyu","lyo"
            };

    // ヒント用アルファベット 濁音
    private final String[] dakuAbc = {
            "ga","gi","gu","ge","go",
            "za","zi","zu","ze","zo",
            "da","di","du","de","do",
            "ba","bi","bu","be","bo",
            "gya","gyu","gyo",
            "ja","ju","jo",
            "dya","dyu","dyo",
            "bya","byu","byo",
            "dhi"
            };

    // ヒント用アルファベット 半濁音
    private final String[] handakuAbc = {
    		"pa","pi","pu","pe","po",
    		"pya","pyu","pyo"
            };

    // ヒント用アルファベット全部
    private final String[] alAbc = {
    		"a","i","u","e","o",
    		"ka","ki","ku","ke","ko",
    		"sa","si","su","se","so",
    		"ta", "ti","tu","te","to",
    		"na","ni","nu","ne","no",
    		"ha","hi","hu","he","ho",
    		"ma","mi","mu","me","mo",
    		"ya","yu","yo",
    		"ra","ri","ru","re","ro",
    		"wa","wo","nn",
    		"kya","kyu","kyo",
    		"sya","syu","sye","syo",
    		"tya","tyu","tye","tyo",
    		"nya","nyu","nyo",
    		"hya","hyu","hyo",
    		"mya","myu","myo",
    		"rya","ryu","ryo",
    		"thi","ltu",
    		"la","li","lu","le","lo",
    		"lya","lyu","lyo",
    		"ga","gi","gu","ge","go",
    		"za","zi","zu","ze","zo",
    		"da","di","du","de","do",
    		"ba","bi","bu","be","bo",
    		"gya","gyu","gyo",
    		"ja","ju","jo",
    		"dya","dyu","dyo",
    		"bya","byu","byo",
    		"dhi",
    		"pa","pi","pu","pe","po",
    		"pya","pyu","pyo"
            };

    private int level;
    public int getLevel() { return this.level;}
    public void setLevel(int level) {this.level = level ; }

    private int collect;
    public int getCollect() { return this.collect;}
    public void setCollect(int collect) { this.collect = collect;}

    private int clg;
    public int getClg() { return this.clg ;}
    public void setClg(int clg) { this.clg = clg ;}

    private int count = this.getClg() - this.getCollect();
    public int getCount() {return this.count ;}

    public Hiragana_list( ) {
    	this.level = 1;
    	this.collect = 0;
    	this.clg = 10;
    }

    public Hiragana_list(int level, int collect, int clg) {
    	this.setLevel(level);
    	this.setCollect(collect);
    	this.setClg(clg);
    }
}