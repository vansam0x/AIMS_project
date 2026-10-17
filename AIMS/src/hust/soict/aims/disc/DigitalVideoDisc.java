package hust.soict.aims.disc;

/**
 * DigitalVideoDisc
 */
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDisc = 0;
    private int id;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public  DigitalVideoDisc() {

    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        this.id = nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title) {
        this.id = nbDigitalVideoDisc++;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = nbDigitalVideoDisc++;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = nbDigitalVideoDisc++;
    }

    public void getInfo() {
        System.out.println("===========" + this.title + "===========");
        System.out.println("Category: " + this.category);
        System.out.println("Director: " + this.director);
        System.out.println("Length: " + this.length);
        System.out.println("Price: " + this.cost);
    }

    public boolean isMatch(String title) {
        return this.title.equals(title) == true;
    }

    @Override

    public String toString() {
        return "[" + this.id + "]"
        + "[" + this.title + "]"
        + "[" + this.category+ "]"
        + "[" + this.director + "]"
        + "[" + this.length + "]";
    }

}
