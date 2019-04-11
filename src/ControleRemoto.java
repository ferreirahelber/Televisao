public class ControleRemoto {

       public int aumentaCanal, aumentaVolume, novoCanal, novoVolume;


        public ControleRemoto(int novoCanal, int novoVolume) {
            this.aumentaCanal   = novoCanal;
            this.aumentaVolume  = novoVolume;
        }

        public int (){
            return this.aumentaCanal
        }

        public int (){
            return this.aumentaVolume
        }

        public void (int novoVolume){
            if((novoVolume>=1)||(novoVolume<=200)){
                this.aumentaCanal = novoCanal}
        }


        public void mudaCanal(int novoCanal){
            if(novoCanal==1){

                if(this.aumentaCanal<200){
                    this.aumentaCanal+=1}

                else{
                    this.aumentaCanal=1}
            }

            else {

                if(this.aumentaCanal>1){
                    this.aumentaCanal-=1;}

                else{
                    this.aumentaCanal=200;}
            }
        }

        public void mudaVolume(int novoVolume){

            if(novoVolume==1){

                if(this.aumentaVolume<100){
                    this.aumentaVolume++;}
            }

            else{

                if(this.aumentaVolume>0){
                    this.aumentaVolume--;}
            }
        }
