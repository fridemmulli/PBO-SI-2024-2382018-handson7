
package abstraksiv2;

public class Printer implements cetak {
    @Override
    public void print() {
        System.out.println("Mencetak....");
    }

    @Override
    public void scan() {
        System.out.println("Memindai....");
    }
}
