package check;

public class Pet {

    private String name;
    /*
     * アクセス修飾子がprivateのString型フィールド変数(データ)nameを宣言。
     */
    private String masterName;
    /*
     * アクセス修飾子がprivateのString型フィールド変数(データ)masterNameを宣言。
     */

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
        /*
         * コンストラクタPetを作成。(class名とコンストラクタ名は同じ)
         * コンストラクタには戻り値がない。
         * このコンストラクタは引数がString NameとString masterName
         * 同じクラス内にあるさっき宣言したname、引数のnameは同じということを表すために this.name = name;
         */
    }

    protected String getName() {
        return name;
    }
    /*
     * getNameメソッド。
     * 返り値がname
     */

    protected String getMasterName() {
        return masterName;
    }
    /*
     * getMasterNameメソッド
     * 返り値masterName
     */

    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
    /*
     * introduceメソッド
     * 
     */
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    @Override
	public void introduce() {
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}