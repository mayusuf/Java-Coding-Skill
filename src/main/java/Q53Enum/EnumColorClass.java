package Q53Enum;

public enum EnumColorClass {
    RED, GREEN, BLUE, BROWN, YELLOW, ORANGE, PINK, PURPLE;

    private EnumColorClass(){
        System.out.println("Constructor Called for : " + this.toString());
    }

    public static void main(String[] args) {
        for(EnumColorClass enumColorClass : EnumColorClass.values()){
            System.out.println(enumColorClass);
        }
    }
}


