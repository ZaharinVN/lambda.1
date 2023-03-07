class MainActivity {
    public static void main(String[] args) {
        // вывод на консоль должен быть startMonitoring: "Наблюдение за {name} началось в {time}"

        WindmillSystemsStateObserver recuperationSystemModuleObserver = (name, time) ->  System.out.println("Наблюдение за " + name + " началось в " + time); // ваши инициализации тут
        WindmillSystemsStateObserver generatorSystemModuleObserver  = (name, time) ->  System.out.println("Наблюдение за " + name + " началось в " + time); // ваши инициализации тут
        WindmillSystemsStateObserver bladesSystemModuleObserver = (name, time) ->  System.out.println("Наблюдение за " + name + " началось в " + time); // ваши инициализации тут

        recuperationSystemModuleObserver.startMonitoring ("системой рекуперации", "14:00");  // тут ваши правки по вызову startMonitoring  аргументами name="системой рекуперации" time="14:00"
        generatorSystemModuleObserver.startMonitoring ("системой генератора", "15:00");  // тут ваши правки по вызову startMonitoring  аргументами name="системой генератора", time="15:00"
        bladesSystemModuleObserver.startMonitoring ("системой лопастей", "16:00");  // тут ваши правки по вызову startMonitoring  аргументами name="системой лопастей",  time="16:00"
    }
}
@FunctionalInterface
interface WindmillSystemsStateObserver {
    void startMonitoring(String name, String time);
}