import java.util.Scanner;

public class CryptoCon {
    public static void main(String[] args) {
        //dette program er på dansk
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvad er dit navn?");
        String forNavn = scanner.nextLine();
        System.out.println("Hvad er dit efternavn?");
        String efterNavn = scanner.nextLine();

        String fuldtNavnMellemrum = forNavn+" "+efterNavn;
        String fuldtNavnUMellemrum = forNavn+efterNavn;
        System.out.println("Velkommen "+fuldtNavnMellemrum+"!");

        double vilkårligBogstav = Math.round(Math.random()*fuldtNavnUMellemrum.length());
        char vilkårligBogstavFraNavn = fuldtNavnUMellemrum.charAt( (int) vilkårligBogstav);
        System.out.println("her er et vilkårligt bogstav i dit navn "+ vilkårligBogstavFraNavn);
        System.out.println("Vi håber du er klar til at konvertere nogle dollars!");
        System.out.println("hvor mange dollars har du lyst til at konvertere i dag?");
        double AntalMønter = scanner.nextDouble();
        double bitCoin = (AntalMønter * 0.000020);
        double dogeCoin = (AntalMønter * 3.865673);
        double scamCoin = (AntalMønter * 100);
        double liteCoin = (AntalMønter * 0.0054);
        double ethereumCoin = (AntalMønter * 0.00027);
        // fra nicolas, taget fra 02-09-21
        System.out.println("her er hvad du kan få for "+AntalMønter+" dollars :)");
        System.out.println("Du kan få "+bitCoin+" bitCoin");
        System.out.println("Du kan få "+dogeCoin+" dogeCoin");
        System.out.println("Du kan få "+scamCoin+" scamCoin");
        System.out.println("Du kan få "+liteCoin+" liteCoin");
        System.out.println("Du kan få "+ethereumCoin+" ethereumCoin");
    }
}
