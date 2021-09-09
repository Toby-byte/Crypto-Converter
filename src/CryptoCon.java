import java.util.Scanner;

public class CryptoCon {
    public static boolean isNumberInName() {
        // Optional task 2 - User input validation
        Scanner scanner = new Scanner(System.in);
        //spørger bruger om navn og efternavn
        System.out.println("Hvad er dit navn?");
        String forNavn = scanner.nextLine();
        System.out.println("Hvad er dit efternavn?");
        String efterNavn = scanner.nextLine();
        //kombinere for og efternavn
        String fuldtNavnMellemrum = forNavn+" "+efterNavn;
        String fuldtNavnUMellemrum = forNavn+efterNavn;

        //if statement bruges til at tjekke om der er et tal i navnet
        // hvis der er vil programmet, returnere true og starter forfra
        //hvis der ikke er, vil programmet returnere false og forsætte
        if (fuldtNavnUMellemrum.contains("1")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("2")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("3")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("4")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("5")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("6")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("7")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("8")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("9")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else if (fuldtNavnUMellemrum.contains("0")) {
            System.out.println("Det er ikke et navn, venlig at skrive et gyldigt navn");
            return true;
        } else {
            System.out.println("Velkommen "+fuldtNavnMellemrum+"!");
            //finder et vilkårligt tal ud fra navnets længde
            double vilkårligBogstav = Math.round(Math.random()*fuldtNavnUMellemrum.length());
            //oversætter det fundne tal til et char i navnet
            char vilkårligBogstavFraNavn = fuldtNavnUMellemrum.charAt( (int) vilkårligBogstav);
            //bruger det vilkårlige bogstav i en string
            System.out.println("her er et vilkårligt bogstav i dit navn "+ "'"+vilkårligBogstavFraNavn+"'");
            return false;
        }
    }

    public static void MoneyConverter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vi håber du er klar til at konvertere nogle dollars!");
        System.out.println("hvor mange dollars har du lyst til at konvertere i dag?");

        // Optional task 1 - custom message
        // if statement tjekker hvilke værdier de indtastede dollars er mellem
        // og giver en tilsvarende værdi
        double AntalMønter = scanner.nextDouble();
        if (AntalMønter <= 10) {
            System.out.println(AntalMønter+" dollars, hvorfor ikke bruge mere?");
        } else if (AntalMønter > 10 && AntalMønter <= 40) {
            System.out.println(AntalMønter+" dollars nice!");
        } else if (AntalMønter > 40 && AntalMønter <= 100) {
            System.out.println(AntalMønter+" dollars wow, det er godt nok meget");
        }

        //Data er fra 02-09-21
        //udregner dollars til forskellige kryptovalutaer
        double bitCoin = (AntalMønter * 0.000020);
        double dogeCoin = (AntalMønter * 3.865673);
        double liteCoin = (AntalMønter * 0.0054);
        double ethereumCoin = (AntalMønter * 0.00027);

        System.out.println("\nher er hvad du kan få for "+AntalMønter+" dollars :)");
        System.out.println("Du kan få "+bitCoin+" bitCoin");
        System.out.println("Du kan få "+dogeCoin+" dogeCoin");
        System.out.println("Du kan få "+liteCoin+" liteCoin");
        System.out.println("Du kan få "+ethereumCoin+" ethereumCoin");
        // udregner sum og gennemsnit af kryptovaluta
        double coinSum = (bitCoin+dogeCoin+liteCoin+ethereumCoin);
        double coinGennemsnit = ((bitCoin+dogeCoin+liteCoin+ethereumCoin)/4);
        System.out.println("\nDet er "+coinSum+" mønter og gennemsnittet er "+coinGennemsnit);
    }

    public static void main(String[] args) {
        //dette program er på dansk
        boolean isInValid = isNumberInName();
        //bliver ved med at køre så længe der er et tal i brugers navn
        while (isInValid) {
            //hvis der ikke er et tal i brugers navn, giver vi isInValid en ny værdi af false
            //så den vil hoppe ud af loopet
            isInValid = isNumberInName();
        }
        // metoden MoneyConverter(); kører efter navnet er uden tal
        MoneyConverter();
    }
}
