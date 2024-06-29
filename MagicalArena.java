public class MagicalArena {
    public static void battle(Player player1, Player player2) {
        Player[] players = {player1, player2};

        // Sort players by health to determine who attacks first
        if (player1.getHealth() > player2.getHealth()) {
            players[0] = player2;
            players[1] = player1;
        }

        while (player1.isAlive() && player2.isAlive()) {
            Player attacker = players[0];
            Player defender = players[1];
            
            System.out.println("\n" + attacker.getName() + " attacks " + defender.getName());
            attacker.attack(defender);
            
            if (!defender.isAlive()) {
                System.out.println("\n" + defender.getName() + " has been defeated!");
                break;
            }

            // Swap roles
            Player temp = players[0];
            players[0] = players[1];
            players[1] = temp;

            attacker = players[0];
            defender = players[1];
            
            System.out.println("\n" + attacker.getName() + " attacks " + defender.getName());
            attacker.attack(defender);
            
            if (!attacker.isAlive()) {
                System.out.println("\n" + attacker.getName() + " has been defeated!");
                break;
            }

            // Swap roles back
            temp = players[0];
            players[0] = players[1];
            players[1] = temp;
        }

        Player winner = player1.isAlive() ? player1 : player2;
        System.out.println("\nThe winner is " + winner.getName() + "!");
    }

    public static void main(String[] args) {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        battle(playerA, playerB);
    }
}
