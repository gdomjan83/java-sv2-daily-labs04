package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int releaseYear;
    private List<Actor> cast = new ArrayList<>();

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public void addActor(Actor actor) {
        cast.add(actor);
    }

    public int actorsInTheirTwenties() {
        int counting = 0;

        for (Actor actor : cast) {
            int ageAtRelease = releaseYear - actor.getYearOfBirth();
            if (20 <= ageAtRelease && ageAtRelease < 30) {
                counting++;
            }
        }

        return counting;
    }
}
