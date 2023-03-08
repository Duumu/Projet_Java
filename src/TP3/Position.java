package TP3;

public class Position {
    private String column;
    private int row;

    public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
