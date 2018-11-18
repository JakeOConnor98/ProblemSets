public class Film {
    private String title;
    private String director;
    private int duration;
    private static int counter;

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Film(){
        this("Unknown","Unknown", 0);

    }

    public Film(String title, String director, int duration){
        setDirector(director);
        setTitle(title);
        setDuration(duration);
        counter++;
        //this(director,title,duration);
    }

    public String toString(){
        return "\n\nTitle:" + getTitle() + "\n\nDirector:" + getDirector() + "\n\nDuration" + getDuration();
    }
}
