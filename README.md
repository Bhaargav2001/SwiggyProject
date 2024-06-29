PLAYER CLASS:
The Player class represents a player in the game with attributes for health, strength, and attack. It also includes methods for attacking, defending, and checking if the player is alive.

EXPLANATION OF PLAYER CLASS:
ATTRIBUTES USED: name, health, strength, and attack store the player's details. random is used to simulate dice rolls.
CONSTRUCTOR: Initializes the player with given attributes and a Random object.
METHODS:
getName(), getHealth(), and isAlive(): Getter methods to access player attributes and check if the player is still alive.
attack(Player opponent): Simulates an attack on the opponent by rolling a die and calculating damage.
defend(int attackDamage): Simulates defending against an attack by rolling a die, calculating defense power, and updating health based on damage taken.

MAGICALARENA CLASS:
The MagicalArena class contains the battle logic, where two players take turns attacking each other until one of them dies.

EXPLANATION OF MAGICALARENA CLASS:
battle(Player player1, Player player2): This method handles the battle logic:
Players are sorted based on health to determine who attacks first.
The players take turns attacking and defending until one player's health reaches 0.
The method prints the results of each attack and defense, and declares the winner.
public static void main(String[] args): Sets up two players and initiates the battle.

UNIT TESTING WITH JUNIT:
To test the functionality we use JUnit. The following unit test case classes need to be created and executed: PlayerTest.java and MagicalArenaTest.java

EXPLANATION OF JUNIT TEST CASES(PlayerTest.java class):
setUp(): Initializes players before each test.
testPlayerCreation(): Checks if player attributes are set correctly.
testPlayerAlive(): Verifies the isAlive() method by simulating damage.
testAttackAndDefend(): Tests if attacking and defending correctly adjust health values.

EXPLANATION OF JUNIT TEST CASES(MagicalArenaTest.java class):
setUp(): Initializes players before each test.
testBattle(): Tests the battle() method to ensure the game ends with one player defeated.

This functionality and steps involved is enough to describe the behaviour of both the classes Player and MagicalArena.
To run the code please run the MagicalArena class on any editor and the game between player A and player B is displayed clearly in the output.



