package task5;

class Song {
    String title;
    int playCount;

    public Song(String title, int playCount) {
        this.title = title;
        this.playCount = playCount;
    }

    @Override
    public String toString() {
        return title + " (Прослушано: " + playCount + ")";
    }
}