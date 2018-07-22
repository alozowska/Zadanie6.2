public class Metoda {
    int x;
    int wynik;

    public int liczCyfry(int x, int wynik) {

        while (x != 0) {
            wynik = wynik + (x % 10);
            x = x / 10;
        }
        return wynik;
    }
}