public class Hangar {

    public static void main(String[] args) {
            
        Car Golf = new Car ("Volkswagen", 170);
        Boat AndreaDoria = new Boat ("Passagierschiff", 48);
        Boat QueenElizabeth = new Boat ("Ozeandampfer", 60);
        Boat Esmeralda = new Boat ("Segelboot", 12);
        Car Ascona = new Car ("Opel", 132);
        Car Taunus = new Car ("Ford", 145);

        System.out.println(Golf.doStuff());    
        System.out.println(AndreaDoria.doStuff());
        System.out.println(QueenElizabeth.doStuff());
        System.out.println(Esmeralda.doStuff());
        System.out.println(Ascona.doStuff());
        System.out.println(Taunus.doStuff());

    }
}
