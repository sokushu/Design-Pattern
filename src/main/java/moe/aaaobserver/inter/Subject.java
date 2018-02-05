package moe.aaaobserver.inter;

/**
 * Subject
 */
public interface Subject {
    public void registerObserver(Observers o);
    public void removeObserver(Observers o);
    public void notifyObserver();
}