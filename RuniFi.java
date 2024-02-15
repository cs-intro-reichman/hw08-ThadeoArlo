class RuniFi {
    public static void main(String[] args) {
        PlayList myList = new PlayList(10);
        Track track1 = new Track("Fernando", "ABBA", 354);
        Track track2 = new Track("Imagine", "John Lennon", 187);
        Track track3 = new Track("Creep", "Radiohead", 369);
        Track track4 = new Track("Thriller", "Michael Jackson", 222);
        Track track5 = new Track("Yesterday", "The Beatles", 125);
        System.out.println("Adding tracks...");
        myList.add(track1);
        myList.add(track2);
        myList.add(track3);
        myList.add(track4);
        display("My list", myList);
        System.out.println("\nTotal time duration of my list (in seconds):" + myList.totalDuration());
        myList.add(1, track5);
        display("After adding Yesterday at location 1", myList);
        System.out.println("\nIndex of Creep: " + myList.indexOf("Creep"));
        System.out.println("\nIndex of Shake It Off: " + myList.indexOf("Shake It Off"));
        myList.remove(2);
        display("After removing the track in location 2", myList);
        myList.removeFirst();
        display("After removing the first track", myList);
        myList.removeLast();
        display("After removing the last track", myList);

        PlayList newList = new PlayList(10);
        newList.add(new Track("Believe", "Cher", 240));
        newList.add(new Track("Yellow", "Coldplay", 269));
        newList.add(new Track("Shallow", "Lady Gaga", 217));
        newList.add(new Track("Woman", "Doja Cat", 172));
        display("New list", newList);
        newList.remove("Yellow");
        display("New list after removing Yellow:", newList);
        myList.add(newList);
        display("My list after merging with new list", myList);
        System.out.println("\nThe shortest track in my list is " + myList.titleOfShortestTrack());
        myList.sortedInPlace();
        display("My list after sorting by increasing duration", myList);
    }
    private static void display(String str, PlayList list) {
        System.out.println("\n" + str + ":" + list);
    }
}
