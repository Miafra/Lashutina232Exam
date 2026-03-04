package task5;

import java.util.ArrayList;

class Playlist {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(String title) {
        songs.add(new Song(title, 0));
    }

    public void playTrack(int index) {
        if (index >= 0 && index < songs.size()) {
            Song selected = songs.get(index);
            selected.playCount++;
            System.out.println("\nсейчас играет: " + selected.title);
            cleanup();
        } else {
            System.out.println("неверный номер трека");
        }
    }

    public void cleanup() {
        ArrayList<Song> filteredList = new ArrayList<>();
        for (Song current : songs) {
            if (current.playCount <= 1) {
                boolean isDuplicate = false;
                for (Song s : filteredList) {
                    if (s.title.equalsIgnoreCase(current.title)) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) filteredList.add(current);
            }
        }
        this.songs = filteredList;
    }

    public void display() {
        if (songs.isEmpty()) {
            System.out.println("\nплейлист пуст");
            return;
        }
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    public int getSize() { return songs.size(); }
}
