package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Введите название песни #" + i + ": ");
            String name = scanner.nextLine();
            myPlaylist.addSong(name);
        }

        myPlaylist.cleanup();

        while (myPlaylist.getSize() > 0) {
            System.out.println("\nплейлист");
            myPlaylist.display();

            System.out.print("\nвведите номер трека, чтобы послушать: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                myPlaylist.playTrack(choice - 1);
            } else {
                System.out.println("введите цифру");
                scanner.next();
            }
        }

        System.out.println("\nВсе треки прослушаны");
    }
}