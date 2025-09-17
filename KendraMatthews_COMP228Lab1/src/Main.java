public class Main {
    public static void main(String[] args) {
        Singers singer1 = new Singers();
        Singers singer2 = new Singers();
        System.out.println("");
        System.out.println("Original Values");
        singer1.Displaysingerinfo();
        System.out.println("----------------------");

        System.out.println("");
        System.out.println("Updated Values");
        singer1.Setname("Ariana Grande");
        singer1.Setaddress("402 Ridgebury Drive");
        singer1.Setalbums(43);
        singer1.Setid(493824);
        singer1.Setbirthdate("04-12-94");

        System.out.println("");
        System.out.println("----------------------");
        singer2.Setname("Taylor Swift");
        singer2.Setaddress("435 Mary Lane");
        singer2.Setalbums(82);
        singer1.Setbirthdate("02-03-90");



        singer1.Displaysingerinfo();
        singer2.Displaysingerinfo();
    }
}


