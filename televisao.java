public class televisao{
    String Marca;
    int TamanhoTela, canal, volume;
    boolean ligada;

    void power() {
        ligada = !ligada;

            if (ligada == true) {
                System.out.println ("\nA Televisao da marca " + Marca + " esta ligada agora.");
            } else {
                System.out.println ("\nA Televisao da marca " + Marca + " esta desligada agora.");
            }
    }

void mute() {
    if (ligada == true) {

        volume = 0;
        System.out.println ("\n" + Marca + ": VOLUME --> 0");
        //System.out.println ("\nO som da televisao" +  marca + "está mudo!");

    }
}

void alteravolume(int mm) {
    //0 diminui
    //1 aumenta
    if (ligada == true) {

        if (volume > 0 || volume <10 ) {
            switch (mm) {
                case 0:
                    volume --;
                    break;
                case 1:
                    volume ++;
                    break;
            }
        }

        if (volume == 0 || volume == 10) {
            switch (mm) {
                case 0:
                    if (volume == 10) { 
                        volume --; 
                        break;
                    }
                    else break;
                case 1:
                    if (volume == 0) {
                        volume ++;
                        break;
                    }
                    else break;
            }
        }        
        System.out.println ("\n" + Marca + ": VOLUME --> " + volume);
        }


    }

    void alteracanal (int mm) {
        //0 diminui
        //1 aumenta

        if (ligada == false) { return; }

        if (canal != 1 && canal != 99) {

            System.out.println("\nDBGA" + canal);
            System.out.println("\nDBGB" + mm);

            switch (mm) {
                case 0:
                    if (canal == 1) {
                        break;
                    } else { canal --;}
                case 1:
                    if (canal == 99) {
                        break;
                    } else { canal ++;}
                    break;
            }

        }

        System.out.println ("\n" + Marca + ": CANAL --> " + canal);
    }

}
