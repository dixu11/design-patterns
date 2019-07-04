package factory_method;

// używam interfejsu żebym mógł wprowadzać różne obiekty do tej samej referencji w argumencie metody utworzBD()
public interface BazaDanych {

    String przekazZapytanie(String zapytanie);
}
