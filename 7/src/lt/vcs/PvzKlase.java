package lt.vcs;

class PvzKlase<T extends File> {
    private T reiksme;

    public PvzKlase(T arg) {
        reiksme = arg;
    }

    public T getReiksme() {
        return reiksme;
    }
}
