// class Himanritu1{
//   public static void main(String[] args){
//     double height,weight,fat;

//     height = 1.75;
//     weight = 22 * height * height;
//     fat = (100 - weight) / weight * 100;

//     System.out.println("あなたの肥満率は" + (int)fat + "%です");

//     if (fat >= 20){
//       System.out.println("あなたは太り過ぎです");
//     }
//   }
// }

// booleanをつかった変数

// class Himanritu1{
//   public static void main(String[] args){
//     double height,weight,fat;
//     boolean judge;

//     judge = false;
//     height = 1.75;
//     weight = 22 * height * height;
//     fat = (100 - weight) / weight * 100;

//     System.out.println("あなたの肥満率は" + (int)fat + "%です");

//     if (fat >= 20){
//       judge = true;
//     }
//     if(judge == true){
//       System.out.println("あなたは太り過ぎです");
//     }

//   }
// }

// class Himanritu1{
//   public static void main(String[] args){
//     double height,weight,fat;
//     boolean judge;

//     judge = false;
//     height = 1.75;
//     weight = 22 * height * height;
//     fat = (100 - weight) / weight * 100;

//     System.out.println("あなたの肥満率は" + (int)fat + "%です");

//     if (fat >= 20){
//       judge = true;
//     }
//     if (fat <= -10){
//       System.out.println("あなたは痩せすぎ");
//     }
//     if(judge == true){
//       System.out.println("あなたは太り過ぎです");
//     }

//   }
// }

// class Himanritu1{
//   public static void main(String[] args){
//     double height,weight,fat;
//     boolean judge;

//     judge = false;
//     height = 1.75;
//     weight = 22 * height * height;
//     fat = (100 - weight) / weight * 100;

//     System.out.println("あなたの肥満率は" + (int)fat + "%です");

//     if (fat >= 20){
//       System.out.println("あなたは太り過ぎです");
//     } else if(fat <= -10) {
//       System.out.println("あなたは痩せすぎ");
//     } else {
//       System.out.println("あなたは普通です")；
//     }
//   }
// }

// class Bunki1 {
//   public static void main(String[] args){
//     int a = 1;
//     switch (a) {
//       case 1:  System.out.println("Good morning");
//       break;
//       case 2:  System.out.println("Good afternoon");
//       break;
//       case 3:  System.out.println("Good evening");
//       break;
//     }

//   }
// }

// #アロー構文だとbreak必要なくなる
// class Bunki1 {
//   public static void main(String[] args){
//     int a = 1;

//     String message = switch (a) {
//       case 1: yield  "Good morinig";
//       case 2: yield  "GOOD a";
//       case 3: yield  "GOOD b";
//       default: yield  "Goodn";
//     };

//   System.out.println(message);

//   }
// }

class Bunki6 {
  public static void main(String[] args) {
    int a = 1;

    String message = switch(a) {
      case 1: yield "Good morning.";
      case 2: yield "Good afternoon";
      case 3: yield "Good evening";
      default: yield  "Good evening";
    };

    System.out.println(message);
  }

}
