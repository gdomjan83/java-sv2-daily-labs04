package day01;

public class MovieMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Viggo Mortense", 1965);
        Actor actor2 = new Actor("Elijah Wood", 1980);
        Actor actor3 = new Actor("Sean Bean", 1970);
        Actor actor4 = new Actor("Ian McKellen", 1940);
        Actor actor5 = new Actor("Dominic Moneghem", 1985);

        Movie movie = new Movie("The Lord of the Rings", 2008);

        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        movie.addActor(actor4);
        movie.addActor(actor5);

        System.out.println("20-as éveikben lévő színészek száma: " + movie.actorsInTheirTwenties());
    }
}
