public class Movie {
    String title;
    String director;
    int releaseYear;
    String genre;
    String language;
    double rating;
    int durationMinutes;
    String actor;
    
    public Movie(String title, String director, int releaseYear, String genre, String language, double rating, int durationMinutes, String actor) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.language = language;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.actor = actor;
    }
    
    public String getMovieDetails() {
        return "Title: " + title + "\nDirector: " + director + "\nGenre: " + genre;
    }
    
    public void playMovie() {
        System.out.println("Now playing: " + title);
    }
    
    public void printActorsList() {
        System.out.println("The movie's actor is" + actor);
        }
    }
