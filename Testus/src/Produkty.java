public class Produkty {
        private String name;
        private int cena;
        private int pocet;

        public Produkty(String name, int cena, int pocet) {
            this.name = name;
            this.cena = cena;
            this.pocet = pocet;

        }


    public void setPocet(int pocet){
            this.pocet = pocet;
        }
        public int getPocet(){
            return pocet;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCena() {
            return cena;
        }

        public void setCena(int cena) {
            this.cena = cena;
        }


        @Override
        public String toString() {
            return name + ":\n" +
                    "cena=" + cena + "\n";
        }
    }
