public class SimpleArray {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Edward";
        name[1] = "Zenon";
        name[2] = "Henryk";
        name[3] = "Danuta";
        name[4] = "Hanna";

        String indeks = name[3];
        System.out.println("do tablicy : " + indeks);
        int numberOfElements = name.length;
        System.out.println("Moja tablica zawiera: " + numberOfElements + " elementow");
    }
}