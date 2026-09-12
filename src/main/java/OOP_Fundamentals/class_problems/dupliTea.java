import java.util.Scanner;

public class  dupliTea {

    static String findDuplicateTeam(String[] teamNames) {

        // Compare every name with the names after it
        for (int i = 0; i < teamNames.length; i++) {

            for (int j = i + 1; j < teamNames.length; j++) {

                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }

        return "No Duplicates Found";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of team names: ");
        int n = sc.nextInt();

        String[] teamNames = new String[n];

        System.out.println("Enter team names:");

        for (int i = 0; i < n; i++) {
            teamNames[i] = sc.next();
        }

        String result = findDuplicateTeam(teamNames);

        System.out.println(result);

        sc.close();
    }
}