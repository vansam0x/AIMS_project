package hust.soict.test.store;

import hust.soict.aims.disc.DigitalVideoDisc;
import hust.soict.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc disc1 = new DigitalVideoDisc("jack", "pop", "nuoi con 5tr", 5.0f);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("son tung mtp", "pop", "flop qua thi ghi ten anh vao", 100.0f);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("njz", "pop", "ditto", 2.5f);
        store.addDVD(disc1, disc2);
        store.removeDVD(disc3);
        store.addDVD(disc3);
    }
}

