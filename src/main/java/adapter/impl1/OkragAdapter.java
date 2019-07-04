package adapter.impl1;

// adapter musi rozszerzac Figure zeby mozliwe było zastosowanie polimorfizmu
public class OkragAdapter extends Figura {

// dzieki polu XXOkrag mam dostęp do metod niekompatybilnego okregu
XXOkrag okrag;

public OkragAdapter(XXOkrag okrag) {
    this.okrag = okrag;
}

// dostosowuje wszystkie nazwy metod tak aby pasowaly do klasy nadrzednej ale dzialy
// dokladnie tak jak zostalo to napisane w klasie XXOkrag
public void pobierzPolozenie() {
okrag.pobierzPolozenie();
}

public void nadajPolozenie() {
okrag.nadajPolozenie();
}

public void wyswietl() {
okrag.wyswietlaj();
}

public void wypelnij() {
okrag.wypelniaj();
}

public void nadajKolor() {
okrag.ustawKolor();
}

public void usun() {
okrag.usuwaj();
}
}
