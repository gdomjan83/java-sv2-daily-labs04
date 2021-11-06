package day04;

public class Passanger {
    private String name;
    private String idCard;
    private int luggage;

    public Passanger(String name, String idCard, int luggage) {
        this.name = name;
        this.idCard = idCard;
        this.luggage = luggage;
    }

    public int getLuggage() {
        return luggage;
    }
}
