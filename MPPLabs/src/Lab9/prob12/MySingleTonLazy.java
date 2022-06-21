package Lab9.prob12;

import java.util.Optional;

public class MySingleTonLazy {
    private static MySingleTonLazy instance = null;
    public static MySingleTonLazy getInstance() {
        instance = Optional.ofNullable(instance).orElseGet(MySingleTonLazy::new);
        return instance;
    }

    private MySingleTonLazy() {}
}
