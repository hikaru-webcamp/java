// // byte short int long

// class Hensu_byte {
//   public static void main(String[] args){
//     byte age; // byteで変数宣言

//     age = 52 - 128;
//     System.out.println("あなたは" + (age + 128 ) + "歳です");

//   }
// }

// class Hensu_short {
//   public static void main(String[] args){
//     short age; // byteで変数宣言

//     age = 300;
//     System.out.println("この木の樹齢は"  + age "歳です。" );
//   }
// }

class Hensyu_long{
  public static void main(String [] args){
    int age;
    long time;

    age = 52;

    time = age * 365 * 24 * 60 * 60;

    System.out.println("あなたが生まれてから" + age + "年経ちました");
    System.out.println("これを秒で表すと" + time + "秒です");
  }
}
