package chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Konfiguracja {

    // mapa idealnie nadaje się do trzymania par handlerów
    private final Map<Handler, Handler> handlers = new HashMap<>();
    private Handler firstHandler;

    // metoda pozwala połączyć ze sobą 2 wybrane handlery
    public void pairHandlers(Handler handler1, Handler handler2) {
        if (Objects.isNull(firstHandler)) {
            firstHandler = handler1;
        }
        handlers.put(handler1, handler2);
        handler1.connectToOtherHandler(handler2);
    }

    // gdybyśmy zgubili referencje do obiektu można łatwo zapytać konfugurację o pierwszy przygotowany handler
    public Handler getFirstHandler() {
        return firstHandler;
    }

}
