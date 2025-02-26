package Videos;

public class Video {
    private final String code;
    private String name;
    private double duration;
    private int likes;
    private boolean isForKids;
    private double maxDuration = 10; // Локална променлива за ограничаване на продължителността
    public static final double MAX_FINAL_DURATION = 10; // Константа

    // Основен конструктор
    public Video(String code, String name, double duration, int likes, boolean isForKids) {
        this.code = code;
        this.name = name;
        this.duration = duration;
        this.likes = likes;
        this.isForKids = isForKids;
    }

    // Конструктор с три параметъра
    public Video(String code, String name, double duration) {
        this(code, name, duration, 0, false); // Извикване на главния конструктор
    }

    // Конструктор с един параметър
    public Video(String code) {
        this(code, "Unknown", 0.0); // Използва другия конструктор
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isForKids() {
        return isForKids;
    }

    public void setForKids(boolean forKids) {
        this.isForKids = forKids;
    }

    public double getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(double maxDuration) {
        this.maxDuration = maxDuration;
    }

    @Override
    public String toString() {
        return "Video{" +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", likes=" + likes +
                ", isForKids=" + isForKids +
                '}';
    }
}
