package practice_3;
/*
Создайте класс GameSettings с полями:
static int maxPlayers — общее ограничение игроков
final String gameName — название (нельзя менять)
int currentPlayers — сколько игроков в игре сейчас
Реализуйте конструктор,
статический метод setMaxPlayers(int),
метод addPlayer() — добавляет 1 игрока,
метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
 */

public class GameSettings {
    static int maxPlayers;

    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int maxPlayers) {
        GameSettings.maxPlayers = maxPlayers;
    }

    public int addPlayer(int playerCount) {
        return currentPlayers += playerCount;
    }

    public void printGameStatus(){
        System.out.println("Game Name: " + this.gameName);
        System.out.println("Current Players: " + this.currentPlayers);
        System.out.println("Max Players: " + this.maxPlayers);
    }

}
