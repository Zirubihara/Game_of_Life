class Army {

    public static void createArmy() {
        // Implement this method
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        Unit janek1 = new Unit("Janek całujący plecki");
        Unit janek2 = new Unit("Janek całujący st00pki");
        Unit janek3 = new Unit("Janek całujący piersi");
        Unit janek4 = new Unit("Janek całujący szyje");
        Unit janek5 = new Unit("Janek całujący uda");
        Knight czarnyRycerz1 = new Knight("Czarny rycerz 21");
        Knight czarnyRycerz2 = new Knight("Czarny rycerz 23");
        Knight czarnyRycerz3 = new Knight("Czarny rycerz 20");
        General wielkiGeneral = new General("Olbrzymi general");
        Doctor kanek = new Doctor("Cuckhold klatak kanek");
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
