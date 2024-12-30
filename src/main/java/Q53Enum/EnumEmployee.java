package Q53Enum;

enum EnumEmployee {

    Mike(20,"khulna"), Lisa(18, "Dhaka"), John(22, "Chittagong");

    private final int age;
    private final String location;

    int getAge(){
        return age;
    }

    String getLocation(){
        return location;
    }

    private EnumEmployee(int age, String location){
        this.age = age;
        this.location = location;
//        System.out.println("Constructor Called : " + this.toString());
    }

    public static void main(String[] args) {
        for(EnumEmployee e : EnumEmployee.values()){
            System.out.println("Age:" + e.getAge() + " Location:" + e.getLocation());
        }

    }
}
