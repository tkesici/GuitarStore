public class GuitarStoreTestDriver_v2 {
    public static void main(String[] args) {

        GuitarStore store = new IstanbulGuitarStore();
        AIEmployee aiEmployee = AIEmployee.getEmployee();

        Guitar guitar = null;
        boolean dislike = true;


        aiEmployee.greeting();
        while(dislike){
            guitar = store.playGuitar(aiEmployee.choice());
            dislike = aiEmployee.decision();
        }
        System.out.println(guitar.cost());


/*        System.out.print("AI Employee: Great! Would you like to have a hardcase(200$) " +
                "or softcase(100$) for your guitar? ");
        String guitarcase = in.next();
        switch (guitarcase.charAt(0)) {
            case ('h'):
                System.out.println("+200$");
            case ('s'):
                System.out.println("+100$");
            default:
                System.out.println("+0$");

        }*/
    }

}
