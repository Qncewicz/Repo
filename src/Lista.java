public class Lista {
    private int[] tablica;
    private int front, rear, rozmiar, pojemnosc;

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        this.tablica = new int[pojemnosc];
        this.rear = this.rozmiar = 0;
    }

    public boolean enqueue(int x) {
        // TODO: Dodaj x na koniec (rear),
        // Zwróć false jeśli pełna (rozmiar == pojemnosc)
        if (isFull()) {
            System.out.println("Kolejka jest pełna");
            return false;
        }
        else {
            tablica[rear + 1] = x;
            rear++;
            return true;
        }
    }

    public Object dequeue() {
        // Zwróć -1 jeśli pusta (rozmiar == 0)
        if(rear == 0) {
            return -1;
        }
        else{
            int wartosc = tablica[0];
            for (int i = 1; i < tablica.length; i++) {
                tablica[i-1] = tablica[i];

            }return wartosc;
        }
    }
 //obsluga tych dwoch klas

    public int size() { return rozmiar; }
    public boolean isEmpty() { return rozmiar == 0; }
    public boolean isFull() { return rozmiar == pojemnosc; }
}
