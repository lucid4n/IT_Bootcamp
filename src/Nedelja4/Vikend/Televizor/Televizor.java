package Nedelja4.Vikend.Televizor;

public class Televizor {
        int jacinaTona = 0;
        int trenutniProgram = 1;
        boolean ukljucen = false;
        void ukljuci(){
            ukljucen = true;
        }
        void iskljuci(){
            ukljucen = false;
        }
        void pojacajTon(){
            jacinaTona = jacinaTona + 1;
        }
        void smanjiTon(){
            jacinaTona = jacinaTona - 1;
        }
        void iskljuciTon(){
            jacinaTona = 0;
        }
        public void programNavise(){
            this.trenutniProgram ++;
        }
        public void programNanize(){
            this.trenutniProgram --;
        }
        public int vratiTrenutniProgram(){
            return this.trenutniProgram;
        }

        public String ispisiParametre() {
            String parametri = (ukljucen) ?  ("Тренутни програм: " + trenutniProgram + "\nЈачина тона: " + jacinaTona) : "Телевизор је искљључен";
            return parametri;
        }
    }

