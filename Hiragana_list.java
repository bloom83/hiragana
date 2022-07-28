package hiragana;

public class Hiragana_list {



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
    public String[] getHiragana() {return this.hiragana;}
    public String getHiragana(int n){ return this.hiragana[n]; }


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
    public String[] getDakuon() { return this.dakuon; }
    public String getDakuon(int n) { return this.dakuon[n]; }


    // ヒント用ひらがな 半濁音
    private final String[] hanDaku = {
            "ぱ","ぴ","ぷ","ぺ","ぽ",
            "ぴゃ","ぴゅ","ぴょ"
            };
    public String[] getHanDaku() { return this.hanDaku;}
    public String getHanDaku(int n) { return this.hanDaku[n];}

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
    public String[] getAlHira() { return this.alHira;}
    public String getAlHira(int n) { return this.alHira[n];}

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
    public String[] getAbc() { return this.abc;}
    public String getAbc(int n) { return this.abc[n];}

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
    public String[] getDakuAbc() { return this.dakuAbc;}
    public String getDakuAbc(int n) { return this.dakuAbc[n];}

    // ヒント用アルファベット 半濁音
    private final String[] handakuAbc = {
    		"pa","pi","pu","pe","po",
    		"pya","pyu","pyo"
            };
    public String[] getHandakuAbc() { return this.handakuAbc;}
    public String getHandakuAbc(int n) { return this.handakuAbc[n];}

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
    public String[] getAlAbc() {return this.alAbc;}
    public String getAlAbc(int n) {return this.alAbc[n];}

}