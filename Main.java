public class Main {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Albrecht Dürer");

        ArtWork artwork1 = new ArtWork("Night Watch", 1954, artist1);

        System.out.println("Original Artwork Details:");
        artwork1.displayInformation();
        System.out.println();

        ArtWork shallowCopy = artwork1.shallowCopy();
        ArtWork deepCopy = artwork1.deepCopy();

        artwork1.getArtist().setName(" Rembrandt");

        System.out.println("Original Artwork After Changing Artist Name:");
        artwork1.displayInformation();
        System.out.println();

        System.out.println("Shallow Copy Details (After Artist Name Change):");
        shallowCopy.displayInformation();
        System.out.println();

        System.out.println("Deep Copy Details (After Artist Name Change):");
        deepCopy.displayInformation();
        System.out.println();
    }
}
